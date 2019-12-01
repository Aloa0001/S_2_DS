package task_3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackWithTwoQueues<E> {

    private Queue<E> store;
    private Queue<E> manipulate;
    /**
     * Constructor
     */
    public StackWithTwoQueues() {
        this.store = new LinkedList<>();
        this.manipulate = new LinkedList<>();
    }
    /**
     * Adds an element to the Stack
     */
    public void push(E data) {
        store.add(data);
    }
    /**
     * Returns the top element of the stack, removing it
     */
    public E pop() {
        if (store.isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            while (store.size() > 1) {
                manipulate.add(store.poll());
            }
            E temp = store.poll();
            while (!manipulate.isEmpty()) {
                store.add(manipulate.poll());
            }
            return temp;
        }
    }
    /**
     * Returns the top element of the stack, removing it
     * if stack is empty, throws NoSuckElementException
     */
    public E remove() throws NoSuchElementException {
        if (store.isEmpty()) {
            return (E) new NoSuchElementException();
        } else {
            while (store.size() > 1) {
                manipulate.add(store.poll());
            }
            E temp = store.poll();
            while (!manipulate.isEmpty()) {
                store.add(manipulate.poll());
            }
            return temp;
        }
    }
    /**
     * Returns the number of elements in the stack
     */
    public int size() {
        return store.size();
    }
    /**
     * Returns true if the stack has no elements
     * or false if it does
     */
    public boolean isEmpty() {
        return store.size() < 1;
    }
    /**
     * Returns the top of the stack
     * without removing the top element
     */
    public E peek() {
        if (store.isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            while (store.size() > 1) {
                manipulate.add(store.poll());
            }
            E temp = store.peek();
            manipulate.add(store.poll());
            while (!manipulate.isEmpty()) {
                store.add(manipulate.poll());
            }
            return temp;
        }
    }
    /**
     * Returns a string representation of the Stack
     */
    public String toString() {
        return Arrays.deepToString(store.toArray());

    }

}

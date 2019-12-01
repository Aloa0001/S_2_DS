package task_3;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackWithOneQueue<E> {

    private Queue<E> store;

    /**
     * Constructor
     */
    public StackWithOneQueue() {
        this.store = new LinkedList<>();
    }

    /**
     * Adds an element to the Stack
     */
    public void push(E data) {
        store.add(data);
        int size = store.size() - 1;
        for (int i = 0; i < size; i++) {
            E temp = store.poll();
            store.add(temp);
        }
    }

    /**
     * Returns the top element of the stack, removing it
     */
    public E pop() {
        if (store.isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            return store.poll();
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
            return store.poll();
        }
    }

    /**
     * removes all elements of the stack
     */
    public void makeEmpty(){
        //This method removes all elements of the queue
        while(store.size() > 0) {
            store.poll();
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
            return null;
        } else {
            return store.peek();
        }
    }
}

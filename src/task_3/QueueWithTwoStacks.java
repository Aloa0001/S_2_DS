package task_3;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueWithTwoStacks<E> {

    private Stack<E> store;
    private Stack<E> manipulate;

    /**
     * constructor
     */
    public QueueWithTwoStacks() {
        store = new Stack<>();
        manipulate = new Stack<>();
    }

    /**
     * add new element to the stack
     */
    public void add(E data) {
        store.push(data);
    }

    /**
     * return first element value
     * without removing it
     */
    public E peek() {
        //This method is used to view the head of queue without removing it.
        // It returns Null if the queue is empty.
        if (store.isEmpty()) {
            return null;
        } else {
            while (!store.isEmpty()) {
                manipulate.push(store.pop());
            }
            E tmp = manipulate.peek();
            while (!manipulate.isEmpty()) {
                store.push(manipulate.pop());
            }
            return tmp;
        }
    }

    /**
     * return first element value removing it
     */
    public E poll() {
        //This method removes and returns the head of the queue.
        // It returns null if the queue is empty.
        if (store.isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            while (!store.isEmpty()) {
                manipulate.push(store.pop());
            }
            E tmp = manipulate.pop();
            while (!manipulate.isEmpty()) {
                store.push(manipulate.pop());
            }
            return tmp;
        }
    }

    /**
     * return first element value removing it
     */
    public E remove() throws NoSuchElementException {
        //This method removes and returns the head of the queue.
        // It throws NoSuchElementException if the queue is empty.
        if (store.isEmpty()) {
            return (E) new NoSuchElementException();
        } else {
            while (!store.isEmpty()) {
                manipulate.push(store.pop());
            }
            E tmp = manipulate.pop();
            while (!manipulate.isEmpty()) {
                store.push(manipulate.pop());
            }
            return tmp;
        }
    }

    /**
     * return the number of elements in the queue
     */
    public int size() {
        // returns the nbr of elements
        return store.size();
    }

    /**
     * return true if the queue has elements
     * returns false if the queue is empty
     */
    public boolean isEmpty() {
        if (store.size() < 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * returns a string with all elements
     * separated by a coma and a space
     */
    public String toString() {
        return Arrays.deepToString(store.toArray());
    }
}

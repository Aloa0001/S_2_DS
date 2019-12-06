package task_2;

public class MyLinkedList<E>  {
    private Node<E> head;
    private Node<E> tail;
    private int currentSize;

    /**
     * Constructor
     */
    public MyLinkedList() {
        head = tail = null;
        currentSize = 0;
    }

    /**
     * Node inner class
     * @param <T> generic type
     */
    class Node<T> {
        T data; // the stored data
        Node<T> next;// pointer to next

        /**
         * Node constructor
         * @param obj used to create a new node
         *            with no position assigned
         */
        public Node(T obj) {
            data = obj;
            next = null;
        }
    }

    /**
     * Adding a new node to a linked list
     *Complexity O(1)
     * @param obj is the data stored in the node
     */
    public void addFirst(E obj) {
        Node<E> node = new Node(obj); // creates the node
        if(head == null){ // list empty
            head = node;
            tail = node;
            currentSize++;
            return;
        }
        node.next = head;// link new node to the previous "first" node
        head = node; // update head
        currentSize++; // update size
    }

    /**
     * AddingFirst to a linked list
     * complexity O(1)
     */
    public void addLast(E obj) {
        Node<E> node = new Node<>(obj);
        if (head == null) { // empty list
            head = tail = node;
        }else {
            tail.next = node; // add after the last
            tail = node; // update tail
        }
        currentSize++; // update size
    }

    /**
     * return the current size
     * @return size
     */
    public int size(){
        return currentSize;
    }

    /**
     * get data from index
     * @param index to get from
     * @return node.data
     */
    public E get(int index){
        Node<E> current = head; // used for index == 0 | to start from
        for (int i = 1; i <= index; i++){ // skip if index == 0
            current = current.next; // move node by node to index
        }
        return current.data;
    }

    /**
     * remove object at index
     * @param index to remove from
     */
    public void remove(int index){
        Node<E> current = head;
        for (int i = 1; i <= index; i++){ // move node by node to index
            current = current.next;
        }
        remove(current.data); // get data and cal remove(E obj) to do the rest
    }

    /**
     * remove first from a linked list
     * @return removed element or null if the linked list is empty
     */
    public E removeFirst(){
        if(head == null){ // no nodes
            return null;
        }
        E temp = head.data;
        if(head == tail){ // only one node
            head = tail = null; // update the list
        }else{
            head = head.next; // move head to next
        }
        currentSize--;
        return temp;
    }


    /**
     * removes last from the list
     * @return removed element or null if the linked list is empty
     */
    public E removeLast(){
        if(head == null){ // list is empty
            return null;
        }
        if(head == tail){ // list has only one node
            return removeFirst();
        }
        Node<E> current = head, previous = null; // temporarily pointers
        while(current!=tail){ // iterate through all list
            //delete connections to current so it can be garbage collected
            previous = current; // link current.previous to previous
            current = current.next; // delete current
        }
        previous.next = null; // previous becomes the new tail
        // update linked list
        tail = previous;
        currentSize--;

        return current.data;
    }

    /**
     * remove an object from a linked list
     * @param obj to be removed
     * @return obj removed
     */
    public E remove(E obj){
        Node<E> current = head, previous = null;// temporarily pointers
        while(current != null){ // iterate through all nodes
            if (((Comparable<E>)obj).compareTo(current.data) == 0){ // if obj is the current
                if(current == head){ // if the list has only one node
                    return removeFirst();
                }
                if(current == tail){ // if the element is the last node
                    return removeLast();
                }
                currentSize -- ; // update size
                previous.next = current.next; // link previous to current.next
                return current.data; // return the object
            }
            //delete connections to current so it can be garbage collected
            previous = current; // link current.previous to previous
            current = current.next; // delete current
        }
        return null;
    }

    /**
     * contains an  object into a linked list
     * @param obj to be compared
     * @return true if the obj belongs to the the linked list, false if not
     */
    public boolean contains(E obj){
        Node<E> current = head; // pointer starting from first node
        while (current != null){ // go through all nodes
            if(((Comparable<E>)obj).compareTo(current.data) == 0){
                return true;
            }
            current = current.next; // go to next node each iteration
        }
        return false;
    }
}

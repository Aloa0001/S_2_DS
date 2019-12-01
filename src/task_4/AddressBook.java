package task_4;

public class AddressBook {

    private  MyLinkedListT4<Person> addressBook; // will store all the people
    /**
     * Constructor
     */
    public AddressBook(){
        this.addressBook = new MyLinkedListT4<>();
    }
    /**
     * getter
     */
    public MyLinkedListT4<Person> getAddressBook() {
        return addressBook;
    }
    /**
     * returns the number of people in the address book
     */
    public int getSize() {
        return addressBook.size();
    }
    /**
     * adds at the and off the address book a new person item
     */
    public void addNewNameAndAddress(Person person){
        addressBook.addLast(person);
    }
    /**
     * removes a person item using the linked list remove(T obj) method
     */
    public void remove(Person person){
        addressBook.remove(person);
    }
    /**
     * returns the person obj at index
     */
    public Person getPerson(int index){
        return addressBook.get(index);
    }
}

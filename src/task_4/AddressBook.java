package task_4;

public class AddressBook {

    private  MyLinkedListT4<Person> addressBook;
    private int size;

    public AddressBook(){
        this.addressBook = new MyLinkedListT4<>();
        this.size = addressBook.size();
    }

    public MyLinkedListT4<Person> getAddressBook() {
        return addressBook;
    }

    public int getSize() {
        return addressBook.size();
    }

    public void addNewNameAndAddress(Person person){
        addressBook.addLast(person);
    }
    public void remove(Person person){
        addressBook.remove(person);
    }
    public Person getPerson(int index){
        return addressBook.get(index);
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "addressBook=" + addressBook +
                '}';
    }
}

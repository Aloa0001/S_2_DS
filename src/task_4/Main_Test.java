package task_4;

public class Main_Test {

    private static AddressBook myAddressBook = new AddressBook();

    public static void main(String[] args) {
        populateAddressBook();
        printAddressBook();
        myAddressBook.addNewNameAndAddress(new Person("Michelle", "Michell's address 6"));
        System.out.println("After adding a new  person at the end of the list, the address book looks like: ");
        printAddressBook();
        System.out.println("Person at index 0 is  "+myAddressBook.getPerson(0));
        System.out.println("Person at index 5 is  "+myAddressBook.getPerson(5));
        System.out.println("Person at index 3 is  "+myAddressBook.getPerson(3));
        myAddressBook.remove(myAddressBook.getPerson(0));
        System.out.println("_____________________________________________");
        System.out.println("After removing person at index 0, the address book looks like: ");
        printAddressBook();
    }

    private static void populateAddressBook() {
        String[] names = {"John", "Martha", "Alicia", "Michael", "Alexander"};
        String[] addresses = {"address 1", "address 2", "address 3", "address 4", "address 5"};
        for (int i = 0; i < 5; i++) {
            myAddressBook.addNewNameAndAddress(new Person(names[i], addresses[i]));
        }
    }

    private static void printAddressBook() {
        for (int i = 0; i < myAddressBook.getSize(); i++) {
            System.out.println(myAddressBook.getPerson(i));
        }
        System.out.println("_____________________________________________");
    }
}

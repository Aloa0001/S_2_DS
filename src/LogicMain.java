import task_1.CheckSymbolsForC;
import task_1.CheckSymbolsForCPlusPlus;
import task_2.JosephusArrayList;
import task_2.JosephusLinkedList;
import task_3.QueueWithOneStack;
import task_3.QueueWithTwoStacks;
import task_3.StackWithOneQueue;
import task_3.StackWithTwoQueues;
import task_4.AddressBook;
import task_4.Person;

import java.util.Scanner;

public class LogicMain {

    private static Scanner in = new Scanner(System.in);
    private static QueueWithTwoStacks<Integer> myQueueT = new QueueWithTwoStacks<>();
    private static QueueWithOneStack<Integer> myQueueO = new QueueWithOneStack<>();
    private static StackWithTwoQueues<Integer> myStackT = new StackWithTwoQueues<>();
    private static StackWithOneQueue<Integer> myStackO = new StackWithOneQueue<>();
    private static AddressBook myAddressBook = new AddressBook();

    public static void main(String[] args) {
        seminarMenu();
    }

    private static void seminarMenu() {
        testTask(chooseTaskToTest());
    }
    private static void testTask(int task) {
        if (task == 1) {
            //test task
            testTask1();
        }
        if (task == 2) {
            //test task
            testTask2();
        }
        if (task == 3) {
            //test task
            testTask3();
        }
        if (task == 4) {
            //test task
            testTask4();
        }
        if (task == 5) {
            System.exit(0);
        }

    }
    private static int chooseTaskToTest() {
        String[] answers = {"1", "2", "3", "4", "5"};
        String answer;
        boolean condition = false;
        do {
            System.out.println("\u001B[31m"+"Please enter the task you want to test: \npress 1 for task1\npress 2 for task2\n" +
                    "press 3 for task3\npress 4 for task4\npress 5 to exit"+"\u001B[0m");
            answer = in.nextLine();
            for (String x : answers) {
                if (x.equals(answer)) {
                    condition = true;
                    break;
                }
            }
        } while (!condition);
        return Integer.parseInt(answer);
    }
    private static void testTask1() {
        boolean answer = false;
        String input;
        do {
            System.out.println("Task 1");
            System.out.println("Welcome to Balance checking for C\nafter you enter a string press enter \n" +
                    "and the program will reply with true or false\ndepending on your input symbols balance\n");
            System.out.println("\n****Please enter the string to test C, and press enter: ");
            input = in.nextLine();
            System.out.println("\u001B[47m"+"\u001B[30m"+"Result for testing balance, task 1a, is: " + CheckSymbolsForC.balanceChecking(input)+"\u001B[0m");
            System.out.println("\n****Please enter the string to test C++, and press enter: ");
            input = in.nextLine();
            System.out.println("\u001B[47m"+"\u001B[30m"+"Result for testing balance, task 1b, is: " + CheckSymbolsForCPlusPlus.balanceChecking(input)+"\u001B[0m");

            System.out.println("\n press 1 to repeat test\n or other to return to the tasks menu");
            answer = in.nextLine().equals("1");

        } while (answer);
        testTask(chooseTaskToTest());
    }
    private static void testTask2() {
        boolean answer = false;
        boolean integer = false;
        int players = 0;
        int m = 0;
        do {
            System.out.println("Task 2");
            System.out.println("Welcome to Josephus problem\nenter first the number of players \n" +
                    " second, enter the M value\n the output will show the winner\n");
            do {
                System.out.println("\n****Please enter the number of players: ");
                try {
                    players = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("\u001B[34m"+ "Valid input"  +"\u001B[0m");
                } catch (NumberFormatException e) {
                    System.out.println("\u001B[34m"+ "input is not an int value"  +"\u001B[0m");
                }
            } while (!integer);
            integer = false;
            do {
                System.out.println("\n****Please enter M value: ");
                try {
                    m = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("\u001B[34m"+ "Valid input"  +"\u001B[0m");
                } catch (NumberFormatException e) {
                    System.out.println("\u001B[34m"+ "input is not an int value"  +"\u001B[0m");
                }
            } while (!integer);

            System.out.println("\u001B[47m"+"\u001B[30m"+"Result for Josephus ArrayList implementation is: " + JosephusArrayList.josephusProblem(players, m)+"\u001B[0m");
            System.out.println("\u001B[47m"+"\u001B[30m"+"Result for Josephus LinkedList implementation is: " + JosephusLinkedList.josephusProblem(players, m)+"\u001B[0m");

            System.out.println("\n press 1 to repeat test\n or other to return to the tasks menu");
            answer = in.nextLine().equals("1");

        } while (answer);
        testTask(chooseTaskToTest());
    }
    private static void testTask3() {
        boolean answer = false;
        boolean integer = false;
        int task = 0;
        do {
            System.out.println("Task 3\n");
            System.out.println("\u001B[31m"+"Each data structure supports Integers and has size 0");
            System.out.println("press 1 to test queue implemented using a stack");
            System.out.println("press 2 to test queue implemented using two stacks");
            System.out.println("press 3 to test stack implemented using a queue");
            System.out.println("press 4 to test stack implemented using two queues");
            System.out.println("press 5 to return to the menu"+"\u001B[0m");
            do {
                try {
                    task = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("\u001B[34m"+ "Valid input"  +"\u001B[0m");
                } catch (NumberFormatException e) {
                    System.out.println("\u001B[34m"+ "input is not an int value"  +"\u001B[0m");
                }
            } while (!integer);
            if (task == 1) {
                //test task
                testQueueOneStack();
            }
            if (task == 2) {
                //test task
                testQueueTwoStacks();
            }
            if (task == 3) {
                //test task
                testStackOneQueue();
            }
            if (task == 4) {
                //test task
                testStackTwoQueues();
            }
            if (task == 5) {
                //test task
                testTask(chooseTaskToTest());
            }
            System.out.println("\n press 1 to repeat test\n or other to return to the tasks menu");
            answer = in.nextLine().equals("1");

        } while (answer);
        testTask(chooseTaskToTest());
    }
    private static void testQueueOneStack() {
        boolean answer = false;
        boolean integer = false;
        int option = 0;
        do {
            System.out.println("\u001B[31m"+"Select action:");
            System.out.println("press 1 to add element");
            System.out.println("press 2 to remove element ");
            System.out.println("press 3 to peek element ");
            System.out.println("press 4 to poll element ");
            System.out.println("press 5 to make empty  ");
            System.out.println("press 6 for size  ");
            System.out.println("press 7 to print elements"+"\u001B[0m");
            do {
                try {
                    option = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("\u001B[34m"+ "Valid input"  +"\u001B[0m");
                } catch (NumberFormatException e) {
                    System.out.println("\u001B[34m"+ "input is not an int value"  +"\u001B[0m");
                }
            } while (!integer);
            if (option == 1)
                Qadd();
            if (option == 2)
                Qremove();
            if (option == 3)
                Qpeek();
            if (option == 4)
                Qpoll();
            if (option == 5)
                QmakeEmpty();
            if (option == 6)
                Qsize();
            if (option == 7)
                Qprint();
            System.out.println("\n press 1 to continue testing this structure \n or other to return to the tasks menu");
            answer = in.nextLine().equals("1");
        } while (answer);
        testTask3();
    }
    private static void Qadd() {
        boolean integer = false;
        int add = 0;
        System.out.println("\u001B[34m"+  "Enter integer value to add:" +"\u001B[0m");
        do {
            try {
                add = Integer.parseInt(in.nextLine());
                integer = true;
                System.out.println("\u001B[34m"+ "Valid input"  +"\u001B[0m");
            } catch (NumberFormatException e) {
                System.out.println("\u001B[34m"+ "input is not an int value"  +"\u001B[0m");
            }
        } while (!integer);
        myQueueO.add(add);
    }
    private static void Qpeek() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myQueueO.peek()+"\u001B[0m");
    }
    private static void Qpoll() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myQueueO.poll()+"\u001B[0m");
    }
    private static void Qremove() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myQueueO.remove()+"\u001B[0m");
    }
    private static void QmakeEmpty() {
        myQueueO.makeEmpty();
    }
    private static void Qsize() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myQueueO.size()+"\u001B[0m");
    }
    private static void Qprint() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myQueueO.toString()+"\u001B[0m");
    }
    private static void testQueueTwoStacks() {
        boolean answer = false;
        boolean integer = false;
        int option = 0;
        do {
            System.out.println("\u001B[31m"+"Select action:");
            System.out.println("press 1 to add element");
            System.out.println("press 2 to remove element ");
            System.out.println("press 3 to peek element ");
            System.out.println("press 4 to poll element ");
            System.out.println("press 5 to make empty  ");
            System.out.println("press 6 for size  ");
            System.out.println("press 7 to print elements"+"\u001B[0m");
            do {
                try {
                    option = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("\u001B[34m"+ "Valid input"  +"\u001B[0m");
                } catch (NumberFormatException e) {
                    System.out.println("\u001B[34m"+ "input is not an int value"  +"\u001B[0m");
                }
            } while (!integer);
            if (option == 1)
                QTadd();
            if (option == 2)
                QTremove();
            if (option == 3)
                QTpeek();
            if (option == 4)
                QTpoll();
            if (option == 5)
                QTmakeEmpty();
            if (option == 6)
                QTsize();
            if (option == 7)
                QTprint();
            System.out.println("\n press 1 to continue testing this structure \n or other to return to the tasks menu");
            answer = in.nextLine().equals("1");
        } while (answer);
        testTask3();
    }
    private static void QTadd() {
        boolean integer = false;
        int add = 0;
        System.out.println("\u001B[34m"+ "Enter integer value to add:"  +"\u001B[0m");
        do {
            try {
                add = Integer.parseInt(in.nextLine());
                integer = true;
                System.out.println("\u001B[34m"+  "Valid input" +"\u001B[0m");
            } catch (NumberFormatException e) {
                System.out.println("\u001B[34m"+ "input is not an int value"  +"\u001B[0m");
            }
        } while (!integer);
        myQueueT.add(add);
    }
    private static void QTpeek() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myQueueT.peek()+"\u001B[0m");
    }
    private static void QTpoll() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myQueueT.poll()+"\u001B[0m");
    }
    private static void QTremove() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myQueueT.remove()+"\u001B[0m");
    }
    private static void QTmakeEmpty() {
        myQueueT.makeEmpty();
    }
    private static void QTsize() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myQueueT.size()+"\u001B[0m");
    }
    private static void QTprint() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myQueueT.toString()+"\u001B[0m");
    }
    private static void testStackOneQueue() {
        boolean answer = false;
        boolean integer = false;
        int option = 0;
        do {
            System.out.println("\u001B[31m"+"Select action:");
            System.out.println("press 1 to push element");
            System.out.println("press 2 to remove element ");
            System.out.println("press 3 to peek element ");
            System.out.println("press 4 to pop element ");
            System.out.println("press 5 to make empty  ");
            System.out.println("press 6 for size  ");
            System.out.println("press 7 to print elements"+"\u001B[0m");
            do {
                try {
                    option = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("\u001B[34m"+ "Valid input"  +"\u001B[0m");
                } catch (NumberFormatException e) {
                    System.out.println("\u001B[34m"+ "input is not an int value"  +"\u001B[0m");
                }
            } while (!integer);
            if (option == 1)
                Spush();
            if (option == 2)
                Sremove();
            if (option == 3)
                Speek();
            if (option == 4)
                Spop();
            if (option == 5)
                SmakeEmpty();
            if (option == 6)
                Ssize();
            if (option == 7)
                Sprint();
            System.out.println("\n  press 1 to continue testing this structure \n or other to return to the tasks menu");
            answer = in.nextLine().equals("1");
        } while (answer);
        testTask3();
    }
    private static void Spush() {
        boolean integer = false;
        int add = 0;
        System.out.println("\u001B[34m"+ "Enter integer value to add:"  +"\u001B[0m");
        do {
            try {
                add = Integer.parseInt(in.nextLine());
                integer = true;
                System.out.println("\u001B[34m"+ "Valid input"  +"\u001B[0m");
            } catch (NumberFormatException e) {
                System.out.println("\u001B[34m"+  "input is not an int value" +"\u001B[0m");
            }
        } while (!integer);
        myStackO.push(add);
    }
    private static void Speek() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myStackO.peek()+"\u001B[0m");
    }
    private static void Spop() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myStackO.pop()+"\u001B[0m");
    }
    private static void Sremove() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myStackO.remove()+"\u001B[0m");
    }
    private static void SmakeEmpty() {
        myStackO.makeEmpty();
    }
    private static void Ssize() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myStackO.size()+"\u001B[0m");
    }
    private static void Sprint() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myStackO.toString()+"\u001B[0m");
    }
    private static void testStackTwoQueues() {
        boolean answer = false;
        boolean integer = false;
        int option = 0;
        do {
            System.out.println("\u001B[31m"+"Select action:");
            System.out.println("press 1 to push element");
            System.out.println("press 2 to remove element ");
            System.out.println("press 3 to peek element ");
            System.out.println("press 4 to pop element ");
            System.out.println("press 5 to make empty  ");
            System.out.println("press 6 for size  ");
            System.out.println("press 7 to print elements"+"\u001B[0m");
            do {
                try {
                    option = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("\u001B[34m"+ "Valid input"  +"\u001B[0m");
                } catch (NumberFormatException e) {
                    System.out.println("\u001B[34m"+ "input is not an int value"  +"\u001B[0m");
                }
            } while (!integer);
            if (option == 1)
                STpush();
            if (option == 2)
                STremove();
            if (option == 3)
                STpeek();
            if (option == 4)
                STpop();
            if (option == 5)
                STmakeEmpty();
            if (option == 6)
                STsize();
            if (option == 7)
                STprint();
            System.out.println("\n press 1 to continue testing this structure \n or other to return to the tasks menu");
            answer = in.nextLine().equals("1");
        } while (answer);
        testTask3();
    }
    private static void STpush() {
        boolean integer = false;
        int add = 0;
        System.out.println("\u001B[34m"+ "Enter integer value to add:"  +"\u001B[0m");
        do {
            try {
                add = Integer.parseInt(in.nextLine());
                integer = true;
                System.out.println("\u001B[34m"+ "Valid input"  +"\u001B[0m");
            } catch (NumberFormatException e) {
                System.out.println("\u001B[34m"+ "input is not an int value"  +"\u001B[0m");
            }
        } while (!integer);
        myStackT.push(add);
    }
    private static void STpeek() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myStackT.peek()+"\u001B[0m");
    }
    private static void STpop() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myStackT.pop()+"\u001B[0m");
    }
    private static void STremove() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myStackT.remove()+"\u001B[0m");
    }
    private static void STmakeEmpty() {
        myStackT.makeEmpty();
    }
    private static void STsize() {
        System.out.println("\u001B[47m"+"\u001B[30m"+"size:  "+myStackT.size()+"\u001B[0m");
    }
    private static void STprint() {
        System.out.println("\u001B[47m"+"\u001B[30m"+myStackT.toString()+"\u001B[0m");
    }
    private static void testTask4() {
        boolean answer = false;
        boolean integer = false;
        int option = 0;
        do {
            System.out.println("Task 4:");
            System.out.println("You can add/ remove people to the address book\n" +
                    " or print the address book content");
            System.out.println("\u001B[31m"+"Select action:");
            System.out.println("press 1 to add a new person");
            System.out.println("press 2 to remove a person by list index ");
            System.out.println("press 3 to print the adress book content "+"\u001B[0m");
            do {
                try {
                    option = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("\u001B[34m"+ "Valid input"  +"\u001B[0m");
                } catch (NumberFormatException e) {
                    System.out.println("\u001B[34m"+ "input is not an int value"  +"\u001B[0m");
                }
            } while (!integer);
            if (option == 1)
               addNewPerson();
            if (option == 2)
                removePerson();
            if (option == 3)
               printAddressBook();

            System.out.println("\n  press 1 to continue testing this structure \n or other to return to the tasks menu");
            answer = in.nextLine().equals("1");
        } while (answer);
        testTask(chooseTaskToTest());
    }
    private static void addNewPerson(){
        String name = null;
        String address = null;
        System.out.println("\u001B[34m"+ "Enter the name of the person:"  +"\u001B[0m");
        name = in.nextLine();
        System.out.println("\u001B[34m"+"Enter the address of "+ name+"\u001B[0m");
        address = in.nextLine();
        myAddressBook.addNewNameAndAddress(new Person(name, address));
        System.out.println("\u001B[34m"+"New person added"+"\u001B[0m");
    }
    private static void removePerson(){
        boolean integer = false;
        int name = 0;
        do {
            System.out.println("Enter the index at which the person\n" +
                    "to be removed is in the address book");
            try {
                name = Integer.parseInt(in.nextLine());
                if (name < myAddressBook.getSize() &&  myAddressBook.getSize() > 0){
                    integer = true;
                }else{
                    System.out.println("\u001B[34m"+"The address book is empty or\n" +
                            "the index you peeked is outside \nthe range of the list"+"\u001B[0m");
                    if (myAddressBook.getSize() > 0){
                        System.out.println("\u001B[34m"+"\nThe available range is between 0 and "+
                                (myAddressBook.getSize()-1)+"\u001B[0m");
                    }else{
                        System.out.println("\u001B[34m"+ "\nThe list is empty" +"\u001B[0m");
                    }
                    testTask4();
                }
                System.out.println("Valid input");
            } catch (NumberFormatException e) {
                System.out.println("input is not an int value");
            }
        } while (!integer);
        myAddressBook.remove(myAddressBook.getPerson(name));
    }
    private static void printAddressBook(){
        for (int i = 0; i < myAddressBook.getSize(); i++) {
            System.out.println("\u001B[47m"+"\u001B[30m"+myAddressBook.getPerson(i)+"\u001B[0m");
        }
        System.out.println("_____________________________________________");
    }
}

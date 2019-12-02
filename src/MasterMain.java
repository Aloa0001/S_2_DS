import task_1.CheckSymbolsForC;
import task_1.CheckSymbolsForCPlusPlus;
import task_2.JosephusArrayList;
import task_2.JosephusLinkedList;
import task_3.QueueWithOneStack;
import task_3.QueueWithTwoStacks;
import task_3.StackWithOneQueue;
import task_3.StackWithTwoQueues;
import task_4.AddressBook;

import java.util.Arrays;
import java.util.Scanner;

public class MasterMain {

    private static Scanner in = new Scanner(System.in);
    private static QueueWithTwoStacks<Integer> myQueueT = new QueueWithTwoStacks<>();
    private static QueueWithOneStack<Integer> myQueueO = new QueueWithOneStack<>();
    private static StackWithTwoQueues<Integer> myStackT = new StackWithTwoQueues<>();
    private static StackWithOneQueue<Integer> myStackO = new StackWithOneQueue<>();

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
            System.out.println("Please enter the task you wanna test: \npress 1 for task 1\npress 2 for task2\n" +
                    "press 3 for task3\npress 4 for task4\npress 5 to exit");
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
                    "and the program will reply with true or false\n depending on your input symbols balance\n");
            System.out.println("\n****Please enter the string to test C, and press enter: ");
            input = in.nextLine();
            System.out.println("Result for testing balance, task 1a, is: " + CheckSymbolsForC.balanceChecking(input));
            System.out.println("\n****Please enter the string to test C++, and press enter: ");
            input = in.nextLine();
            System.out.println("Result for testing balance, task 1b, is: " + CheckSymbolsForCPlusPlus.balanceChecking(input));

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
                    System.out.println("Valid input");
                } catch (NumberFormatException e) {
                    System.out.println("input is not an int value");
                }
            } while (!integer);
            integer = false;
            do {
                System.out.println("\n****Please enter M value: ");
                try {
                    m = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("Valid input");
                } catch (NumberFormatException e) {
                    System.out.println("input is not an int value");
                }
            } while (!integer);

            System.out.println("Result for Josephus ArrayList implementation is: " + JosephusArrayList.josephusProblem(players, m));
            System.out.println("Result for Josephus LinkedList implementation is: " + JosephusLinkedList.josephusProblem(players, m));

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
            System.out.println("Each data structure supports Integers and has size 0");
            System.out.println("press 1 to test queue implemented using a stack");
            System.out.println("press 2 to test queue implemented using two stacks");
            System.out.println("press 3 to test stack implemented using a queue");
            System.out.println("press 4 to test stack implemented using two queues");
            System.out.println("press 5 to return to the menu");
            do {
                try {
                    task = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("Valid input");
                } catch (NumberFormatException e) {
                    System.out.println("input is not an int value");
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
            System.out.println("Select action:");
            System.out.println("press 1 to add element");
            System.out.println("press 2 to remove element ");
            System.out.println("press 3 to peek element ");
            System.out.println("press 4 to poll element ");
            System.out.println("press 5 to make empty  ");
            System.out.println("press 6 for size  ");
            System.out.println("press 7 to print elements");
            do {
                try {
                    option = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("Valid input");
                } catch (NumberFormatException e) {
                    System.out.println("input is not an int value");
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
        System.out.println("Enter integer value to add:");
        do {
            try {
                add = Integer.parseInt(in.nextLine());
                integer = true;
                System.out.println("Valid input");
            } catch (NumberFormatException e) {
                System.out.println("input is not an int value");
            }
        } while (!integer);
        myQueueO.add(add);
    }
    private static void Qpeek() {
        System.out.println(myQueueO.peek());
    }
    private static void Qpoll() {
        System.out.println(myQueueO.poll());
    }
    private static void Qremove() {
        System.out.println(myQueueO.remove());
    }
    private static void QmakeEmpty() {
        myQueueO.makeEmpty();
    }
    private static void Qsize() {
        System.out.println(myQueueO.size());
    }
    private static void Qprint() {
        System.out.println(myQueueO.toString());
    }
    private static void testQueueTwoStacks() {
        boolean answer = false;
        boolean integer = false;
        int option = 0;
        do {
            System.out.println("Select action:");
            System.out.println("press 1 to add element");
            System.out.println("press 2 to remove element ");
            System.out.println("press 3 to peek element ");
            System.out.println("press 4 to poll element ");
            System.out.println("press 5 to make empty  ");
            System.out.println("press 6 for size  ");
            System.out.println("press 7 to print elements");
            do {
                try {
                    option = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("Valid input");
                } catch (NumberFormatException e) {
                    System.out.println("input is not an int value");
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
        System.out.println("Enter integer value to add:");
        do {
            try {
                add = Integer.parseInt(in.nextLine());
                integer = true;
                System.out.println("Valid input");
            } catch (NumberFormatException e) {
                System.out.println("input is not an int value");
            }
        } while (!integer);
        myQueueT.add(add);
    }
    private static void QTpeek() {
        System.out.println(myQueueT.peek());
    }
    private static void QTpoll() {
        System.out.println(myQueueT.poll());
    }
    private static void QTremove() {
        System.out.println(myQueueT.remove());
    }
    private static void QTmakeEmpty() {
        myQueueT.makeEmpty();
    }
    private static void QTsize() {
        System.out.println(myQueueT.size());
    }
    private static void QTprint() {
        System.out.println(myQueueT.toString());
    }
    private static void testStackOneQueue() {
        boolean answer = false;
        boolean integer = false;
        int option = 0;
        do {
            System.out.println("Select action:");
            System.out.println("press 1 to push element");
            System.out.println("press 2 to remove element ");
            System.out.println("press 3 to peek element ");
            System.out.println("press 4 to pop element ");
            System.out.println("press 5 to make empty  ");
            System.out.println("press 6 for size  ");
            System.out.println("press 7 to print elements");
            do {
                try {
                    option = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("Valid input");
                } catch (NumberFormatException e) {
                    System.out.println("input is not an int value");
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
        System.out.println("Enter integer value to add:");
        do {
            try {
                add = Integer.parseInt(in.nextLine());
                integer = true;
                System.out.println("Valid input");
            } catch (NumberFormatException e) {
                System.out.println("input is not an int value");
            }
        } while (!integer);
        myStackO.push(add);
    }
    private static void Speek() {
        System.out.println(myStackO.peek());
    }
    private static void Spop() {
        System.out.println(myStackO.pop());
    }
    private static void Sremove() {
        System.out.println(myStackO.remove());
    }
    private static void SmakeEmpty() {
        myStackO.makeEmpty();
    }
    private static void Ssize() {
        System.out.println(myStackO.size());
    }
    private static void Sprint() {
        System.out.println(myStackO.toString());
    }
    private static void testStackTwoQueues() {
        boolean answer = false;
        boolean integer = false;
        int option = 0;
        do {
            System.out.println("Select action:");
            System.out.println("press 1 to push element");
            System.out.println("press 2 to remove element ");
            System.out.println("press 3 to peek element ");
            System.out.println("press 4 to pop element ");
            System.out.println("press 5 to make empty  ");
            System.out.println("press 6 for size  ");
            System.out.println("press 7 to print elements");
            do {
                try {
                    option = Integer.parseInt(in.nextLine());
                    integer = true;
                    System.out.println("Valid input");
                } catch (NumberFormatException e) {
                    System.out.println("input is not an int value");
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
        System.out.println("Enter integer value to add:");
        do {
            try {
                add = Integer.parseInt(in.nextLine());
                integer = true;
                System.out.println("Valid input");
            } catch (NumberFormatException e) {
                System.out.println("input is not an int value");
            }
        } while (!integer);
        myStackT.push(add);
    }
    private static void STpeek() {
        System.out.println(myStackT.peek());
    }
    private static void STpop() {
        System.out.println(myStackT.pop());
    }
    private static void STremove() {
        System.out.println(myStackT.remove());
    }
    private static void STmakeEmpty() {
        myStackT.makeEmpty();
    }
    private static void STsize() {
        System.out.println("size:  "+myStackT.size());
    }
    private static void STprint() {
        System.out.println(myStackT.toString());
    }

    private static void testTask4() {

    }
}
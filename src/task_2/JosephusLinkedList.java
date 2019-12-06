package task_2;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public class JosephusLinkedList {

    private static int m;

    public static int josephusProblem(@NotNull MyLinkedList<Integer> people, int m) {
        int winner = 0;
        while (people.size() > 1) {
            winner = (winner + m) % people.size();// adapt to the new size of the array list and add tm
            people.remove(winner);// -> start next cycle from next index
        }
        return people.get(0);
    }
    public static int josephusProblem(int players, int m) {
        int winner = 0;
        MyLinkedList<Integer> people = new MyLinkedList<>();
        for(int i = 1; i <= players; i++)
            people.addLast(i);
        while (people.size() > 1) {
            winner = (winner + m) % people.size();// adapt to the new size of the array list and add tm
            people.remove(winner);// -> start next cycle from next index
        }
        return people.get(0);
    }
    public static int josephusProblemLLJ(int players, int m) {
        int winner = 0;
        LinkedList<Integer> people = new LinkedList<>();
        for(int i = 1; i <= players; i++)
            people.addLast(i);
        while (people.size() > 1) {
            winner = (winner + m) % people.size();// adapt to the new size of the array list and add tm
            people.remove(winner);// -> start next cycle from next index
        }
        return people.get(0);
    }

    public static void main(String[] args) {
        int elements = 14; //nbr of people
        m = 3; // nbr of people to pass the potato
        System.out.println(josephusProblem(elements, m));//  return the winner
    }
}

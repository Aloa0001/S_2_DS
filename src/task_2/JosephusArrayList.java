package task_2;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class JosephusArrayList {
    private static ArrayList<Integer> people = new ArrayList<>();
    private static int m;

    public static int josephusProblem(@NotNull ArrayList<Integer> people, int m){
        int winner = 0;
        while(people.size() > 1){
            winner = (winner + m)%people.size();// adapt to the new size of the array list and add tm
            people.remove(winner);// -> start next cycle from next index
        }
        return people.get(0);
    }
    public static int josephusProblem(int players, int m){
        int winner = 0;
        ArrayList<Integer> people = new ArrayList<>();
        for(int i = 1; i <= players; i++)
            people.add(i);
        while(people.size() > 1){
            winner = (winner + m)%people.size();// adapt to the new size of the array list and add tm
            people.remove(winner);// -> start next cycle from next index
        }
        return people.get(0);
    }
    public static int josephusProblemIterator(int players, int m) {
        int winner = 0;
        List<Integer> pl = new LinkedList<>();
        for (int i = 1; i <= players; i++)
            pl.add(i);
        while (pl.size() > 1) {
            ListIterator iterator = pl.listIterator();
            winner = (winner + m)%pl.size();
            int temp = (Integer) iterator.next();
            while (!pl.get(winner).equals(temp)){
                temp = (Integer) iterator.next();
            }
            iterator.remove();
        }
        return pl.get(0);
    }

    public static void main(String[] args) {
        int elements = 100; //nbr of people
        m = 3; // nbr of people to pass the potato
        for(int i = 1; i <= elements; i++)
            people.add(i);
        System.out.println(josephusProblem(people, m));//  return the winner
        System.out.println(josephusProblem(elements, m));//  return the winner
        System.out.println(josephusProblemIterator(elements, m));//  return the winner
    }
}

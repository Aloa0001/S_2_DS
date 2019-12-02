package task_2;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.Iterator;

public class JosephusArrayList {
    private static ArrayList<Integer> people = new ArrayList<>();
    private static int m;
    private static Iterator iterator = people.iterator();

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
    public static int josephusProblemIterator(int players, int m){
        int winner = 0;
        ArrayList<Integer> people = new ArrayList<>();
        for(int i = 1; i <= players; i++)
            people.add(i);
        while(winner != (winner + m)%people.size()){
            iterator.remove();
        }
        return people.get(0);
    }
    public static int josephusProblemIterator(@NotNull ArrayList<Integer> people, int m){
        int winner = 0;
        while(winner != (winner + m)%people.size()){
            iterator.remove();
        }
        return people.get(0);
    }


    public static void main(String[] args) {
        int elements = 5; //nbr of people
        m = 7; // nbr of people to pass the potato
        for(int i = 1; i <= elements; i++)
            people.add(i);
        System.out.println(josephusProblem(people, m));//  return the winner
        System.out.println(josephusProblemIterator(people, m));//  return the winner
    }
}

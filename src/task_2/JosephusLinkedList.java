package task_2;
import org.jetbrains.annotations.NotNull;

public class JosephusLinkedList {
    private static MyLinkedList<Integer> people = new MyLinkedList<>();
    private static int m;

    public static int josephusProblem(@NotNull MyLinkedList<Integer> people, int m) {
        int winner = 0;
        while (people.size() > 1) {
            winner = (winner + m) % people.size();// adapt to the new size of the array list and add tm
            people.remove(winner);// -> start next cycle from next index
        }
        return people.get(0);
    }

    public static void main(String[] args) {
        int elements = 5; //nbr of people
        m = 1; // nbr of people to pass the potato
        for (int i = 1; i <= elements; i++) {
            people.addLast(i);
        }
        System.out.println(josephusProblem(people, m));//  return the winner
    }
}

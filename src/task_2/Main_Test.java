package task_2;
import java.util.ArrayList;

public class Main_Test <E>{
    private static MyTimer timer = new MyTimer();
    private static int nbrOfPeople = 5;
    private static int iterations = 100;
    private static int m = 1;

    public static void main(String[] args) {
        testArray(nbrOfPeople,m,iterations);
        testMyLinkedList(nbrOfPeople,m,iterations);
    }
    /** test ArrayList Implementation*/
   public static void testArray(int elements, int m, int iterations){
       ArrayList<Integer> people = new ArrayList<>();
       for(int i = 1; i <= elements; i++)
           people.add(i);
       timer.startTimer();
        for(int i = 0; i < iterations; i++){
            JosephusArrayList.josephusProblem(people,m);
        }
        timer.stopTimer();
        System.out.println("For "+ iterations+" iterattions, ArrayTest: "+timer.getTime()/iterations+" ns");
        System.out.println(JosephusArrayList.josephusProblem(people,m));
    }

    /** test MyLinkedList Implementation*/
    public static void testMyLinkedList(int elements, int m, int iterations){
        MyLinkedList<Integer> people = new MyLinkedList<>();
        for (int i = 1; i <= elements; i++) {
            people.addLast(i);
        }
        timer.startTimer();
        for(int i = 0; i < iterations; i++){
            JosephusLinkedList.josephusProblem(people,m);
        }
        timer.stopTimer();
        System.out.println("For "+ iterations+" iterattions, MyLinkedListTest: "+timer.getTime()/iterations+" ns");
        System.out.println(JosephusLinkedList.josephusProblem(people,m));
    }
}

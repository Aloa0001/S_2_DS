package task_2;

public class Main_Test <E>{
    private static MyTimer timer = new MyTimer();
    private static int nbrOfPeople = 100;
    private static int iterations = 10;
    private static int m = 4;

    public static void main(String[] args) {
        test100Input(nbrOfPeople);
        test1000Input(nbrOfPeople);
        test10000Input(nbrOfPeople);
    }

    /** test ArrayList Implementation*/
   public static void testArray(int elements, int m, int iterations){
       timer.startTimer();
        for(int i = 0; i < iterations; i++){
            JosephusArrayList.josephusProblem(elements,m);
        }
        timer.stopTimer();
        System.out.println("After "+ iterations+" iterations, Array test, average execution time:  "+timer.getTime()/iterations+" ns");
        System.out.println(JosephusArrayList.josephusProblem(elements,m));
    }
    /** test Iterator Implementation*/
    public static void testIterator(int elements, int m, int iterations){
        timer.startTimer();
        for(int i = 0; i < iterations; i++){
            JosephusArrayList.josephusProblemIterator(elements,m);
        }
        timer.stopTimer();
        System.out.println("After "+ iterations+" iterations, Iterator test, average execution time: "+timer.getTime()/iterations+" ns");
        System.out.println(JosephusArrayList.josephusProblem(elements,m));
    }
    /** test MyLinkedList Implementation*/
    public static void testMyLinkedList(int elements, int m, int iterations){
        timer.startTimer();
        for(int i = 0; i < iterations; i++){
            JosephusLinkedList.josephusProblem(elements,m);
        }
        timer.stopTimer();
        System.out.println("After "+ iterations+" iterations, LinkedList test, average execution time: "+timer.getTime()/iterations+" ns");
        System.out.println(JosephusLinkedList.josephusProblem(elements,m));
    }
    /** test for input 100, 10 000, 1 000 000 */
    private static void test100Input(int nbrOfPeople){
        System.out.println("test for input 100");
        testArray(nbrOfPeople,m,iterations);
        testIterator(nbrOfPeople,m,iterations);
        testMyLinkedList(nbrOfPeople,m,iterations);
    }
    private static void test1000Input(int nbrOfPeople){
        System.out.println("test for input 1 000");
        testArray(nbrOfPeople*10,m,iterations);
        testIterator(nbrOfPeople*10,m,iterations);
        testMyLinkedList(nbrOfPeople*10,m,iterations);
    }
    private static void test10000Input(int nbrOfPeople){
        System.out.println("test for input 10 000");
        testArray(nbrOfPeople*100,m,iterations);
        testIterator(nbrOfPeople*100,m,iterations);
        testMyLinkedList(nbrOfPeople*100,m,iterations);
    }
}

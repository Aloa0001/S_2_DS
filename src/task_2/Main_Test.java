package task_2;

public class Main_Test <E>{
    private static MyTimer timer = new MyTimer();
    private static int nbrOfPeople = 1000;
    private static int iterations = 1;
    private static int[] ms = {1,2,99,999};

    public static void main(String[] args) {
        for (int m: ms){
            testDifferentMs(m);
        }
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
    /** test MyLinkedList Implementation*/
    public static void testLinkedListJV(int elements, int m, int iterations){
        timer.startTimer();
        for(int i = 0; i < iterations; i++){
            JosephusLinkedList.josephusProblemLLJ(elements,m);
        }
        timer.stopTimer();
        System.out.println("After "+ iterations+" iterations, LinkedList JAVA test, average execution time: "+timer.getTime()/iterations+" ns");
        System.out.println(JosephusLinkedList.josephusProblem(elements,m));
    }
    /** test for input 1000, 10 000, 100 000 */
    private static void test100Input(int m){
        System.out.println("test for input 1000 and m = "+m);
        testArray(nbrOfPeople,m,iterations);
        testIterator(nbrOfPeople,m,iterations);
        testMyLinkedList(nbrOfPeople,m,iterations);
        testLinkedListJV(nbrOfPeople,m,iterations);
    }
    private static void test1000Input(int m){
        System.out.println("test for input 10 000 and m = "+m);
        testArray(nbrOfPeople*10,m,iterations);
        testIterator(nbrOfPeople*10,m,iterations);
        testMyLinkedList(nbrOfPeople*10,m,iterations);
        testLinkedListJV(nbrOfPeople*10,m,iterations);
    }
    private static void test10000Input(int m){
        System.out.println("test for input 100 000 and m = "+m);
        testArray(nbrOfPeople*100,m,iterations);
        testIterator(nbrOfPeople*100,m,iterations);
        testMyLinkedList(nbrOfPeople*100,m,iterations);
        testLinkedListJV(nbrOfPeople*100,m,iterations);
    }
    private static void testDifferentMs(int m){
        System.out.println("\nTEST FOR M = "+m+"\n");
        test100Input(m);
        test1000Input(m);
        test10000Input(m);
    }
}

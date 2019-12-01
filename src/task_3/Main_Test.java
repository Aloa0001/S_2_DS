package task_3;

public class Main_Test {

    public static void main(String[] args) {
        fillDataStructures();

        /** test Stack implemented with two queues*/
        System.out.println("Test Stack twoQ: ");
        testStackTwoQueues(myStackT);

        /** test Stack implemented with one queue*/
        System.out.println("\nTest Stack oneQ: ");
        testStackOneQueue(myStackO);

        /** test Queue implemented with two stacks*/
        System.out.println("\nTest Queue twoS: ");
        testQueueTwoStacks(myQueue);

        /** test Queue implemented with one stack*/
        System.out.println("\nTest Queue oneS: ");
        testQueueOneStack(myQueueO);
    }

    private static void fillDataStructures(){
        fillQueueT(myQueue);
        fillQueueO(myQueueO);
        fillStackT(myStackT);
        fillStackO(myStackO);
    }
    private static void testQueueTwoStacks(QueueWithTwoStacks<Integer> queue){
        System.out.println("Queue content "+queue.toString());
        System.out.println("size       "+queue.size());
        System.out.println("peek       "+queue.peek());
        System.out.println("Queue content "+queue.toString());
        System.out.println("poll       "+queue.poll());
        System.out.println("Queue content "+queue.toString());
        System.out.println("remove     "+queue.remove());
        System.out.println("size       "+queue.size());
        System.out.println("empty?     "+queue.isEmpty());
        queue.makeEmpty();
        System.out.println("After makeEmpty(): ");
        System.out.println("empty?     "+queue.isEmpty());
        System.out.println("Queue content "+queue.toString());

    }
    private static void testQueueOneStack(QueueWithOneStack<Integer> queue){
        System.out.println("size       "+queue.size());
        System.out.println("peek       "+queue.peek());
        System.out.println("poll       "+queue.poll());
        System.out.println("remove     "+queue.remove());
        System.out.println("size       "+queue.size());
        System.out.println("empty?     "+queue.isEmpty());
        queue.makeEmpty();
        System.out.println("After makeEmpty(): ");
        System.out.println("empty?     "+queue.isEmpty());
        System.out.println("Queue content "+queue.toString());
    }
    private static void testStackTwoQueues(StackWithTwoQueues<Integer> stack){
        System.out.println("Stack content "+stack.toString());
        System.out.println("peek       "+stack.peek());
        System.out.println("size       "+stack.size());
        System.out.println("Stack content "+stack.toString());
        System.out.println("pop        "+stack.pop());
        System.out.println("Stack content "+stack.toString());
        System.out.println("remove     "+stack.remove());
        System.out.println("size       "+stack.size());
        System.out.println("empty?     "+stack.isEmpty());
        stack.makeEmpty();
        System.out.println("After makeEmpty(): ");
        System.out.println("empty?     "+stack.isEmpty());
        System.out.println("Queue content "+stack.toString());
    }
    private static void testStackOneQueue(StackWithOneQueue<Integer> stack){
        System.out.println("peek       "+stack.peek());
        System.out.println("size       "+stack.size());
        System.out.println("pop        "+stack.pop());
        System.out.println("remove     "+stack.remove());
        System.out.println("size       "+stack.size());
        System.out.println("empty?     "+stack.isEmpty());
        stack.makeEmpty();
        System.out.println("After makeEmpty(): ");
        System.out.println("empty?     "+stack.isEmpty());
    }
    private static void fillQueueT(QueueWithTwoStacks<Integer> myQueue){
        for (int i = 0; i < 10; i++){
            myQueue.add(i);// method "add" is part of the test
        }
    }
    private static void fillQueueO(QueueWithOneStack<Integer> myQueueO){
        for (int i = 0; i < 10; i++){
            myQueueO.add(i);// method "add" is part of the test
        }
    }
    private static void fillStackO(StackWithOneQueue<Integer> myStackO){
        for (int i = 0; i < 10; i++){
            myStackO.push(i);// method "add" is part of the test
        }
    }
    private static void fillStackT(StackWithTwoQueues<Integer> myStackT){
        for (int i = 0; i < 10; i++){
            myStackT.push(i);// method "add" is part of the test
        }
    }

    private static QueueWithTwoStacks<Integer> myQueue = new QueueWithTwoStacks<>();
    private static QueueWithOneStack<Integer> myQueueO = new QueueWithOneStack<>();
    private static StackWithTwoQueues<Integer> myStackT = new StackWithTwoQueues<>();
    private static StackWithOneQueue<Integer> myStackO = new StackWithOneQueue<>();
}

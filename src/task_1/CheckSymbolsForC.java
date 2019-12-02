package task_1;
import java.util.Stack;

public class CheckSymbolsForC {

    public static String balanceChecking(String[] code) {
        String valid = "Valid";
        for (String line : code) {
            if (valid.equals("Valid")) {
                Stack<Character> active = new Stack<>();
                Stack<Character> cancel = new Stack<>();
                char[] words = line.toCharArray();
                fillStacks(words, active, cancel);
                checkStacks(active, cancel, valid);
                if (!active.isEmpty() || !cancel.isEmpty()) {
                    valid = "NOT Valid";
                }
            } else {
                break;
            }
        }
        return valid;
    }
    public static String balanceChecking(String code) {
        String valid = "Valid";
        for (int i = 0; i < code.length(); i++) {
            if (valid.equals("Valid")) {
                Stack<Character> active = new Stack<>();
                Stack<Character> cancel = new Stack<>();
                char[] words = code.toCharArray();
                fillStacks(words, active, cancel);
                checkStacks(active, cancel, valid);
                if (!active.isEmpty() || !cancel.isEmpty()) {
                    valid = "NOT Valid";
                }
            } else {
                break;
            }
        }
        return valid;
    }
    private static void fillStacks(char[] words, Stack<Character> active, Stack<Character> cancel){
        for (int i = 0; i < words.length; i++) {
            if (words[i] == '[' || words[i] == '{') {
                active.push(words[i]);
            }
            if (words[i] == ']' || words[i] == '}') {
                cancel.push(words[i]);
            }
            if (i < words.length - 1) {
                if (words[i] == words[i + 1] && words[i + 1] == '/') {
                    break;
                }
                if (words[i] == '/' && words[i + 1] == '*') {
                    active.push(words[i]);
                    active.push(words[i + 1]);
                }
                if (words[i] == '*' && words[i + 1] == '/') {
                    cancel.push(words[i]);
                    cancel.push(words[i + 1]);
                }
            }
        }
    }
    private static void checkStacks(Stack<Character> active, Stack<Character> cancel, String valid) {
        while (active.size() == cancel.size() && !active.isEmpty()) {
            if (active.peek().equals('[') && cancel.peek().equals(']')) {
                active.pop();
                cancel.pop();
            } else if (active.peek().equals('{') && cancel.peek().equals('}')) {
                active.pop();
                cancel.pop();
            } else if (active.peek().equals('/') && cancel.peek().equals('*')) {
                active.pop();
                cancel.pop();
            } else if (active.peek().equals('*') && cancel.peek().equals('/')) {
                active.pop();
                cancel.pop();
            } else {
                valid = "NON Valid";
                break;
            }
        }
    }
    public static void main(String[] args) {
        String[] testValid = {"1. int a;", "2. int a; /* random comment */ ", "3. int a; /* for storing width * height */ ",
                "4. int a = b*c; ", "6. int a = 55; // This is a comment / [ ", "7. public void doIt(int x) {System.out.println(x*100);} ",
                "8. int []arr = new int[10];", "9. /* */ {} "};
        String[] testNonValid = {"1. int [arr = new int[10];", " 2. int b = 5; /* this is a comment / ", "3. {a=b; 4. } "};
        System.out.println(balanceChecking(testValid));
        System.out.println(balanceChecking(testNonValid));

    }
}

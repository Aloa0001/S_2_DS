package task_1;

import java.util.Stack;

public class CheckSymbolsForCPlusPlus {
//    public static String balanceChecking(String[] code) {
//        String valid = "Valid";
//        for (String line : code) {
//            if (valid.equals("Valid")) {
//                Stack<Character> active = new Stack<>();
//                Stack<Character> cancel = new Stack<>();
//                char[] words = line.toCharArray();
//                fillStacks(words, active, cancel);
//                checkStacks(active, cancel, valid);
//                if (!active.isEmpty() || !cancel.isEmpty()) {
//                    valid = "NOT Valid";
//                }
//            } else {
//                break;
//            }
//        }
//        return valid;
//    }
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
            }else {
                valid = "NON Valid";
                break;
            }
        }
    }

    public static void main(String[] args) {
        String testValid = "1. if(a == b) {a++;} 2. if(a < (b*c)) {t = 5;} 3. int []b = new int[5];  4. [](){} 5. int a = 5; // init a to 5 ";
        String testNonValid = "1. for(int i=0;i<10;i++] {a+= b;}  2. {abc) ";
//        System.out.println(balanceChecking(testValid));
//        System.out.println(balanceChecking(testNonValid));
        System.out.println(balanceChecking(testValid));
        System.out.println(balanceChecking(testNonValid));

    }
}

import java.util.*;

public class validbrackets {

    public static void isvalid(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder validString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{') {
                stack.push(c);
                validString.append(c); // Add to valid string
            } else if (c == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop(); // Match found, pop the stack
                    validString.append(c); // Add to valid string
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("The valid string is: " + validString.toString());
        } else {
            System.out.println("The string contains unmatched brackets.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of brackets: ");
        String str = sc.nextLine();
        isvalid(str);
    }
}
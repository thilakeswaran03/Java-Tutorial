import java.util.Arrays;

// method to find similar prefix for an array of strings
class Stringclass {
    public static void findCommonPrefix(String[] words) {
        if (words.length == 0) {
            System.out.println("no similarities");
        }
        Arrays.sort(words);
        String first = words[0];
        String last = words[words.length - 1];
        int i = 0;
        while (first.length() > 0 && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        System.out.println("Similar prefix: " + first.substring(0, i));
        // Method to find the common prefix for an array of strings
    }
}

public class Main {
    public static void main(String[] args) {
        String[] words = { "flower", "flow", "fly" };
        System.out.println("Original Array:");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
        Stringclass.findCommonPrefix(words);
    }
}
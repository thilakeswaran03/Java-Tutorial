import java.util.ArrayList;

public class Main {
    public static void permutation(String str, String perm, ArrayList<String> result) {
        if (str.isEmpty()) {
            result.add(perm);
        }
        for (int i = 0; i < str.length(); i++) {
            String curr = "" + str.charAt(i); // "b" in abc
            String remainingStr = str.substring(0, i) + str.substring(i + 1); // removing "b" fomr abc

            permutation(remainingStr, perm + curr, result);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        ArrayList<String> result = new ArrayList<>();
        permutation(str, "", result);
        System.out.println("Permutations of " + str + " are: " + result);

    }
}
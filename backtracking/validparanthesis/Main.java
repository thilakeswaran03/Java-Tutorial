public class Main {
    public static boolean isValid(String s) {
        if(s.isEmpty()) return true;
        // Find the first pair "{}" and remove it
        int index = s.indexOf("{}");
        if (index != -1) {
            // Remove that pair and recurse on the rest
            String newStr = s.substring(0, index) + s.substring(index + 2);
            return isValid(newStr);
        }

        // If no pair "{}" found but string not empty => invalid
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("{}")); // true
        System.out.println(isValid("{{}}{}")); // true
        System.out.println(isValid("}{")); // false
        System.out.println(isValid("{}}}")); // false
    }
}

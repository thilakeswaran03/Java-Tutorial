import java.util.ArrayList;

public class Main {
    private static void restore(ArrayList<String> list, String input, String addr, int segments, int start) {
        if (segments == 4 && start == input.length()) {
            list.add(addr);
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (start + i > input.length()) break;
            String segment = input.substring(start, start + i);
            if (isValid(segment)) {
                restore(list, input, addr + segment + ".", segments + 1, start + i);
            }
        }
    }
    
    private static boolean isValid(String segment) {
        return !(segment.length() > 3 || Integer.parseInt(segment) > 255 || (segment.length() > 1 && segment.charAt(0) == '0'));
    }

    public static void main(String[] args) {
        String input = "101023";

        ArrayList<String> list = new ArrayList<>();

        String addr = "";
        int segments= 0;
        int start=0;
        restore(list, input, addr, segments, start);
        System.out.println("Possible IP addresses are: ");
        System.out.println(list);
    }

}

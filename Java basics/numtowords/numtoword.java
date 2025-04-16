import java.util.*;
public class numtoword {
    public static String convertToWords(int num) {
        if (num == 0) {
            return "zero";
        }

        String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen","seventeen", "eighteen", "nineteen" };
        String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        String[] thousands = { "", "thousand" };

        StringBuilder words = new StringBuilder();

        if (num >= 1000) {
            words.append(units[num / 1000]).append(" ").append(thousands[1]).append(" ");
            num %= 1000;
        }

        if (num >= 100) {
            words.append(units[num / 100]).append(" hundred ");
            num %= 100;
        }

        if (num >= 20) {
            words.append(tens[num / 10]).append(" ");
            num %= 10;
        } else if (num >= 10) {
            words.append(teens[num - 10]).append(" ");
            return words.toString().trim();
        }

        if (num > 0) {
            words.append(units[num]).append(" ");
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(convertToWords(number));
    }
}

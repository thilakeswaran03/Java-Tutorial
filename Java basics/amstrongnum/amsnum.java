import java.util.*;
// program to check if a number is an Armstrong number or not
public class amsnum {
    public static boolean isams(int n) {
        int num=0;
        int n1=n;
        int digit = (int) (Math.log10(n)+1);
        while(n > 0) {
            int temp = n%10;
            num = (int) (num+Math.pow(temp, digit));
            n = n/10;
        }
        return num == n1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean check = isams(num);
        if (check) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close();
    }
}

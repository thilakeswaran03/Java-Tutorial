import java.util.Scanner;

public class pali {
    public static void check_pali(int num) {
        int reverse = 0;
        while(num>reverse){
            int r =  num % 10;
            reverse = reverse * 10 + r;
            num = num / 10;
        }
        if(reverse == num || reverse/10 == num){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        check_pali(num);
}
}

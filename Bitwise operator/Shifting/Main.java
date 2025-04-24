
import java.util.Scanner;

public class Main {

    public static void rightshift(int n){
        int rs = n>>1;
        System.out.println("right shift "+rs);
    }
    public static void leftshift(int n){
        int rs = n<<1;
        System.out.println("left shift "+rs);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 

        rightshift(n);
        leftshift(n);
    }
}

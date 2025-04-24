
import java.util.Scanner;

public class Main {
    public static void range(int n){
        for(int i=1; i<n; i++){
            if( (i & (i-1))==0){
                System.out.println(i+ "is the power of 2");
            }
        }
    }
    public static void checkthatnum(int n){
        if((n& (n-1))==0){
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        checkthatnum(n);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        range(range);
    }
}

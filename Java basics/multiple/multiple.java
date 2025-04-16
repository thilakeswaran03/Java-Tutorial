import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        System.err.print("num1: ");
        int num1 = sc.nextInt();
        System.err.print("num2: ");
        int num2 = sc.nextInt();
        int sum=0;
        for(int i=0; i<num2; i++){
            sum=sum+num1;
        }
        System.out.println("Multiple is : "+sum);
    }
}

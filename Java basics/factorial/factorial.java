import java.util.Scanner;

public class factorial {

    public static void factloop(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
            System.out.print(fact+" ");
        }
        System.out.println("\n");
        System.out.println("Factorial using loop is " + fact);
    }

    public static int factrec(int num){
        if (num == 0) {
            return 1;
        }

        return num * factrec(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        factloop(num);
        int recout = factrec(num);
        System.out.println("The output using rec is: "+recout);
        
    }
}

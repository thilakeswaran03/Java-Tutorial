import java.util.Scanner;
public class attendence {
    public static void holiday() {
        System.out.println("Enjoy! It's a holiday!");
    }

    public static void weekday() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is the student present (0/1): ");
        int a = sc.nextInt();
        if(a==0)
        System.out.println("Student is absent");
        else
        System.out.println("Student is present");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the day of the week (1-7, where 1 is Monday and 7 is Sunday): ");
            int n = sc.nextInt();
            switch(n){
                case 0:
                    System.out.println("Exiting the program.");
                    return;
                case 6:
                    holiday();
                    break;
                case 7:
                    holiday();
                    break;
                default:
                    weekday();
                    break;
            }
        }
    }
}

// to find the complement of a number using bitwise operator

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        String n = sc.nextLine();
        int len = n.length();
        int num = Integer.parseInt(n, 2); 

        int ans = (1<<len) - 1;

        int out = num ^ ans;

        String result = String.format("%" + len + "s", Integer.toBinaryString(out)).replace(' ', '0');
        System.out.println(result); 

        /* 
        int input = 10;
        int comp = ~input;
        int mask=0;
        while(mask<input){
            mask = (mask << 1) | 1;
        }

        comp = comp & mask;
        System.out.println("Complement of " + input + " is: " + comp);*/

    }
}
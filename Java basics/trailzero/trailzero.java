//write a program to find the number of trailing zeros in a factorial of a number

import java.util.Scanner;

public class trailzero {
    public static int countZeros(int num) {
        int count = 0;
        for (int i = 5; num / i >= 1; i *= 5) {
            count += num / i;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int count = countZeros(num);
        System.out.println("The number of trailing zeros in " + num + "! is: " + count);
        sc.close();
    }
}

// time complexity is O(log n) and space complexity is O(1).
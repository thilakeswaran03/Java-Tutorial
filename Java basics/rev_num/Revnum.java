public class Revnum {
    public static void main(String[] args) {
        int num =12345;
        int temp = 0;
        while (num>0) {
            int rem=num%10;
            temp=temp*10+rem;
            num/=10;
        }
        System.out.println("reversed number: "+temp);
        if(num==temp)
        {
            System.out.println("Number is a palindrome");
        }
        else
        {
            System.out.println("Number is not a palindrome");
        }
    }
}

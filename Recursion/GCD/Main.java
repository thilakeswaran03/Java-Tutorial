public class Main {

    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        System.out.println("a: "+a+" b: "+b);
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        System.out.println("The GCD is "+gcd(49,35));
    }
}

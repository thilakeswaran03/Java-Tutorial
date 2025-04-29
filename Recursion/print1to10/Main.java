public class Main {

    public static void forloop() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+ " ");
        }
    }

    public static void recursion(int n){
        if (n>100){
            return;
        }
        System.out.print(n+ " ");
        recursion(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        //using for loop
        System.out.println("Using for loop : ");
        forloop();

        //using recursion
        System.out.println();
        System.out.println("Using for recursion : ");
        recursion(n);

    }
}

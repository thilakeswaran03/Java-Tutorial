public class Main {
    public static void main(String[] args) {
        Add add = new Add();
        add.addNumbers(5, 10);
        add.addNumbers(5, 10, 15);
    }
}

class Add {
    public void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    public void addNumbers(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum: " + sum);
    }
}


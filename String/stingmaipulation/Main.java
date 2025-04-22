public class Main {
    public static void main(String[] args) {
        String name="Thilakesh";
        String ceo = "Thilakesh";

        // shallow compars only address
        System.out.println("normal-> "+(name == ceo));
        
        String owner = new String("Thilakesh");

        // shallow compars only address
        System.out.println("Shallow-> "+(name == owner)); // false

        // deep compares the value 
        System.out.println("Deep-> "+name.equals(owner));
    }
}

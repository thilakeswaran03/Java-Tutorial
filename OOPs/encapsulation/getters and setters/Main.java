class Student {
    private String name;
    private int age;

    // Getter for name
    public String Name() {
        return name;
    }

    // Setter for name
    public void Name(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Basic validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student a = new Student();
        a.Name("Naan than");
        a.setAge(19);
        System.out.println("Name: " + a.Name());
        System.out.println("Age: " + a.getAge());
    }
}

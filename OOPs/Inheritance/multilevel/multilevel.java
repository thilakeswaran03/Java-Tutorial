class Animal{
    void Animal(){
        System.out.println("this is animal");
    }
}

class Dog extends Animal{
    void dog(){
        System.out.println("this is dog");
    }
}

class Puppy extends Dog{
    void puppy(){
        System.out.println("this is puppy");
    }
}

public class multilevel {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.Animal();
        p.dog();  
        p.puppy();  

    }
}

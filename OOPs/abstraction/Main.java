abstract class Vehicle{
    int id;
    String brand;

    public abstract void capacitycheck(); // abstract method
    public abstract void brand(); // abstract method
}

class Car extends Vehicle{

    @Override
    public void capacitycheck() {
        if(id < 5){
            System.out.println("This model capacity is less than 6 members.");
    }
    else{
            System.out.println("This model capacity is more than 6 members.");
        }
    }

    @Override
    public void brand() {
        System.out.println("Brand of this car is "+ brand);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.id = 4;
        car.brand = "Toyota";

        car.capacitycheck();
        car.brand();
    }
}

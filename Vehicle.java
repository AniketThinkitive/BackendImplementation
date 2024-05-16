abstract class Vehicle{
    abstract void start();
}


class Car extends Vehicle{

    
    void start(){
        System.out.println("Car Starts with key");
    }

}

class Bike extends Vehicle{

    
    void start(){
        System.out.println("Bike Starts with kick");
    }
    public static void main(String[] args) {
        Car c=new Car();
        c.start();

        Bike b=new Bike();
        b.start();
    }



}

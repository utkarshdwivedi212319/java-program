package AbstractionProgram;

public  abstract class Vehicle
{
     abstract void start();
}

class Car extends Vehicle
{
    void start() {
        System.out.println("start with key ");
    }

}

class Scooter extends Vehicle
{
    @Override
    void start()
    {
        System.out.println("start with kick");
    }

}
class Min{
    public static void main(String[] args) {
        Car c=new Car();
        c.start();

        Scooter s=new Scooter();
        s.start();
    }
}
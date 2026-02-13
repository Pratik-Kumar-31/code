interface Vehical{
    void start(); //--> By default abstract
    void stop();
}
class Car implements Vehical{
    @Override
    public void start(){
        System.out.println("Car starts with a key");
    }
    @Override
    public void stop(){
        System.out.println("Car stops with brake");
    }
}
public class Interface {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}

abstract class Animal2{
    abstract void sound();
    void sleep(){
        System.out.println("Is sleeping.....");
    }
}
class Cat extends Animal2{
    @Override
    void sound(){
        System.out.println("Cat is making sound.... ");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
        c.sleep();
    }
}

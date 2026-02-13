class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("Lion is roaring");
    }
        }
public class Inheritance {
    public static void main(String[] args) {
        Lion L = new Lion();
        L.eat();
        L.roar();
    }
}


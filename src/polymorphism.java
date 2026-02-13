////Compile time polymorphism(Method Overloading
//
//class Calculator{
//    int add(int a , int b){
//        return a+b;
//    }
//    int add(int a , int b,int c){
//        return a+b+c;
//    }
//}
//public class polymorphism {
//    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println( c.add(2,2));
//        System.out.println( c.add(2,2,2));
//    }
//}
//
////Runtime Polymorphism(Method Overriding)
//
class Animal1{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dog barks");
        super.eat();
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

import java.util.ArrayList;
import java.util.prefs.NodeChangeEvent;

public class ArraylistClass{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
            l1.add(10);
            l1.add(20);
            l1.add(30);
            l2.add(40);
            l2.add(50);
<<<<<<< HEAD






=======
>>>>>>> 8772049bbf722657ddd76796cce44f11223437fe
            l2.add(60);

            l1.addAll(0,l2);
        System.out.println( l1.contains(20));
        for(int i : l1){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
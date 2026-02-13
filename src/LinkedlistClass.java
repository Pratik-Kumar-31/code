import java.util.LinkedList;

public class LinkedlistClass {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(1234567);
        for(int i : ll){
            System.out.println(i);
        }
    }
}

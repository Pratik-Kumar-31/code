import java.util.Set;
import java.util.HashSet;


public class HashSetDemo{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(100);
        set.add(100);
        set.add(100);
        set.add(200);
        System.out.println("Set : "+set);

        Set<String> set1 = new HashSet<String>();
        set1.add("Pratik");
        set1.add("efife");
        set1.add("eifeie");
        set1.add("eifeie");
        set1.add("Pratik");
        set1.add("Pratik");
      //  System.out.println("Set 1: "+set1);
        int index=0;
        for(String i: set1){
            System.out.printf("\nString : %d %s ",index++,i);
        }
    }
}


import java.util.Arrays;
import java.util.Scanner;

public class ArrayLearn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size for an arr1");
        int size=sc.nextInt();
        int[] arr1 = new int[size];

        System.out.println("enter elements");
        for(int i=0;i< arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter size for an array2");
        int size2=sc.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("enter elements");
        for(int i=0;i< arr2.length;i++){
            arr2[i]=sc.nextInt();
        }

        int[] c = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            c[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            c[arr1.length + i] = arr2[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
            }
        }
    }

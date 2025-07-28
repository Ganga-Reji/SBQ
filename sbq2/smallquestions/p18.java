// Intersection between two given set
import java.util.*;
public class p18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for(int i=0;i<4;i++)
        {
            set1.add(sc.nextInt());
        }

        System.out.println("\n");

        for(int i=0;i<5;i++)
        {
            set2.add(sc.nextInt());
        }

        set1.retainAll(set2);

        System.out.println("The intersection of the sets: set1 and set2"+":"+set1);
    }
}
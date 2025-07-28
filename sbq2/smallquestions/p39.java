/* Sort name by dictionary order
    Input
    -----------------
    Arijit
    Minaz
    Arnab

    Output
    -------------------
    Arijit
    Arnab
    Minaz
 */
import java.util.*;
class p39
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        TreeMap<String,Integer> map=new TreeMap<>();
        for(int i=0;i<3;i++)
        {
            String str=sc.nextLine();
            map.put(str,i);
        }
        System.out.println("---------------------------------");

        //convert sorted keys to array
        String[] sorted=map.keySet().toArray(new String[0]);
        //printing
        for(int i=0;i<sorted.length;i++)
        {
            System.out.println(sorted[i]);
        }

    }
}
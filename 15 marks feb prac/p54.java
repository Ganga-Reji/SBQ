//find whether a guven number is a perfect square
import java.util.*;
class p54
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double res=Math.sqrt(n);
        if((int)res*(int) res==n)
        {
            System.out.println("Yes a perefect square");
        }
        else{
            System.out.println("Not a perefect square");
        }
    }
}

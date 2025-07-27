//find fibonacci series upto n
//recursive way too
import java.util.*;
class p60
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        

        System.out.print(a);

        for(int i=1;i<n;i++)
        {
            System.out.print(","+b);
            int temp=b;
            b=a+b;
            a=temp;

        }

    }
}
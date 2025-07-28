//Find summ of evn digits'
import java.util.*;
class p47
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            int k=Integer.parseInt(String.valueOf(str.charAt(i)));
            if(k%2==0)
            {
                sum=sum+k;

            }
        }
        System.out.println("sum of even digits is:"+sum);
    }
}
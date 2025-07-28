//multiplication table
import java.util.*;
class p49
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        sc.nextLine();
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)

        {

            System.out.println(m+"*"+i+"="+m*i);
        }

    }

}
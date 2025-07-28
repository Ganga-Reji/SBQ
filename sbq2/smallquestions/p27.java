/* Take a number. If it odd then reverse it, otherwise print "Can not reverse"
 * 
 * Input : 123
 * Output : 321
 * 
 * Input : 234
 * Output : Can not reverse
 */
import java.util.*;
class p27
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        int sum=0;
        int temp;
        if(isOdd(a)==true)
        {
            while(a!=0)
            {
                temp=a%10;
                sum=sum*10+temp;
                a=a/10;
            }

            System.out.println(sum);

        }

        else
        {
            System.out.println("Can not reverse");
        }

    }

    public static boolean isOdd(int num)
    {
        if(num%2!=0)
        {
            return true;
        }

        else{
            return false;
        }
    }

}

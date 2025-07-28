/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
import java.util.*;
public class p10 {
    public static void main(String[] args) 
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            int p= Integer.parseInt(String.valueOf(s.charAt(i)));
            if(isPrime(p)==true)
            {
                count++;
            }
        
        
        }
        System.out.print("count:"+count);
    }

        public static  boolean isPrime(int p)
        {
            int c=0;
            for(int i=2;i<p;i++)
            {
                if(p%2==0)
                {
                    c=c+1;
                }
            }

            if(c==0 && p>1)
            {
                return true;
            }

            else{
                return false;
            }
        }
    }


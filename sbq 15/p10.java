/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
import java.util.*;
class p10
{

public static void main(String[] args) 
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
             int a=Integer.parseInt((String.valueOf(str.charAt(i))));
             if(isPrime(a)==true)
             {
                count=count+1;

             }

        }
        System.out.println(count);

       
       

    }

     public static boolean isPrime(int num)
        {
            int count=0;
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    count=count+1;
                }
            }

            if(count==0 & num>1)
            {
                return true;
            }
            else{
                return false;
            }
        }
}



/*char ch = '5';

// ❌ This will NOT compile:
int num = Integer.parseInt(ch);  // Error: incompatible types

// ✅ Correct way:
int num = Integer.parseInt(String.valueOf(ch));
You are:

Taking a character from the string s → s.charAt(i)

Converting that char to a String → String.valueOf(...)

Converting the String to an int → Integer.parseInt(...)

🔹 Why do we use String.valueOf(...)?
Because:

s.charAt(i) gives a char, not a String

Integer.parseInt() requires a String (not a char)

So we convert the char to a String using String.valueOf(...) */
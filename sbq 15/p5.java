/* Find the characters in odd position of a string which are consonent
 * 
 * Input: Arijit Ghosh
 * Output: hs
 */
import java.util.*;
class p5{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char[] ch={'a','e','i','o','u','A','E','I','O','U'};
        String str1=sc.nextLine();
        //boolean yes=true;
        for(int i=0;i<str1.length();i++)
        {boolean yes=true;
            for(int j=0;j<ch.length;j++)
            {
                if((i+1)%2==0 || str1.charAt(i)==ch[j] || str1.charAt(i)==' ')
                {
                    yes=false;
                    break;
                }


            }
            if(yes==true)
            {
                System.out.println(str1.charAt(i));
            }
        }


    }
}

/*Java Index (i)	Human Position (i+1)	Character	Odd Position? ((i+1)%2 != 0)	Vowel?	Consonant?
0	1	A	✅ Yes	✅ Yes	❌ No
1	2	r	❌ No	❌ No	✅ No (even pos)
2	3	i	✅ Yes	✅ Yes	❌ No
3	4	j	❌ No	❌ No	✅ No (even pos)
4	5	i	✅ Yes	✅ Yes	❌ No
5	6	t	❌ No	❌ No	✅ No (even pos)
6	7	(space)	✅ Yes	❌ No	❌ No
7	8	G	❌ No	❌ No	✅ No (even pos)
8	9	h	✅ Yes	❌ No	✅ ✅
9	10	o	❌ No	✅ Yes	❌ No
10	11	s	✅ Yes	❌ No	✅ ✅
11	12	h	❌ No	❌ No	✅ No (even pos)

 */

 /*🔁 Why do we reinitialize yes = true inside the loop?
Because you are checking each character one by one. Every character should get its own independent check.

If you declared yes = true; outside the loop:

Once it becomes false for any character, it stays false forever.

That breaks the logic and nothing will print.

So, you must reset yes = true every time for every character. */
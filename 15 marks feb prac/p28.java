/* Find the palindrome words from the sentence and print them and also count
 * 
 * Input:
 * ----------------
 * My name is nitin and I can speak malayalam
 * 
 * Output:
 * ----------------
 * nitin
 * I
 * malayalam
 * 3
 */

import java.util.*;
class p28
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        String result[]=findpalindrome(arr);
        if(result.isEmpty())
        {
            int count=0;
            System.out.println("The palindrome words are: ");
            for(int i=0;i<result.length;i++)
            {
                System.out.println(result[i]);
                count=count+1;
            }
            System.out.println("total count:"+count);

        }




    }

    public static String[] findpalindrome(String s[])
    {
        List<String> l=new ArrayList<>();
        for(int i=0;i<s.length;i++)
        {
            if(ispalindrome(s[i]))
            {
                l.add(s[i]);

            }
        }

        



        public static boolean ispalindrome(String a)
        {
            for(int i=0;i<s.length();i++)

            {
                if(s[i].charAt(i).equalIgnorecase(s[i].charAt(s[i].length-i-1)))
                {
                    return true;
                }

                else{
                    return false;
                }
            }
        }

        return l.toArray(new String[0]);
    }
}
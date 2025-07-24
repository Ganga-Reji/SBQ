/* Find the index number of a character in a String
 * Input1 :
 --------------
  Carrot
  a
 
 * Output:
 ---------------
   1

 * Input2:
 ----------------
   Carrot
   z

 * Output:
  --------------
   NA
 */
 import java.util.*;
public class p17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                System.out.println(i);
                //break; If you want only the first occurrence (like your original problem):
//Then break is correct and needed.If you want to print all occurrences of the character, then remove the break.

            }
        }



    }
}
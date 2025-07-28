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
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        int c=0;

        for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)==ch)
          {
            //int a=(int)i;
            System.out.println(i);
            
            break;
          }
        }
       

    }
  }

  //or this method

  /*import java.util.*;
public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String char_input = sc.nextLine();  // Taking the input as a string
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            // Now using char_input.charAt(0) to compare with str.charAt(i)
            if (str.charAt(i) == char_input.charAt(0)) {
                System.out.println(i);
                break;
            }
        }
    }
}
 */
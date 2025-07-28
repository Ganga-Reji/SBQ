/* Remove a character from a string
 * Input
 * --------------
 * Arijit
 * i
 * Output
 * ---------------
 * Arjt
 */
import java.util.*;
class p32
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        String str1=sc.nextLine();
        String ch=sc.nextLine();
        String s=str1.replace(ch,"");
        System.out.println(s);
        
    }

}
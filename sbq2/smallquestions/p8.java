/* Count the words in a sentence which are start with vowel. 
 * 
 * Input: Arijit is student of MCA
 * Output: 3
 * 
 * Input: Sara plays tennis
 * Output: No such words
*/
import java.util.*;
 class p8
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String [] str=s1.split(" ");
        int count=0;


        for(int i=0;i<str.length;i++)
        {
            /*for (int i = 0; i < str.length; i++) {
            char d = Character.toLowerCase(str[i].charAt(0));  // Convert to lowercase

            if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') {
                count++;
            }
        }
 */
            char d=str[i].charAt(0);
            if(d=='a' || d=='e'|| d=='i' || d=='o' || d=='u' || d=='A' || d=='E'|| d=='I' || d=='O' || d=='U')
            {
                count=count+1;

            }

        }

        if(count>0)
        {
            System.out.println("Count is:"+count);
        }

        else{
            System.out.println("No such words"); 
        }


    }
}
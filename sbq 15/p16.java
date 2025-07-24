/* Find first letter of each word in a string 
    Input : Kalyani Govt. Eng. College
    Output : KGEC
*/ 
import java.util.*;
public class p16{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++)
        {
            char c=words[i].charAt(0);
            System.out.println(c);
        }

    }

}


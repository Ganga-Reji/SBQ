
//Write a program that takes a sentence and a word as input, 
//then counts and displays how many times the word appears in the sentence.import java.util.*;
import java.util.*;
class p12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
        String word=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals(word))
            {
                count=count+1;
            }
        }
        System.out.println("count:"+count);
    }
}
/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "enjoy" and "meatballs".
 */

 import java.util.Scanner;
 import java.util.*;
 class p4
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine().toLowerCase();
        String[] str=s.split(" ");
        int count=0;
    
        for(int i=0;i<str.length;i++)
        {
            for(int j=1;j<str[i].length();j++)
            {
                if(isVowel(str[i].charAt(j-1))==true && isVowel(str[i].charAt(j)))
                {
                    count=count+1;
                    break;
                }
            }
        }

        System.err.println("The count: "+count);
    }

    public static boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            return true;
        }
        return false;
    }
}
 
////////////////////////////////////////////////////- also print the word
/// 
/// // Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*import java.util.*;
class program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();//i am developer
        
        String[] strarr=str.split(" ");//['icecream','am','developer']
        int count=0;
        List<String> words=new ArrayList<>();
        
        for(int i=0;i<strarr.length;i++)//--> array--3
        {
            for(int j=1;j<strarr[i].length();j++)//-- first letter till length of word
            {   //i--j=0,c--j=1
                if(isVowel(strarr[i].charAt(j-1))==true  && isVowel(strarr[i].charAt(j))==true)
                {
                    count=count+1;
                    words.add(strarr[i]);
                    //System.out.print("The word: "+strarr[i]+" ");
                    break;
                    
                }
                
            }

            
            
        }
        System.out.println("The words: "+words);
        System.out.println("The count: "+count);
    }
        public static boolean isVowel(char a)
        {
            if(a=='a' || a=='e'|| a=='i'|| a=='o'|| a=='u')
            {
                return true;
            }
            else{
                return false;
            }
        }
        
        
     
    }
*/
/* Find occurance of a character in a string
    Input
    --------------
 *  Priyanka
 *  a9876
 * 
 
 *  Output
    ----------------
 *  2
 */
class p2
{
public static void main(String[] args) {
    String s="I am In Hawai";
    Character a='h';
    int count=0;
    for(int i=0;i<s.length();i++)
    {
        //if(s.charAt(i)==a)
        if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(a))
        {
            count=count+1;
        }
    }
    System.err.println("count:"+count);
}
}
/* Find the occurance of each character in a string
 * Input: Hello world
 * Output:
 *  H: 1
    e: 1
    l: 3
    o: 2
    w: 1
    r: 1
    d: 1
*/

import java.util.*;
class pg26
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine().replace(" ","");
        LinkedHashMap<Character,Integer> count= new LinkedHashMap<>();

        for(int i=0;i<str1.length();i++)
        {
            if(!count.containsKey(str1.charAt(i)))
            {
                count.put(str1.charAt(i),1);
            }

            else{
                count.put(str1.charAt(i),count.get(str1.charAt(i))+1);
            }
        }


        for(int i=0;i<count.size();i++)
        {
            Character key= (Character)count.keySet().toArray()[i];
            Integer value=count.get(key);
            System.out.println(key+":"+value);

        }

    }
}


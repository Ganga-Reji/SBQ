//display each character followed by the number of times it appears consecutively in the input string:
// aabbbcc = a2b3c2
// abbccc = a1b2c3



//Your current approach using a HashMap does not solve the problem correctly because
// HashMap does not maintain the order of characters as they appear consecutively. 
//Instead, it counts the total occurrences of each character in the entire string.
import java.util.HashMap;
import java.util.Map;;
class p3
{
    public static void main(String[] args) {
        String s1="aabbbcc";

        if(s1==null || s1.isEmpty())
        {
            System.err.println("string is empty");
        }

        s1=s1.toLowerCase();

        HashMap<Character,Integer> charcount=new HashMap<>();

        for(int i=s1.length()-1;i>=0;i--)
        {
            char currentchar=s1.charAt(i);

            if(charcount.containsKey(currentchar))
            {
                int count=charcount.get(currentchar);
                charcount.put(currentchar,count++);
            }

            else{
                charcount.put(currentchar,1);
            }


        }


        Character[] keys=charcount.keySet().toArray(new Character[0]);
        for(int i=0;i<keys.length;i++)
        {
            Character key=keys[i];
            Integer values=charcount.get(key);
            System.out.println(key+" "+"="+" "+values);
        }


        
    }
}

//--------------------------------------------------------------------------------------//
/*class p3 {
    public static void main(String[] args) {
        String s1 = "aabbbcc";

        if (s1 == null || s1.isEmpty()) {
            System.err.println("String is empty");
            return;
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) == s1.charAt(i - 1)) {
                count++; // Increase count for consecutive characters
            } else {
                result.append(s1.charAt(i - 1)).append(count);
                count = 1; // Reset count for new character
            }
        }

        // Append last character and count
        result.append(s1.charAt(s1.length() - 1)).append(count);

        System.out.println(result.toString()); // Output: a2b3c2
    }
}
 */

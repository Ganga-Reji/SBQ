/* Count number of word in a string
*Note : Always ignore the spaces if more than 1 space given between two word

Sample Input : 1
------------------------
Kalyani Goverment Engineering College

Process
---------------------------
[Kalyani, Goverment, Engineering, College]

Output
---------------------------
Number of word : 4
*************************************
Sample Input : 2
------------------------
Kalyani Goverment  Engineering College

Process
---------------------------
[Kalyani, Goverment, , Engineering, College]

Output
---------------------------
Number of word : 4
*/
import java.util.*;
class p9
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1[]=sc.nextLine().trim().split("\\s+");
        int length=str1.length;
        System.out.println(length);


    }
}

/*\\s+ in Java Regex
Explanation:

\\s means "any whitespace character".
This includes:

space ' '

tab \t

newline \n

The + means "one or more" of those.

So:
java
Copy
Edit
split("\\s+")
means:
➡️ Split the string wherever there's one or more whitespace characters.

🔍 Example:
java
Copy
Edit
String s = "Java    is\tawesome\n";
String[] parts = s.trim().split("\\s+");

for(String word : parts)
    System.out.println(word);
Output:

csharp
Copy
Edit
Java
is
awesome */
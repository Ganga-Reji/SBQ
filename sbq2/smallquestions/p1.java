/* Find Characters of a string at odd index
 * Arijit = rjt
 * priyanka = ryna
*/

class p1
{
    public static void main(String args[])
    {

        String a="Arnold";
        for(int i=0;i<a.length();i++)
        {
            if((i%2)!=0)
            {
                System.out.println(a.charAt(i));
            }

        }
        System.out.println();
    }
}
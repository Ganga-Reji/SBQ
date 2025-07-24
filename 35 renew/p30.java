import java.util.*;
class Document
{
       //System.out.println("");
    int id;
    String title;
    String foldername;
    int pages;

    public Document(int id,String title,String foldername,int pages)
    {
        this.id=id;
        this.title=title;
        this.foldername=foldername;
        this.pages=pages;

    }

    //--------setter =---------//
  public  void set_id(int i)
    {
         this.id=i;
    }
    public void set_title(String t)
    {
        this.title=t;
    }
    public void set_foldername(String f)
{
    this.foldername=f;
}
public void set_pages(int p)
{
    this.pages=p;
}
//--- getter--//
public int get_id()
{
    return id;
}
//int id,String title,String foldername,int pages
public String get_title()
{
    return title;
}
public String get_foldername()
{
    return foldername;
}
public int get_pages()
{
    return pages;
}

}

class p30
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many documents are there: ");
        int n=sc.nextInt();sc.nextLine();
        Document[] ob=new Document[n];
        System.out.println("=============Adding features of documents========== ");
        for(int i=0;i<ob.length;i++)
        {
            //int id,String title,String foldername,int pages
           // Scanner sc=new Scanner(System.in);
           System.out.print("Enter the id: ");
         
            int a=sc.nextInt();sc.nextLine();
            System.out.println("");

            System.out.println("Enter title: ");
            String b=sc.nextLine();
            System.out.println("");

            System.out.println("Enter foldername: ");
            String c=sc.nextLine();
            System.out.println("");

            System.out.println("Enter pages: ");
            int d=sc.nextInt();sc.nextLine();
            System.out.println("");

            ob[i]=new Document(a,b,c,d);
            
        }

        Document[] result=docsWithOddPages(ob);
        System.out.println("Printing the rearranged documents in ascending order: ");
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i].get_id()+" "+result[i].get_title()+" "+result[i].get_foldername()+" "+result[i].get_pages());
        }


    }

    // --- first method---//

    public static Document[] docsWithOddPages(Document[] ob)
    {
        //doubt we are adding objects to the lost so is it<Document> ?
        //List<Integer> l1=new ArrayList<>();---> wrong as the doubt is correct
        List<Document> l1=new ArrayList<>();
        for(int i=0;i<ob.length;i++)
        {
            if(isOdd(ob[i].get_pages()))
            {
                l1.add(ob[i]);

            }
        }

        //now using comparar for ascening order thingy
        l1.sort(Comparator.comparingInt(Document::get_id));
        return l1.toArray(new Document[0]);
    }

    public static Boolean isOdd(int i)
    {
        if(i%2!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
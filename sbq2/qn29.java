import java.util.*;


/**
 * Document class to hold details about a document.
 */
class Document {
    private int id;
    private String title;
    private String folderName;
    private int pages;

    // Parameterized constructor
    public Document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFolderName() {
        return folderName;
    }

    public int getPages() {
        return pages;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}


class qn29{
    
    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);
        Document[] documents = new Document[4];

        // Reading input for 4 Document objects
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            String title = sc.nextLine();
            String folderName = sc.nextLine();
            int pages = sc.nextInt();
            sc.nextLine(); // Consume newline

            documents[i] = new Document(id, title, folderName, pages);
        }
            Document[] doc=docsWithOddPages(documents);
            for(int i=0;i<doc.length;i++)
            {
                System.out.println(doc[i].getId()+" "+doc[i].getTitle()+" "+doc[i].getFolderName()+" "+doc[i].getPages());

            }

    }
   
    
    
        public static Document[] docsWithOddPages(Document[] ob)
        {
            List<Document> l1=new ArrayList<Document>();
            for(int i=0;i<ob.length;i++)
            {
                if(isodd(ob[i].getPages()))
                {
                    l1.add(ob[i]);

                }
            }

            l1.sort(Comparator.comparingInt(Document::getId));
            return l1.toArray(new Document[0]);
        }

            public static boolean isodd(int a)
            {
                if(a%2!=0)
                {
                    return true;
                }

                else{
                    return false;
                }
            }
        }

    

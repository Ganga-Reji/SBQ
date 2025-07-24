import java.util.*;
class p37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Song[] s = new Song[5];
        for (int i = 0; i < s.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();

            s[i] = new Song(a,b,c,d); 
        }
        System.out.println("details song");
        String p=sc.nextLine();
        Song[] res=getSongsInAscendingOrder(s,p);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i].getId()+res[i].getTitle() );
        }
    }

    private static Song[] getSongsInAscendingOrder(Song[] ob,String p)
    {
        TreeMap<Double,Song> map=new TreeMap<>();
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getArtist().equals(p))
            {
                map.put(ob[i].getDuration(),ob[i]);
            }
        }

        return map.values().toArray(new Song[0]);
    }
}

class Song
{
    int id;
    String title;
    String artist;
    double duration;
    public Song(int id, String title, String artist, double duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    
}
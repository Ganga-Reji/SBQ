import java.util.*;
public class p34 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player3[] pl = new Player3[n];
        for (int i = 0; i < pl.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            pl[i] = new Player3(a,b,c,d,e);
        }
//=---------------------------------------------------------
        System.out.println("details:");
        String con = sc.nextLine();
        int r = sc.nextInt(); 
        Player3[] ans = findPlayerName(pl, con, r);
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i].getId()+" : "+ans[i].getName());
        }
        



    }

    private static Player3[] findPlayerName(Player3[] ob,String c,int r)
    {
        List<Player3> l=new ArrayList<>();
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getCountry().equals(c) && ob[i].getRun()>r)
            {
                l.add(ob[i]);
            }
        }

        return l.toArray(new Player3[0]);
    }
}

class Player3
{
    private int id;
    private String name;
    private String country;
    private int match;
    private int run;
    public Player3(int id, String name, String country, int match, int run) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.match = match;
        this.run = run;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getMatch() {
        return match;
    }
    public void setMatch(int match) {
        this.match = match;
    }
    public int getRun() {
        return run;
    }
    public void setRun(int run) {
        this.run = run;
    }
    
}
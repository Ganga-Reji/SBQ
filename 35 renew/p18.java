import java.util.*;
class Antenna {
    // Private attributes
    private int antennaid;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    // Parametrized constructor
    public Antenna(int antennaid, String antennaName, String projectLead, double antennaVSWR) {
        this.antennaid = antennaid;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    // Getter and Setter for antennaid
    public int getAntennaid() {
        return antennaid;
    }

    public void setAntennaid(int antennaid) {
        this.antennaid = antennaid;
    }

    // Getter and Setter for antennaName
    public String getAntennaName() {
        return antennaName;
    }

    public void setAntennaName(String antennaName) {
        this.antennaName = antennaName;
    }

    // Getter and Setter for projectLead
    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    // Getter and Setter for antennaVSWR
    public double getAntennaVSWR() {
        return antennaVSWR;
    }

    public void setAntennaVSWR(double antennaVSWR) {
        this.antennaVSWR = antennaVSWR;
    }
}
class p18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         Antenna[] ob=new Antenna[4];
         for(int i=0;i<ob.length;i++)
         {
            //int antennaid, String antennaName, String projectLead, double antennaVSWR
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble();sc.nextLine();
            ob[i]=new Antenna(a,b,c,d);
         }
        

    }

    public static  Antenna[] sortAntennaByVSWR(Antenna[] ob,double d)
    {
        //using list
        /* 
        List<Antenna> l1=new ArrayList<>();
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getAntennaVSWR()<d)
            {
                l1.add(ob[i]);
            }
    
        }
        if(l1.isEmpty())
        {
            return null;
        }
        else
        {
             l1.sort(Comparator.comparingDouble(Antenna::getAntennaVSWR));
             return l1.toArray(new Antenna[0]);     
        }
       */

       

//📌 Key = Double → which is the antennaVSWR (the value we want to sort by)

//📦 Value = Antenna object → the actual object we want to keep and return


       TreeMap<Double,Antenna> map=new TreeMap<>();
       for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getAntennaVSWR()<d)
            {
               map.put(ob[i].getAntennaVSWR(),ob[i]);
            }
    
        }
        //uppose this was your sorted TreeMap<Double, Antenna>:

/*java
Copy
Edit
{
  1.5 => Antenna("Alpha"),
  2.1 => Antenna("Bravo"),
  2.9 => Antenna("Charlie")
}
Then:

java
Copy
Edit
Collection<Antenna> values = map.values(); 
gives you: [Alpha, Bravo, Charlie] (sorted by VSWR).

And:

java
Copy
Edit
values.toArray(new Antenna[0]);
returns: Antenna[] { Alpha, Bravo, Charlie }.
*/

        Collection<Antenna> values=map.values();
        return values.toArray(new Antenna[0]);


    }
    
}
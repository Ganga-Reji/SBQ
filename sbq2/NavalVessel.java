import java.util.*;
public class NavalVessel {
    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification;

    /**
     * Constructor to initialize NavalVessel without classification
     */
    public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }

    // Getters and setters for each attribute

    public int getVesselId() {
        return vesselId;
    }

    public void setVesselId(int vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }

    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
class qn16
{
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create array of 4 NavalVessel objects and read input
        NavalVessel[] vessels = new NavalVessel[4];

        for (int i = 0; i < vessels.length; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            int planned = sc.nextInt(); sc.nextLine();
            int completed = sc.nextInt(); sc.nextLine();
            String purpose = sc.nextLine();

            vessels[i] = new NavalVessel(id, name, planned, completed, purpose);
        }
        System.out.println("Enter percentage : ");
        int perc=Integer.ParseInt(sc.nextLine());

        int average=findAvgVoyagesByPct(vessels,perc);

        System.out.println("average: "+" "+average);
    }

    public static int findAvgVoyagesByPct(NavalVessel[] ob,int per)
    {
        List<NavalVessel> l1=new ArrayList<>();
        int percentage; 

        int avg;
        int complete;
        int planed;
        int sum=0;
     

        for(int i=0;i<ob.length;i++)
        {
            complete=ob[i].getNoOfVoyagesCompleted();
            planed=ob[i].getNoOfVoyagesPlanned();
            percentage=getpercentage(per,complete,planed);
            if(percentage>=per)
            {
                sum=sum+ob[i].getNoOfVoyagesCompleted();
                l1.add(ob[i]);
            }
        }
        int[] array=l1.toArray(new NavalVessel[0]);
            avg=sum/l1.length();

            if(l1.isEmpty())
            {
                return 0;
            }
            else{
            return avg;
            }
           


    }

    public static int getpercentage(int p,int a, int b)
    {
        return ((p*(a * 100))/b);
    }
}
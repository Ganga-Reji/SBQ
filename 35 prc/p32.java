import java.util.*;

public class p32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] ta = new TravelAgencies[2];
        for(int i =0; i<2; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            boolean e = sc.nextBoolean();

            ta[i] = new TravelAgencies(a,b,c,d,e);
            TravelAgencies high_result=findAgencyWithHighestPackagePrice(ta);
           // System.out.println("Agency name: "+high_result.getAgencyName()+"price: "+high_result.Price);
           System.out.println("-----------------");
           int regNo = sc.nextInt();sc.nextLine();
           String packageType = sc.nextLine();
           TravelAgencies[] map=agencyDetailsForGivenldAndType(ta, regNo, packageType);
           if(map!=null)
           {
            for(int j=0;j<map.length;j++)
            {
                System.out.println(map[j].getAgencyName()+":"+map[j].getPrice());
            }
            
           }
        }
    }

        private static TravelAgencies findAgencyWithHighestPackagePrice(TravelAgencies[] ob)
        {
            TravelAgencies high=null;
            int max=0;
            for(int i=0;i<ob.length;i++)
            {
                if(ob[i].getPrice()>high.getPrice())
                {
                    high=ob[i];
                }
            }

            return high;
        }
        private static TravelAgencies[] agencyDetailsForGivenldAndType(TravelAgencies[] ob,int r,String p)
        {
            List <TravelAgencies> l=new ArrayList<>();
            for(int i=0;i<ob.length;i++)
            {
                if(ob[i].getRegno()==r && ob[i].getPackageType()==p)
                {

                    l.add(ob[i]);
                }

            }
            return l.toArray(new TravelAgencies[0]);
        }
    }



class TravelAgencies
{
    int regno;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;
// constructor
    public TravelAgencies(int regno, String agencyName, String packageType, int price, boolean flightFacility)
    {
        this.regno = regno;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
// getter method, setter method
    public int getRegno()
    {
        return regno;
    }
    public void setRegno(int regno)
    {
        this.regno = regno;
    }
    public String getAgencyName()
    {
        return agencyName;
    }
    public void setAgencyName(String agencyName)
    {
        this.agencyName = agencyName;
    }
    public String getPackageType()
    {
        return packageType;
    }
    public void setPackageType(String packageType)
    {
        this.packageType = packageType;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public boolean getFlightFacility()
    {
        return flightFacility;
    }
    public void setFlightFacility(boolean flightFacility)
    {
        this.flightFacility = flightFacility;
    }
}
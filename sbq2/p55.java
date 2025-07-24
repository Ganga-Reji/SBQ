import java.util.*;
class Resort {
    // Private attributes
    private int resortId;
    private String resortName;
    private String category;
    private double resortPrice;
    private double resortRating;

    // Parameterized constructor
    public Resort(int resortId, String resortName, String category, double resortPrice, double resortRating) {
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.resortPrice = resortPrice;
        this.resortRating = resortRating;
    }

    // Getters
    public int getResortId() {
        return resortId;
    }

    public String getResortName() {
        return resortName;
    }

    public String getCategory() {
        return category;
    }

    public double getResortPrice() {
        return resortPrice;
    }

    public double getResortRating() {
        return resortRating;
    }

    // Setters
    public void setResortId(int resortId) {
        this.resortId = resortId;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setResortPrice(double resortPrice) {
        this.resortPrice = resortPrice;
    }

    public void setResortRating(double resortRating) {
        this.resortRating = resortRating;
    }
}


public class p55
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Resort[] resorts = new Resort[4];

        // Input 4 Resort objects
        for (int i = 0; i < resorts.length; i++) {
            System.out.println("Enter details for Resort " + (i + 1) + ":");
            System.out.print("Resort ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Resort Name: ");
            String name = sc.nextLine();

            System.out.print("Category (e.g. 3 star, 5 star): ");
            String category = sc.nextLine();

            System.out.print("Resort Price: ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.print("Resort Rating: ");
            double rating = Double.parseDouble(sc.nextLine());

            resorts[i] = new Resort(id, name, category, price, rating);
        }
        System.out.println("enter match: ");
        String match=sc.nextLine();
        double result=findavgprice(resorts,match);
        if(result>0)
        {
            System.out.println("average price:"+" "+result);
        }
        else{
            System.out.println("No such Resort Found");
        }


    }


    public static double findavgprice(Resort[] ob,String str1)
    {
        double count=0.0;
        double sum=0.0;
        double average=0.0;
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getCategory().equalsIgnoreCase(str1))
            {
                sum=sum+ob[i].getResortPrice();
                count=count+1;

            }


        }
        if(count==0)
        {
            return 0;
        }
        else{
            average=sum/count;

        return average;
        }
        
    }
}
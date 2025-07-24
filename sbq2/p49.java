import java.util.*;
class Bill {
    private int billNo;
    private String name;
    private String typeOfConnection;
    private double billAmount;
    private boolean status;

    /**
     * Parameterized constructor to initialize the Bill object
     */
    public Bill(int billNo, String name, String typeOfConnection, double billAmount, boolean status) {
        this.billNo = billNo;
        this.name = name;
        this.typeOfConnection = typeOfConnection;
        this.billAmount = billAmount;
        this.status = status;
    }

    // Getters and Setters
    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfConnection() {
        return typeOfConnection;
    }

    public void setTypeOfConnection(String typeOfConnection) {
        this.typeOfConnection = typeOfConnection;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

class p49
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of bills
        sc.nextLine(); // consume newline

        Bill[] bills = new Bill[n];

        // Read bill details
        for (int i = 0; i < n; i++) {
            int billNo = sc.nextInt();
            sc.nextLine(); // consume newline
            String name = sc.nextLine();
            String typeOfConnection = sc.nextLine();
            double billAmount = sc.nextDouble();
            boolean status = sc.nextBoolean();
            sc.nextLine(); // consume newline

            bills[i] = new Bill(billNo, name, typeOfConnection, billAmount, status);
        }



        System.out.println("enter paramter to match: ");
       boolean p = Boolean.parseBoolean(sc.nextLine());

        Bill[] result=findBillWithMaxBillAmountBasedOnStatus(bills,p);

        if(result.length==0)
        {
            System.out.println("no objects");

        }

        else{
            for(int i=0;i<result.length;i++)
            {
                System.out.println("bill no: "+result[i].getBillNo()+"#"+result[i].getName());
            }
        }

     System.out.println("enter second string: ");
        String str2=sc.nextLine();

        int count=getCountWithTypeOfConnection(bills, str2);
        if(count<0)
        {
            System.out.println("There are no bills with given type of connection");
        }
        else{
            System.out.println("count: "+count);
        }
        

    }
    public static Bill[] findBillWithMaxBillAmountBasedOnStatus (Bill[] ob,boolean b)
    {
        List<Bill> l1=new ArrayList<Bill>();
        double max=-1;

        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].isStatus()==b)
            {
                if(ob[i].getBillAmount()>max)
                {
                    max=ob[i].getBillAmount();
                    l1.clear();
                    l1.add(ob[i]);
                }

                else if(ob[i].getBillAmount()==max)
                {
                    l1.add(ob[i]);
                }
            }
        }

        if(l1.isEmpty())
        {
            return null;
        }
       
             l1.sort(Comparator.comparingInt(Bill::getBillNo));
             return l1.toArray(new Bill[0]);
        


    
    }

    public static int getCountWithTypeOfConnection(Bill[] ob,String str)
    {
        int count=0;
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getTypeOfConnection().equalsIgnoreCase(str))
            {
                count=count+1;
            }

        }

        if(count==0)
        {
            return 0;
        }

        else{
            return count;
        }
    }
}
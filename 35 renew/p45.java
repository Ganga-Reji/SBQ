import java.util.*;
class Employee
{// check how i used to initiakise the variables without the privat keywor
     String name;
     int age;
     double sal;

     public Employee(String name,int age,double sal)
     {
        this.name=name;
        this.age=age;
        this.sal=sal;
     }

     //-getter
     public String get_name()
     {
        return name;
     }

     public int get_age()
     {
        return age;
     }

     public double get_sal()
     {
        return sal;
     }

     //--setter

    public void set_name(String n)
    {
        this.name=n;
    }

    public void set_age(int a)
    {
        this.age=a;
    }

    public void set_salary(double s)
    {
        this.sal=s;
    }


}

class p45
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        /*System.out.print("enter the no of employees:");
        int no=sc.nextInt();sc.nextLine();
        Employee[] ob=new Employee[no];
        for(int i=0;i<no;i++)
        {
            String a=sc.nextLine();
            int b=sc.nextInt();sc.nextLine();
            double c=sc.nextDouble();sc.nextLine();
            ob[i]=new Employee(a,b,c);

        }*/
        //--------
System.out.println("Enter employee details: ");
        String a=sc.nextLine();
        int b=sc.nextInt();sc.nextLine();
        double c=sc.nextDouble();sc.nextLine();
            
        Employee ob = new Employee(a,b,c);

        double yearlysal=calculateYearlySalary(ob);
        System.out.println("Printing yearly salary of the guy: "+yearlysal);
        double tax=calculateTax(ob);
        System.out.println("------------TAX----------------");

        System.out.println("Tax: "+tax);





    }

    //----functions

    public static double calculateYearlySalary(Employee ob)
    {
        return ob.get_sal()*12;


    }

    //--------
    public static double  calculateTax(Employee ob)
    {
            double tax;
        double ys=calculateYearlySalary(ob);
        if(ys<=50000)
        {
            tax=ys*0.1;

        }
        else if(ys>50000 && ys<=100000)
        {
            //the tax is 20% of the amount over 50000 plus 10% of the first 50000.
            tax=(0.1*50000)+(0.2*(ys-50000));


        }
        else
        {
            //is 30% of the amount over 100000 plus 20% of the amount between 50000 and 100000 
            //plus 10% of the first 50000.
            tax=(0.1*50000)+(0.3*(ys-100000))+(0.2*50000);
        }

        return tax;

    }
}
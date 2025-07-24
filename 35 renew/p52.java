import java.util.*;
class Employee
{
    int empid;
    String empname;
    String dept;
    int rating;
    int salary;

//-----------constructor---------//
    public Employee(int id,String name,String dept,int rat,int sal)
    {
        this.empid=id;
        this.empname=name;
        this.dept=dept;
        this.rating=rat;
        this.salary=sal;
    }
//-------------------------------------//

public int get_empid()
{
    return empid;
}

public void set_empid(int id)
{
    this.empid=id;
}

public String get_empName()
{
    return empname;
}

public void set_empname(String name)
{
    this.empname=name;
}

public String get_dept()
{
    return dept;
}

public void set_dept(String dept)
{
    this.dept=dept;
}

public int get_rating()
{
    return rating;
}
public void set_rating(int r)
{
    this.rating=r;
}

public int get_sal()
{
    return salary;
}

public void set_salary(int s)
{
    this.salary=s;
}

}

class p52
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        Employee ob[]=new Employee[4];
        for(int i=0;i<ob.length;i++)
        {
            //id,String name,String dept,int rat,int sal
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();
            sc.nextLine();
            int e=sc.nextInt();
            sc.nextLine();
            ob[i]=new Employee(a,b,c,d,e);

        }
    }

    public static String findDept(Employee[] ob,int parameter)
    {
        for(int i=0;i<ob.length;i++)
        {
            ob[i] 

        }

    }
}
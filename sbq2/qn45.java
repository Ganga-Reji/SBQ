
import java.util.*;




class Employee {
    private String name;
    private int age;
    private double salary;

    // Parameterized Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setSalary(double salary) { this.salary = salary; }
}

class qn45
{
  
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user for Employee details
        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();
        System.out.println("Enter Employee Age:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Monthly Salary:");
        double salary = Double.parseDouble(sc.nextLine());

        // Create Employee object
        Employee emp = new Employee(name, age, salary);

        double sal=calculateYearlySalary(emp);
        double tax=calculateTax(emp);
        System.out.println("yearly sal:"+" "+sal);
            System.out.println("tax amount::"+" "+tax);

        
    }
    public static double calculateYearlySalary(Employee ob)
    {
        double yearsal=ob.getSalary()*12;
        return yearsal;
        
    }

    public static double calculateTax(Employee ob)
    {
        double abc=calculateYearlySalary(ob);
        double tax;
        if(abc<=50000 )
        {
            tax=0.10*abc;

        }
        else if(abc>50000 && abc<=10000)
        {
            tax=(0.20*(abc-50000))+0.10*(5000);

        }

        else
        {
            tax=0.30*(abc-100000)+0.20*(50000)+0.10*50000;
        }

        return tax;
    }
}


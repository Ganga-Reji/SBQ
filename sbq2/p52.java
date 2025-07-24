import java.util.*;


class Employee {
    private int empId;
    private String empName;
    private String dept;
    private int rating;
    private int salary;

    // Parameterized constructor
    public Employee(int empId, String empName, String dept, int rating, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
        this.rating = rating;
        this.salary = salary;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDept() {
        return dept;
    }

    public int getRating() {
        return rating;
    }

    public int getSalary() {
        return salary;
    }

    // Setters (if needed)
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


class p52
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[5];
        System.out.println("enter employee details: ");

        // Read 5 employee objects
        for (int i = 0; i < 5; i++) {
            int empId = Integer.parseInt(sc.nextLine());
            String empName = sc.nextLine();
            String dept = sc.nextLine();
            int rating = Integer.parseInt(sc.nextLine());
            int salary = Integer.parseInt(sc.nextLine());

            employees[i] = new Employee(empId, empName, dept, rating, salary);
        }
System.out.println("enter integer parameter: ");
            int a=Integer.parseInt(sc.nextLine());
            Employee[] result=finddept(employees,a);
             if(result.length==0){
                
                System.out.println("no deptarment found");}
                else{
            for(int i=0;i<result.length;i++)

            {
              
           
           
                System.out.println("dept: "+result[i].getDept());
            
            }
           
                }

                System.out.println("enter string parameter: ");
                String b=sc.nextLine();
                int answer=findsecond(employees, b);

                if(answer==0)
                {
                    System.out.println("No data found");
                }

                else
                {
                    System.out.println("second highest:"+" "+answer);
                }


                

        
    }

    public static Employee[] finddept(Employee[] ob,int a)
    {
        List<Employee> l1=new ArrayList<Employee>();
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getSalary()==a && ob[i].getRating()>=3)
            {
                l1.add(ob[i]);

            }
        }

        return l1.toArray(new Employee[0]);
    }
  public static int findsecond(Employee[] ob,String a)
    {
        List<Employee> l1=new ArrayList<Employee>();
        for(int i=0;i<ob.length;i++)
        {
            if(ob[i].getDept().equalsIgnoreCase(a))
            {
                l1.add(ob[i]);

            }
        }

        l1.sort(Comparator.comparingInt(Employee::getSalary).reversed());
        return l1.get(1).getSalary();
    }
   


}
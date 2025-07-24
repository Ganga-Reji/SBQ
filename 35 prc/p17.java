import java.util.*;
import java.util.TreeMap;
class p17
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stu[] s = new Stu[1];
        for (int i = 0; i < s.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();
            String t="",m="",y="";
            for(int j=0; j<e.length(); j++)
            {
                if(j<2)
                {
                    t = t+e.charAt(j);
                }
                else if(j>2 && j<5)
                {
                    m = m+e.charAt(j);
                }
                else if(j>5)
                {
                    y = y+e.charAt(j);
                }
            }

            s[i] = new Stu(a,b,c,d,t,m,y);
        }
        System.out.println("grade:");
        char ch=sc.nextLine().charAt(0);
        System.out.println("month:");
        int month=sc.nextInt();
        sc.nextLine();
        Stu[] res=findStudentByGradeAndMonth(s,ch, month);
        if(res==null)
        {
            System.out.println("No student found");
        }

        else{

            for(int i=0;i<res.length;i++)
            {
                    System.out.println("name: "+res[i].getName()+"subject: "+res[i].getSub()+"total student: "+res.length);
            }
    

        }
      


    }

    private static Stu[] findStudentByGradeAndMonth(Stu[] ob,char ch,int m)
    {
        TreeMap<Integer,Stu> map=new TreeMap<>();
        for(int i=0;i<ob.length;i++){
        int mm=Integer.parseInt(ob[i].getMonth());
        
            if(ob[i].getGrade()==ch && mm==m);
            {
                map.put(ob[i].getRoll(),ob[i]);
            }
        
    }
        if(map==null){
            return null;
        }
        else{
            return map.values().toArray(new Stu[0]);
        }
    

}
}

class Stu
{
    private int roll;
    private String name;
    private String sub;
    private String day;
    private String month;
    private String year;
    private char grade;

    public Stu(int roll, String name, String sub, char grade, String day, String month, String year)
    {
        this.roll = roll;
        this.name = name;
        this.sub = sub;
        this.grade = grade;
        this.day = day;
        this.month = month;
        this.year =year;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth()
    {
        return month;
    }
    public void setMonth(String month)
    {
        this.month = month;
    }
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
} 
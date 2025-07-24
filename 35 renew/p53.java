import java.util.*;

class Course
{
     String coursename;
     int courseno;
     String mode;
     Boolean sharedata;

     public Course(String coursename,int courseno,String mode,Boolean sharedata)
     {
        this.coursename=coursename;
        this.courseno=courseno;
        this.mode=mode;
        this.sharedata=sharedata;
     }
     //-----------getter & setter----------//

     public String get_coursename()
     {
        return coursename;
     }

     public void set_coursename(String name)
     {
        this.coursename=name;
     }
//--------------------------------------
     public int get_courseno()
     {
        return courseno;
     }
     public void set_courseno(int no)
     {
        this.courseno=no;
     }

//-----------------------------------------
public String get_mode()
{
    return mode;
}

public void set_mode(String m)
{
    this.mode=m;
}
//------------------------------------------
public Boolean get_data()
{
    return sharedata;
}

public void set_data(Boolean d)
{
    this.sharedata=d;
}
//----------------------------------------------


}



class p53
{
    public static void main(String args[])
    {
        Course[] ob= new Course[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            String a= sc.nextLine();
            int b= sc.nextInt();sc.nextLine();
            String c=sc.nextLine();
            Boolean d=sc.nextBoolean();
            ob[i]=new Course(a,b,c,d);

        }


        String result= findCourseStatus("Science",ob);
        System.out.println(result);

    }
        public  static   String  findCourseStatus(String name,Course[] ob)
        {
           Boolean flag=false;
            int sum=0;
            for(int i=0;i<ob.length;i++)
            {
                if(ob[i].get_coursename().equalsIgnoreCase(name))
            {
                sum=sum+ob[i].get_courseno();
                flag=true;
            }
            
               
            }
            
            if(flag!=true)
            {
                return "no course";
            }
            else{
            if(sum>=1000)
            {
                return ("High");
            }
            else if(sum>=500 && sum<1000)
            {
               return("Medium");
            }
            else{
                return("Low");
            }

        }
    }
    }

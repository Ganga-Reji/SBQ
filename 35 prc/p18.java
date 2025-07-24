import java.util.*;
class p18
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Antenna[] an = new Antenna[4];
		for(int i=0; i<4; i++)
		{
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			double d = sc.nextDouble();sc.nextLine();
			
			an[i]=new Antenna(a,b,c,d);
		}	

		System.out.println("vsmr enter: ");
		Double v=sc.nextDouble();
		sc.nextLine();

		Antenna[] res=sortAntennaByVSWR(an,v);
		if(res!=null)
		{
			for(int i=0;i<res.length;i++)
			{
				System.out.println("name:"+res[i].getName());
			}
	
		}

		else{
			System.out.println( "No Antenna found");
			
		}
	

	}


	/// method
	
	private static Antenna[] sortAntennaByVSWR(Antenna[] ob,double b)
	{
		TreeMap<Antenna,Double> map=new TreeMap<>();
		for(int i=0;i<ob.length;i++)
		{
			if(ob[i].getVSWR()<b)
			{
				map.put(ob[i],ob[i].getVSWR());
			}
		}

		return map.values().toArray(new Antenna[0]);
	}
}

class Antenna
{
	private int id;
	private String name,lead;
	private double VSWR;
	public Antenna(int id, String name, String lead, double VSWR)
	{
		this.id = id;
		this.name = name;
		this.lead = lead;
		this.VSWR = VSWR;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getLead()
	{
		return lead;
	}
	public void setLead(String lead)
	{
		this.lead = lead;
	}
	public double getVSWR()
	{
		return VSWR;
	}
	public void setVSWR(double VSMR)
	{
		this.VSWR=VSWR;
	}
}

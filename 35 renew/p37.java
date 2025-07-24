import java.util.*;
class Song
{
    private int songid;
    private String title;
    private String artist;
    private double duration;

    public Song(int songid,String title,String artist,double duration)
    {
    	this.songid=songid;
    	this.title=title;
    	this.artist=artist;
    	this.duration=duration;
        
    }
    
    // getter
    
    public  int get_id()
    {
    	return songid;
    }
    
    public String get_title()
    {
    	return title;
    }
    
    public String get_artist()
    {
    	return artist;
    }
    
    public double get_duration()
    {
    	return duration;
    }
    
    //---- setter
    
    public void set_id(int id)
    {
    	this.songid=id;
    }
    public void set_title(String t)
    {
    	this.title=t;
    }
    public void set_artist(String a)
    {
    	this.artist=a;
    }
    public void set_duration(double d)
     {
    	this.duration=d;
    	
    }

}

class p37
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	//---------creating an array of objects----//
	Song[] ob=new Song[5];
	//looping to add objects--//
	
    System.out.println("Enter the songid,title,artist,duration for 5 songs:");
	for(int i=0;i<ob.length;i++)
	{
		int a = sc.nextInt();sc.nextLine();
		String b= sc.nextLine();
		String c= sc.nextLine();
		double d= sc.nextDouble();sc.nextLine();
		
		//--- now adding the attributes for each object
		ob[i]= new Song(a,b,c,d);
	}
	
	// first function finding sum
	System.out.println("Enter the artist name:");
	String artist=sc.nextLine();
	
	
	double sum_result=findSongDurationForArtist(ob,artist);
	System.out.println("The sum of the duration of the song: "+sum_result);

	System.out.println("testing the ascending order thingy");
	//String artist= sc.nextLine();

	// getting the reuslt of the array of song objects based on ascenidng order
	Song[] result=getSongsInAscendingOrder(ob, artist);
	for(int i=0;i<result.length;i++)
	{
		System.out.println("song id: "+result[i].get_id()+" "+"song title: "+result[i].get_title());
	}

}

public static double	findSongDurationForArtist(Song[] ob,String p)
{
	double sum=0;
	for(int i=0;i<ob.length;i++)
	{
		if((ob[i].get_artist()).equals(p))
		{
			sum=sum+ob[i].get_duration();
		}
		
	}
	
	if(sum==0)
	{
		return 0;
		
	}
	
	else
	{
		return sum;
	}
}

public static Song[]   getSongsInAscendingOrder(Song ob[],String a)
{
	//TreeMap<String,Double> map=new TreeMap(); --> dot use treemap coz it will delete duplicate entries but we need the entire one, artists might get repeated so so the final one will be taken
	List<Song> sl=new ArrayList<>();


	for(int i=0;i<ob.length;i++)
	{
		if(ob[i].get_artist().equals(a))
		{
			 sl.add(ob[i]);//---> we added the matching song objects to the list
;		}
	}
	if(sl.isEmpty())
	{
		return null;
	}

	sl.sort(Comparator.comparingDouble(Song::get_duration));
	//converting lost to an array
	return sl.toArray(new Song[0]);

}

}
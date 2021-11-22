import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Vector;

public class InThread1 extends Thread {
	
	Vector<String> vector=new Vector<>();
	Vector<String> v2=new Vector<>();
	Map<String,Integer> mp=new TreeMap<>();
	
	public InThread1(BST obj) {
		// TODO Auto-generated constructor stub
		run(obj);
	}

	public void run(BST Tree)
	{
		System.out.println("Thread 2 is Running\n\n");
		String Path="C:\\Users\\usman\\OneDrive\\Desktop\\file1.txt";
		String Line="";
		try {
			BufferedReader bufr=new BufferedReader(new FileReader(Path));
			try {
				while ((Line=bufr.readLine())!=null)
				{
					vector.add(Line);
					StringTokenizer defaultTokenizer = new StringTokenizer(Line);
					while(defaultTokenizer.hasMoreTokens())
					{
						v2.add(defaultTokenizer.nextToken());
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	
		for (int i=0;i<v2.size();i++)
		{
			String a="";
			a=v2.elementAt(i);
			if(Tree.search(a))
			{
			
				if(mp.containsKey(a))
					mp.put(a, mp.get(a)+1);
				else
					mp.put(a,1);
			}
		}
		
		
		//TOKENIZE VECTOR
		
		
		
	}
	public void display()
	{
		System.out.println(v2);
	}
	
	public void displaymap()
	{
		for(Map.Entry<String,Integer> entry:
            mp.entrySet())
		{
			System.out.println(entry.getKey()+
            " - "+entry.getValue());
		}
	}
}

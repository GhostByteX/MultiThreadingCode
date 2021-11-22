import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

public class InThread2 extends Thread{

	public InThread2(BST obj) {
		// TODO Auto-generated constructor stub
		run(obj);
	}

	public void run(BST Tree)
	{
		System.out.println("Thread 3 is Running\n\n");
		Vector<String> vector=new Vector<>();
		Vector<String> v3=new Vector<>();
		String Path="C:\\Users\\usman\\OneDrive\\Desktop\\file2.txt";
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
						v3.add(defaultTokenizer.nextToken());
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
	
		
		System.out.println(vector);
		System.out.println("\nV3\n\n\n");
		System.out.println(v3);
		for (int i=0;i<v3.size();i++)
		{
			String a="";
			a=v3.elementAt(i);
			System.out.print(Tree.search(a));
		
		}
	}
	
}
	


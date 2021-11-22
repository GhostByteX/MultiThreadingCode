import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

public class InThread1 extends Thread {
	public InThread1(BST obj) {
		// TODO Auto-generated constructor stub
		run(obj);
	}

	public void run(BST Tree)
	{
		Vector<String> vector=new Vector<>();
		Vector<String> v2=new Vector<>();
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
	
		
		System.out.println(vector);
		System.out.println("\nV2\n\n\n");
		System.out.println(v2);
		System.out.print(Tree.search("cap")+"\n\n");
		for (int i=0;i<v2.size();i++)
		{
			String a="";
			a=v2.elementAt(i);
			System.out.print(Tree.search(a));
		
		}
		
		//TOKENIZE VECTOR
		
		
		
	}
	
}

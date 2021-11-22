import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Vector;

class VocablaryThread extends Thread {

	public VocablaryThread(BST obj) {
		// TODO Auto-generated constructor stub
		run(obj);
	}

	public void run(BST Tree)
	{
		System.out.println("Thread 1 is Running\n\n");
		//BST Tree = new BST();
		String Path="C:\\Users\\usman\\OneDrive\\Desktop\\vocab.txt";
		String Line="";
		try {
			BufferedReader bufr=new BufferedReader(new FileReader(Path));
			try {
				while ((Line=bufr.readLine())!=null)
				{
					Tree.addNode(Line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		Tree.traversePreOrder();
		
	}
	
	
}


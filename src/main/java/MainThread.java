import java.util.Vector;

public class MainThread extends Thread {
	
	public static void main (String[] args) throws InterruptedException
	{
	BST obj=new BST();
	VocablaryThread t1=new VocablaryThread(obj);
	t1.start();
	t1.join();
	InThread1 t2=new InThread1(obj);
	t2.start();
	t2.join();
	InThread2 t3=new InThread2(obj);
	t3.start();
	t3.join();
	
	
	}
}

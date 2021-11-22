import java.util.Scanner;
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
		
		Scanner kb=new Scanner(System.in);
		int choice=0;
		do {
			System.out.print("\n\nPress 1 to Display the BST from Vocablary\nPress 2 to Display the Vectors from Input Files 1 and 2\nPress 3 to view matches and frequency\nPress 4 to search\nPress 5 to Exit\n\n\n");
			
		choice=kb.nextInt();
		
		switch(choice)
		{
		
		case 1:
			t1.display(obj);
			break;
		case 2:
			t2.display();
			t3.display();
			break;
			
		case 3:
			t2.displaymap();
			t3.displaymap();
			break;
		case 4:
			System.out.print("Yet to be Implemented\n");
			break;
		case 5:
			return;
		
		}
	}while (choice!=5);
		
		
		
}
}

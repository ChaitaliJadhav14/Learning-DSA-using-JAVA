package queue_example;

import java.util.Scanner;

public class Circular_Queue {
	int front, rear, MaxSize, queue[], counter = 0;

	void create_stack(int size)
	{
	    MaxSize = size;
	    front = 0;
	    rear = -1;
	    queue = new int[MaxSize];
	}
	
	void enqueue(int data)
	{
	    rear = (rear + 1) % MaxSize;
	    queue[rear] = data;
	    counter++; 
	}
	
	boolean is_full()
	{
	    return counter == MaxSize;
	}
	
	int dequeue()
	{
	    int temp = queue[front];
	    front = (front + 1) % MaxSize;
	    counter--; 
	    return temp;
	}
	
	boolean is_empty()
	{
	    return counter == 0;
	}
	
	void print_queue()
	{
	    int i = front;
	
	    for (int c=0;c<counter;c++)
	    {
	        System.out.print(queue[i] + " ");
	        i=(i+1)%MaxSize;
	    }
	}
	public static void main(String[] args)
	{
		Circular_Queue obj=new Circular_Queue();
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter size of Queue:");
	    int size=in.nextInt();
	    int choice=0;
	    obj.create_stack(size);
	    do
	    {
	        System.out.print("\nQueue Menu");
	        System.out.print("\n----------");
	        System.out.print("\n1.Enqueue");
	        System.out.print("\n2.Dequeue");
	        System.out.print("\n3.Print");
	        System.out.print("\n0.Exit");
	        System.out.print("\n:");
	        choice=in.nextInt();
	        switch (choice) {
	        case 1:
	            if (!obj.is_full())//not full
	            {
	                System.out.print("\nEnter Data:");
	                int data=in.nextInt();
	                obj.enqueue(data);     
	                System.out.print("\n"+data+" pushed");
	            }
	            else
	                System.out.print("\nQueue Full");
	            break;
	        case 2:
	            if (!obj.is_empty())//not empty
	            {
	                System.out.print("\n"+obj.dequeue()+" is poped..");
	            }
	            else
	                System.out.print("\nQueue Empty");
	            break;
	        case 3:
	            if (!obj.is_empty())//not empty
	            {
	                System.out.print("\nQueue has:\n");
	                obj.print_queue();
	            }
	            else
	                System.out.print("\nQueue Empty");
	            break;
	        case 0:
	            System.out.print("\n Thanks for using the code..amar.career");
	            break;
	        default:
	            System.out.print("\nWrong Choice given.");
	            break;
	    }
	}while(choice!=0);
	}
}
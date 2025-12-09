package queue_example;

import java.util.Scanner;

public class Queue_Class {
	 int front,rear,MaxSize,queue[];
	    void create_stack(int size)
	    {
	        MaxSize=size;
	        front=0;
	        rear=-1;
	        queue=new int[MaxSize];
	    }
	    void enqueue(int data)
	    {
	    	queue[++rear]=data;
	    }
	    boolean is_full()
	    {
	        return(rear==MaxSize-1);
	    }
	    int dequeue()
	    {
	        return(queue[front++]);
	    }

	    boolean is_empty()
	    {
	    	return (front>rear);
	    }
	void print_queue()//print stack in LIFO manner means from top to bottom
	    {
	        for(int i=front;i<=rear;i++)
	            System.out.print(queue[i]+" , ");
	    }
	
	public static void main(String[] args)
{
  Queue_Class obj=new Queue_Class();
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
          System.out.print("\n Thanks for using the code...");
          break;
      default:
          System.out.print("\nWrong Choice given.");
          break;
  }
}while(choice!=0);
}

}

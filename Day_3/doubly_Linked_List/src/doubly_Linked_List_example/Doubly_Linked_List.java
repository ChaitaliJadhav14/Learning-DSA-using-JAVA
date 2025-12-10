package doubly_Linked_List_example;

import java.util.Scanner;

public class Doubly_Linked_List {
	 Dnode root;//single data member
	    //insert_left
	    void insert_left(int data)
	    {
	        Dnode n=new Dnode(data);//created Dnode
	        if(root==null)//not assigned till now
	            root=n;
	        else
	        {
	            n.right=root;//1:   2100
	            root.left=n;//2 root=3400
	            root=n;//3
	        }
	    }
	    void delete_left()
	    {
	        if(root==null)//not assigned till now
	            System.out.print("\nList empty");
	        else
	        {
	            Dnode t=root;//1
	            if(root.right==null)//one element only
	                root=null;
	            else {
	                root = root.right;//2
	                root.left = null;//3 should be used iff root exists
	            }
	            System.out.println(t.data+" Deleted");
	        }
	    }
	    void insert_right(int data)
	    {
	        Dnode n=new Dnode(data);//created Dnode
	        if(root==null)//not assigned till now
	            root=n;
	        else
	        {
	            Dnode t=root;//1
	            while(t.right!=null)//2  right most
	                t=t.right;
	            t.right=n;//3
	            n.left=t;//4
	        }
	    }
	    void delete_right()
	    {
	        if(root==null)//not assigned till now
	            System.out.print("\nList empty");
	        else
	        {
	            Dnode t,t2;
	            t=root;//1
	            while(t.right!=null)//2
	                t=t.right;

	            if(t==root)
	                root=null;//manual deletion
	            else
	            {
	                t2=t.left;//3
	                t2.right=null;//4
	            }
	            System.out.println(t.data+" Deleted");
	        }
	    }
	    void print_list()
	    {
	        if(root==null)//not assigned till now
	            System.out.print("\nList empty");
	        else {
	            Dnode t;
	            t = root;//1
	            while (t != null)//2
	            {
	                System.out.print("<-|" + t.data + "|->");
	                t = t.right;
	            }
	        }

	    }
	    void print_list_reverse()
	    {
	        if(root==null)//not assigned till now
	            System.out.print("\nList empty");
	        else {
	            Dnode t;
	            t = root;//1
	            while (t.right!= null)//2
	                t = t.right;
	            while (t != null)//2
	            {
	                System.out.print("<-|" + t.data + "|->");
	                t = t.left;
	            }
	        }

	    }
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        Doubly_Linked_List obj = new Doubly_Linked_List();

	        while(true)
	        {
	            System.out.println("\n\n===== DOUBLY LINKED LIST MENU =====");
	            System.out.println("1. Insert Left");
	            System.out.println("2. Insert Right");
	            System.out.println("3. Delete Left");
	            System.out.println("4. Delete Right");
	            System.out.println("5. Print List");
	            System.out.println("6. Print List Reverse");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");

	            int ch = sc.nextInt();

	            switch(ch)
	            {
	                case 1:
	                    System.out.print("Enter data: ");
	                    obj.insert_left(sc.nextInt());
	                    break;

	                case 2:
	                    System.out.print("Enter data: ");
	                    obj.insert_right(sc.nextInt());
	                    break;

	                case 3:
	                    obj.delete_left();
	                    break;

	                case 4:
	                    obj.delete_right();
	                    break;

	                case 5:
	                    obj.print_list();
	                    break;

	                case 6:
	                    obj.print_list_reverse();
	                    break;

	                case 0:
	                    System.out.println("Mission terminated. Exiting program ✨");
	                    return;

	                default:
	                    System.out.println("Invalid choice boss, run it back 👀");
	            }
	        }
	    }
	}

package Linked_List_Examples;

import java.util.Scanner;

public class Linked_List_Linear
{
    Node root;//single data member
    //insert_left
    void insert_left(int data)
    {
        Node n=new Node(data);//created node
        if(root==null)//not assigned till now
            root=n;
        else
        {
            n.next=root;//1:   2100
            root=n;//2 root=3400
        }
    }
    void delete_left()
    {
        if(root==null)//not assigned till now
            System.out.print("\nList empty");
        else
        {
            Node t=root;//1
            root=root.next;//2
            System.out.println(t.data+" Deleted");
        }
    }
    void insert_right(int data)
    {
        Node n=new Node(data);//created node
        if(root==null)//not assigned till now
            root=n;
        else
        {
           Node t=root;//1
           while(t.next!=null)//2  right most
               t=t.next;
           t.next=n;//3
        }
    }
    void delete_right()
    {
        if(root==null)//not assigned till now
            System.out.print("\nList empty");
        else
        {
            Node t,t2;
            t=t2=root;//1
            while(t.next!=null)//2
            {
                t2=t;
                t=t.next;
            }
            if(t==root)
                root=null;//manual deletion
            else
                t2.next=null;//3
            System.out.println(t.data+" Deleted");
        }
    }
    void print_list()
    {
        if(root==null)//not assigned till now
            System.out.print("\nList empty");
        else {
            Node t;
            t = root;//1
            while (t != null)//2
            {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
        }

    }
    boolean search_list(int key)
    {
        if(root==null)//not assigned till now
            System.out.print("\nList empty");
        else
        {
            Node t;
            t = root;//1
            while (t != null)//2
            {
              if(t.data==key)//found
              {
                  return true;
              }
              t=t.next;
            }
        }
        return false;
    }

    void insert_after(int ref,int new_element)
    {
        if(root==null)//not assigned till now
            System.out.print("\nList empty");
        else
        {
            Node t;
            t = root;//1
            while (t != null)//2
            {
                if(t.data==ref)//found
                {
                    System.out.print("\nReference Found..");
                    Node n=new Node(new_element);
                    n.next=t.next;//1
                    t.next=n;//2
                    return;
                }
                t=t.next;
            }
        }
    }
    void delete_element(int element)//search ,if found delete
    {
        if (root == null)//not assigned till now
            System.out.print("\nList empty");
        else
        {
            Node t, t2;
            t = t2 = root;//1
            while (t != null)//2
            {
                if (t.data == element)//found
                {
                    System.out.print("\nFound");
                    if (t == root)//case 1
                        root = root.next;
                    else if (t.next == null)//case 2
                        t2.next = null;
                    else//case 3
                        t2.next = t.next;
                    System.out.println(t.data + " deleted");
                    return;
                }
                t2 = t;
                t = t.next;
            }
            if (t == null)//not found
                System.out.print("\nElement:" + element + " not found");
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Linked_List_Linear list = new Linked_List_Linear();
        int ch;
        do
        {
            System.out.println("\n\n===== LINKED LIST OPS =====");
            System.out.println("1. Insert Left");
            System.out.println("2. Delete Left");
            System.out.println("3. Insert Right");
            System.out.println("4. Delete Right");
            System.out.println("5. Print List");
            System.out.println("6. Search Element");
            System.out.println("7. Insert After");
            System.out.println("8. Delete Element");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
             ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.print("Enter element: ");
                    list.insert_left(sc.nextInt());
                    break;

                case 2:
                    list.delete_left();
                    break;

                case 3:
                    System.out.print("Enter element: ");
                    list.insert_right(sc.nextInt());
                    break;

                case 4:
                    list.delete_right();
                    break;

                case 5:
                    list.print_list();
                    break;

                case 6:
                    System.out.print("Enter key: ");
                    System.out.println(list.search_list(sc.nextInt()) ? "\nFound" : "\nNot Found");
                    break;

                case 7:
                    System.out.print("Enter reference element: ");
                    int ref = sc.nextInt();
                    System.out.print("Enter new element: ");
                    int newel = sc.nextInt();
                    list.insert_after(ref, newel);
                    break;

                case 8:
                    System.out.print("Enter element to delete: ");
                    list.delete_element(sc.nextInt());
                    break;

                case 0:
                    System.out.println("Mission terminated. Exiting… ✨");
                    break;

                default:
                    System.out.println("Invalid choice, boss.");
            }
        }while(ch!=0);
    }
    }

//tomorrow cicular and doubly linked list

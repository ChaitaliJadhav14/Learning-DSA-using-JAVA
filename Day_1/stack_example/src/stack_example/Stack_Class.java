package stack_example;

import java.util.Scanner;
//without using collection framework
public class Stack_Class {
	int tos,MaxSize,stack[];
    void create_stack(int size)
    {
        MaxSize=size;
        tos=-1;//init as stack starts from 0th index(Array)
        stack=new int[MaxSize];
    }
    //push:Inserts one element on top of the stack.
    //tos+1 and then accept the element
    void push(int data)
    {
        tos++;
        stack[tos]=data;
        //stack[++tos]=data;
    }
    //is_full:
    // if tos is at last location return true(full)e else false
    boolean is_full()
    {
        if(tos==MaxSize-1)
            return true;
        else
            return false;
        //return(tos==MaxSize-1);
    }
    //pop:
    // Remove and returns the topmost element from the stack by reducing tos-1.
    int pop()
    {
       int temp=stack[tos];
       tos--;//reduced
        return(temp);
        //return(stack[tos--]);
    }

    //is_empty
    //Sources at -1, that means stack is empty, so returns true.
    boolean is_empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
        //return(tos==-1);
    }
    //peek
    // only returns the topmost element from the stack.
    int peek()
    {
        return(stack[tos]);
    }
void print_stack()//print stack in LIFO manner means from top to bottom
    {
        for(int i=tos;i>=0;i--)
            System.out.println(stack[i]);
    }

public static void main(String[] args)
{
    Stack_Class obj=new Stack_Class();
    Scanner in=new Scanner(System.in);
    System.out.println("Enter size of stack:");
    int size=in.nextInt();
    int choice=0;
    obj.create_stack(size);
    do
    {
        System.out.print("\nStack Menu");
        System.out.print("\n----------");
        System.out.print("\n1.Push");
        System.out.print("\n2.Pop");
        System.out.print("\n3.Peek");
        System.out.print("\n4.Print");
        System.out.print("\n0.Exit");
        System.out.print("\n:");
        choice=in.nextInt();
        switch (choice) {
            case 1:
                if (!obj.is_full())//not full
                {
                    System.out.print("\nEnter Data:");
                    int data=in.nextInt();
                    obj.push(data);
                    System.out.print("\n"+data+" pushed");
                }
                else
                    System.out.print("\nStack Full");
                break;
            case 2:
                if (!obj.is_empty())//not empty
                {
                    System.out.print("\n"+obj.pop()+" is poped..");
                }
                else
                    System.out.print("\nStack Empty");
                break;
            case 3:
                if (!obj.is_empty())//not empty
                {
                    System.out.print("\n"+obj.peek()+" is at peek");
                }
                else
                    System.out.print("\nStack Empty");
                break;
            case 4:
                if (!obj.is_empty())//not empty
                {
                    System.out.print("\nStack has:\n");
                    obj.print_stack();
                }
                else
                    System.out.print("\nStack Empty");
                break;
            case 0:
                System.out.print("\n Thanks for using the code......");
                break;
            default:
                System.out.print("\nWrong Choice given.");
                break;

        }
    }while(choice!=0);
}

}






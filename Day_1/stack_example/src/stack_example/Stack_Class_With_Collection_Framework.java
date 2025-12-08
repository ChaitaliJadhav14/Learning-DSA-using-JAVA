package stack_example;
import java.util.Scanner;
import java.util.Stack;

public class Stack_Class_With_Collection_Framework {

	    public static void main(String[] args) {

	        Stack<Integer> stack = new Stack<>();
	        Scanner in = new Scanner(System.in);
	        int choice = 0;

	        do {
	            System.out.print("\nStack Menu");
	            System.out.print("\n----------");
	            System.out.print("\n1.Push");
	            System.out.print("\n2.Pop");
	            System.out.print("\n3.Peek");
	            System.out.print("\n4.Print");
	            System.out.print("\n0.Exit");
	            System.out.print("\n:");
	            choice = in.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("\nEnter Data: ");
	                    int data = in.nextInt();
	                    stack.push(data);
	                    System.out.println("\n" + data + " pushed");
	                    break;

	                case 2:
	                    if (!stack.isEmpty()) {
	                        System.out.println("\n" + stack.pop() + " popped");
	                    } else {
	                        System.out.println("\nStack Empty");
	                    }
	                    break;

	                case 3:
	                    if (!stack.isEmpty()) {
	                        System.out.println("\n" + stack.peek() + " is at top");
	                    } else {
	                        System.out.println("\nStack Empty");
	                    }
	                    break;

	                case 4:
	                    if (!stack.isEmpty()) {
	                        System.out.println("\nStack contains:");
	                        for (int i = stack.size() - 1; i >= 0; i--) {
//	                            System.out.println(stack.get(i));
	                        	System.out.print("\n"+stack.elementAt(i));
	                        }
	                    } else {
	                        System.out.println("\nStack Empty");
	                    }
	                    break;

	                case 0:
	                    System.out.println("\nThanks for using the code...");
	                    break;

	                default:
	                    System.out.println("\nWrong Choice");
	            }

	        } while (choice != 0);
	    }
	


}

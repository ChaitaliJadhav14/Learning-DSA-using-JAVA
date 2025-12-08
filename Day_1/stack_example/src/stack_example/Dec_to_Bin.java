package stack_example;

import java.util.Scanner;
import java.util.Stack;

public class Dec_to_Bin
{
    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = in.nextInt();
        //till number is not zero %2-->push stack /2-->update number contiunes

        // Step 1: Convert decimal → binary (push remainders into stack)
        while(number > 0)
        {
            int rem = number % 2;   // remainder
            obj.push(rem);        // push into stack
            number = number / 2;      // update number
        }

        // Step 2: Pop all elements → gives binary output
        System.out.print("\nBinary of :");
      
        //till stack not empty pop and print
        while(!obj.empty())
        {
        	System.out.print(obj.pop());

        }

    }
}


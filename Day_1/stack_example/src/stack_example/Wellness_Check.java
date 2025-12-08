//wellness
package stack_example;

import java.util.Scanner;
import java.util.Stack;

public class Wellness_Check
{
	static boolean Check_Wellness(String Pattern)
    {
        Stack<Character> obj = new Stack<>();
        for(char c:Pattern.toCharArray())//read char by char
        { if(c=='{')// if { push to stack
            obj.push(c);
        else if (c=='}')//if } pop if not empty else return false
        {
            if(obj.empty())//if empty false
                return false;
            else
                obj.pop();
        }
        }//for
        return (obj.empty());//end return stack.empty()
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Pattern:");
        String Pattern = in.next();
        boolean result=Check_Wellness(Pattern);
        System.out.print("\nPattern:"+Pattern+" is:"+result);

    }
}




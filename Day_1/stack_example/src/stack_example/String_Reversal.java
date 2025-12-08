//string reversal
package stack_example;

import java.util.Scanner;
import java.util.Stack;

public class String_Reversal
{
    public static void main(String[] args) {
        Stack<Character> obj = new Stack<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = in.next();
        String rword = "";
        //use loop to add one character at a time in stack
        
        /*
          for(int i = 0; i < word.length(); i++) {
            obj.push(word.charAt(i));
        }
        */
        for(char c:word.toCharArray())
            obj.push(c);

        //till stack not empty pop and copy poped to rword  '+'
        while(!obj.isEmpty()) {
            rword = rword + obj.pop();
        }
        System.out.println("Reversed Word: " + rword);
    }
}

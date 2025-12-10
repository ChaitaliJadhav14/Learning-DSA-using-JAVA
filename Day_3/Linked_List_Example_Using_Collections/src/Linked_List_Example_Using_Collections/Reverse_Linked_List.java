package Linked_List_Example_Using_Collections;

import java.util.LinkedList;
import java.util.Stack;

public class Reverse_Linked_List {
	public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(30);
        list.add(5);

        System.out.println("List has: " + list);

        Stack<Integer> stack = new Stack<>();

        // Push elements into stack
        while (!list.isEmpty())
            stack.push(list.removeFirst());

        // Pop back into list (reversed)
        while (!stack.empty())
            list.add(stack.pop());

        System.out.println("\nReversed List has: " + list);
    }
}
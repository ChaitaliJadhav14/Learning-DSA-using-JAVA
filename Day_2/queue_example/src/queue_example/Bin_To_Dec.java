package queue_example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bin_To_Dec {
	//oct to decimal
	//hexa to decimal
	
	 public static void main(String[] args) {
	        Queue<Integer> obj = new LinkedList<>();
	        //Is an interface which gets implemented via linked list class.
	        Scanner in = new Scanner(System.in);
	        System.out.print("\nEnter Binary Number:");
	        String binary = in.next();
	        for (char c : binary.toCharArray()) {
	            obj.add(c - '0');//Convert directly to int and store.
	        }
	        int sum = 0;
	        while (!obj.isEmpty()) {
	            sum += (obj.remove() * Math.pow(2, obj.size() ));
	        }

	        System.out.print("\nDecimal is:" + sum);
	    }

	}
//double linked list remaining
//implement stack using queue
package StudentManagement;

import java.util.LinkedList;
import java.util.Scanner;

class Snode
{
    int roll,age;
    String name,gender;
    Snode next;
    Snode(int roll,String name,String gender,int age)
    {
        this.roll=roll;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.next=null;
    }
    void print_Snode()
    {
        System.out.print("\nRoll no:"+roll+"\tName:"+name+"\tGender:"+gender+"\tAge:"+age);
    }
}


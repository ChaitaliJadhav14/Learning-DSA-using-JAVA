package StudentManagement;

import java.util.LinkedList;
import java.util.Scanner;

public class Student_Management_System_Basic
{
    public static void main(String[] args)
    {
        LinkedList<Snode> StudentList=new LinkedList<>();
        Scanner in=new Scanner(System.in);
        //adding record

        Snode s=new Snode(1,"abcde","male",26);
        StudentList.add(s);
        Snode s1=new Snode(2,"appu","male",16);
        StudentList.add(s1);
        Snode s2=new Snode(3,"appi","female",6);
        StudentList.add(s2);
        Snode s3=new Snode(4,"appa","male",56);
        StudentList.add(s3);


        //print all
        for(Snode item:StudentList)
        {
            item.print_Snode();
        }

        //searching:
        System.out.print("\nEnter roll number to search:");
        int roll=in.nextInt();
        boolean flag=false;
        for (Snode item:StudentList)
        {
            if(item.roll==roll)
            {
                System.out.print("\nFound");
                item.print_Snode();
                flag=true;
            }
        }
        if(flag==false)//not found
            System.out.print("\n"+roll+" not found");
    }
}

package Searching_Examples;

import java.util.Scanner;
import java.util.Arrays;
public class Searching
{
   static int sequential_search(int a[],int key)
    {
        int i;
        for(i=0;i<a.length;i++)
        {
            if(key==a[i])
            {
                return i;//position where we found the data
            }
        }
        return -1;
    }
   static int binary_search(int a[],int start,int end,int key)
   {
      if(start<=end)//for searching
      {
          int mid=(start+end)/2;
          if(key==a[mid])//found go
              return mid;
          else//search either side
          {
              if(key<a[mid])
                  return binary_search(a,start,mid-1,key);//left half
              else
                  return binary_search(a,mid+1,end,key);//left half
          }
      }
      else
          return -1;
   }

    public static void main(String[] args)
    {
        //int a[]={11,9,22,5,77,33,88,33};
        int a2[]={11,22,33,44,55,66,77,88,99};
        Scanner in=new Scanner(System.in);
        System.out.println("Enter key:");
        int key=in.nextInt();
        //  int response=sequential_search(a,key);
        int response=binary_search(a2,0, a2.length-1,key);
        if(response==-1)
            System.out.println(key+" not found");
        else
            System.out.println(key+" found at "+response+" in "+Arrays.toString(a2));

    }
}



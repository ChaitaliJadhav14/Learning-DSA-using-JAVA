package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Examples
{
    static void bubble_sort(int a[])
    {
        int i,j,temp;
        int pass=0;
        for(i=0;i<a.length-1;i++)//passes n-1
        {
            for(j=0;j<a.length-1;j++)//sort by swap step j as second last so j+1 last
            {
                System.out.print("\npass:"+(pass++));
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }
    static void bubble_sort_v1(int a[])
    {
        int i,j,temp;
        int pass=0;
        for(i=a.length-1;i>0;i--)//passes n-1 9,8,7,6,5,4,3,2,1,0(stop)
        {
            for(j=0;j<i;j++)//sort by swap step j as second last so j+1 last
            {
                System.out.print("\npass:"+(pass++));
                if(a[j]>a[j+1])
                {
                    temp=a[j];a[j]=a[j+1];a[j+1]=temp;
                }
            }
        }

    }
    static void bubble_sort_v2(int a[])
    {
        int i,j,temp;
        int pass=0;
        boolean done;
        for(i=a.length-1;i>0;i--)//passes n-1 9,8,7,6,5,4,3,2,1,0(stop)
        {
            done=true;//Means sorting is done.
            for(j=0;j<i;j++)//sort by swap step j as second last so j+1 last
            {
                System.out.print("\npass:"+(pass++));
                if(a[j]>a[j+1])
                {
                    temp=a[j];a[j]=a[j+1];a[j+1]=temp;
                    done=false;//Sorting is still not done.
                }
            }
            if(done==true)
                return;
        }

    }
    static void selection_sort(int a[])
    {
        int i,j,min,min_position;
        for(i=0;i<a.length-1;i++)//passes n-1 9,8,7,6,5,4,3,2,1,0(stop)
        {
            //build ref
            min=a[i];
            min_position=i;
            for(j=i+1;j<a.length;j++)//Loop will search for minimum.
            {
                if(a[j]<min)
                {
                   min=a[j];
                   min_position=j;
                }
            }
            //swap
            a[min_position]=a[i];
            a[i]=min;
        }

    }
    
    static void insertion_sort(int a[])
    {
        int i,j,new_element;
        for(i=0;i<a.length-1;i++)//passes n-1 9,8,7,6,5,4,3,2,1,0(stop)
        {
            j=i+1;
            new_element=a[j];
            while(j>0 && a[j-1]>new_element)
            {
             a[j]=a[j-1];
             j--;
            }
            a[j]=new_element;
        }

    }


    static void quick_sort(int a[],int start,int end)
    {
        int i,j,pivot,temp;
        i=start;
        j=end;
        pivot=start;//end
        //if pivot is at start i will be useless
        //if pivot is at end j is useless
        while(i<j)
        {
            while(a[i]<a[pivot])
                i++;//move ahead
            while(a[j]>a[pivot])
                j--;//move back
            if(i<j)
            {
                temp=a[i];a[i]=a[j];a[j]=temp;
            }
        }
        if(i<end)
            quick_sort(a,i+1,end);
        if(start<j)
            quick_sort(a,start,j-1);
    }

    static void merge_sort(int a[],int start,int end)
    {
        if (start<end)//size 1 stop < and not <=
        {
            int mid=(start+end)/2;
            merge_sort(a,start,mid);
            merge_sort(a,mid+1,end);
            merger(a,start,mid,end);
        }
    }
    static void merger(int a[],int start, int mid, int end)
    {
        int i,j;
        i=start;
        j=mid+1;
        int temp[],tindex;//temp array to store inbetween elements
        temp=new int[a.length];
        tindex=start;
        while(i<=mid && j<=end)//copy smaller first
        {
            if(a[i]<a[j])
                temp[tindex++]=a[i++];
            else
                temp[tindex++]=a[j++];
        }
        //copy leftover
        while(i<=mid )
            temp[tindex++]=a[i++];
        while (j<=end)
            temp[tindex++]=a[j++];
        for(i =start;i<=end;i++)
            a[i]=temp[i];//copy to original
    }

    
    public static void main(String[] args)
    {
    	int a[]={44,22,99,88,33,66,55,11,77};
    	//int a[]={11,22,33,44,55,66,77,88,99};//only for binary search
        System.out.println("\nStart before sorting:"+Arrays.toString(a));
        //sorting call
        //bubble_sort(a);
        //bubble_sort_v2(a);
        //selection_sort(a);
        //insertion_sort(a);
        //quick_sort(a,0,a.length-1);
        merge_sort(a,0,a.length-1);
        System.out.println("\nAfter sorting:"+Arrays.toString(a));
    }

}


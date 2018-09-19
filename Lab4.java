package Lab4;

import java.util.Scanner;
/**
 * Class for Lab 4 to sort numbers
 * 
 * @author tayblank
 * @version Created 9/19/19, Edited 9/19/19
 */
public class Lab4 {
    
    public static void main(String[] args)
    {
        System.out.println("Input: 5 3 7 9 0");
        int[] a={5,3,7,9,0};a=sort(a);
        System.out.print("Output:");
        for(int s:a){System.out.print(" "+s);}
        
        System.out.println("\nInput: 5 6 7 3 2 1");
        int[] b={5,6,7,3,2,1};b=sort(b);
        System.out.print("Output:");
        for(int s:b){System.out.print(" "+s);}
        
        System.out.println("\nInput: 4 3 2 8 6");
        int[] c={4,3,2,8,6};c=sort(c);
        System.out.print("Output:");
        for(int s:c){System.out.print(" "+s);}
        
        System.out.println("\nInput: 4 0 9 3");
        int[] d={4,0,9,3};d=sort(d);
        System.out.print("Output:");
        for(int s:d){System.out.print(" "+s);}
        
        System.out.println("\nInput: 7 8 5 1 3 6");
        int[] e={7,8,5,1,3,6};e=sort(e);
        System.out.print("Output:");
        for(int s:e){System.out.print(" "+s);}
        
        System.out.println();
    }
    
    /**
     * Sorts the items in an array of integers
     * 
     * @param a int array of items to sort
     * @return the sorted version of a
     */
    private static int[] sort(int[] a)
    {
        if(a.length<=1){return a;}
        else
        {
            for(int i=0;i<a.length-1;i++)
            {   while(i>=0 && a[i+1]>a[i])
                {   int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    i--;
                }
            }
        }
        return a;
    }
}

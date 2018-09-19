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
    {   String[] ans=null;
        if(args.length==0)
        {   Scanner in=new Scanner(System.in);
            System.out.println("No arguments found. Please re-enter the items"
                +" to sort with a space between each item:");
            main(in.nextLine().split(" "));
        }
        else{ans=sort(args);}
        for(String s:args)
        {System.out.println(s);}
    }
    
    /**
     * Sorts the items in an array of strings
     * 
     * @param a string array of items to sort
     * @return the sorted version of a
     */
    private static String[] sort(String[] a)
    {
        if(a.length==1){return a;}
        else
        {   String[] ans=new String[a.length];
            for(int i=0;i<a.length-1;i++)
            {   while(i>=0&&a[i+1].compareTo(a[i])<0)
                {   String temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    i--;
                }
            }
        }
        return a;
    }
}

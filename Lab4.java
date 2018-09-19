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
        /*
        if(args.length==0)
        {   Scanner in=new Scanner(System.in);
            System.out.println("No arguments found. Please re-enter the items"
                +" to sort with a space between each item:");
            main(in.nextLine().split(" "));
        }
        else{ans=sort(args);}
        for(String s:args)
        {System.out.println(s);}
        */
        System.out.println("Input: 5 3 7 9 0");
        String[] a={"5","3","7","9","0"};a=sort(a);
        System.out.print("Output:");
        for(String s:a){System.out.print(" "+s);}
        
        System.out.println("\nInput: 5 6 7 3 2 1");
        String[] b={"5","6","7","3","2","1"};b=sort(b);
        System.out.print("Output:");
        for(String s:b){System.out.print(" "+s);}
        
        System.out.println("\nInput: 4 3 2 8 6");
        String[] c={"4","3","2","8","6"};c=sort(c);
        System.out.print("Output:");
        for(String s:c){System.out.print(" "+s);}
        
        System.out.println("\nInput: 4 0 9 3");
        String[] d={"4","0","9","3"};d=sort(d);
        System.out.print("Output:");
        for(String s:d){System.out.print(" "+s);}
        
        System.out.println("\nInput: 7 8 5 1 3 6");
        String[] e={"7","8","5","1","3","6"};e=sort(e);
        System.out.print("Output:");
        for(String s:e){System.out.print(" "+s);}
        
        System.out.println();
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

package com.app.interview.wipro;

import java.util.Scanner;

//java code for binary search
public class BinarySearch {
    public static void main(String[] args) {

        //take the input
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Numbers are u want to enter");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter"+ n + "Integer");
        for(int c=0;c<n;c++){
            array[c]=sc.nextInt();
        }
        //Entered elemnt
        System.out.println("Entered Elements!!");
        for(int k=0;k<array.length;k++){
            System.out.println(array[k]);
        }
        System.out.println("Enter the value to find ??" );
        int search =sc.nextInt();

        //algo for binary serch!!
       int  first=0;
       int  last=n-1;
       int middle=(first+last)/2;
       while(first<=last){
           //
           if(array[middle]<search){
               first=middle+1;
           }
           else if(array[middle]==search){
               System.out.println(search+" found at location "+(middle+1));
               break;
           }
           else {
               last=middle-1;
               middle=(first+last)/2;
           }
           if(first>last){
               System.out.println(search+" serch is not present !!");
           }

       }

    }
}

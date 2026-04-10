package com.app.congni.interview;

public class SwapBetweenString {
    //try to know the use of substring
    public static void main(String[] args) {
        String str1="cloud";
        String str2="tech";

        //without using the third variable
        str1=str1+str2;//cloudtech
        System.out.println(str1);

        str2=str1.substring(0,str1.length()-str2.length());//9-4 (0,5)
        System.out.println(str2);//cloud
        //cloudtech,substring(cloud);
        //it will remove the upto the index of cloud i.e str2.lenth()
        str1=str1.substring(str2.length());
        System.out.println(str1);

        //swap the two number without third variable
        int a=12;
        int b=13;
        a=a+b;//25
        b=a-b;//12
        a=a-b;//13
        System.out.println(a+" "+b);

    }
}

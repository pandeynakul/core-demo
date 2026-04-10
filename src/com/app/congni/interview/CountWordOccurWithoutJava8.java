package com.app.congni.interview;

public class CountWordOccurWithoutJava8 {
    public static void main(String[] args) {
        String input ="welcome to cloudTech and itd good programming platform cloudTech";

        //string to find repeted or not
        String word="cloudTech";

        String[] splitedString = input.split(" ");

        //take the variable to count the word
        int count=0;
        //take the variabl to collect the word

        //perform the operation
        for(int i=0;i<splitedString.length;i++){
            //collect it
            if(word.equals(splitedString[i]))
            {
                count++;
            }
        }
        System.out.println("Number of occerance of given word "+count);


    }
}

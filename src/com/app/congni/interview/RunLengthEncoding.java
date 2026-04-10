package com.app.congni.interview;

import java.util.HashMap;

//data stucture !!
public class RunLengthEncoding {
    public static void main(String[] args) {
        String input="jjjjyyyyyyyNNNNNNpppppWWWWQQQ";
        String inputOp= input.toUpperCase();
        runLengthEncoding(inputOp);

        HashMap<String,String> hm=new HashMap<String,String>();
        hm.put("1","byteprograming");
        String putValue=hm.put("1","byte");
        //it will override the old value with new 1
        //output will be byteprograming
        System.out.println(putValue);
    }

    private static void runLengthEncoding(String inputOp) {

        //
        String encoded="";

        int count=1;
        //iterate the string
        for(int i=0;i<inputOp.length();i++){
            //perform the operation
            //brute force
            if(i+1<inputOp.length() && inputOp.charAt(i)==inputOp.charAt(i+1)){
                //increase the count
                count++;
            }
            else{
             //concat the string attached to it
                encoded=encoded.concat(Integer.toString(count).concat("-").
                        concat(Character.toString(inputOp.charAt(i)))).concat(" ");
                count=1;
            }

        }
        System.out.println(encoded);
        ///finally print the result here

    }
}

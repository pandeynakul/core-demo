package com.consistancy;

//Basic Concept
//function call itself
//later on we will look into the linked list
public class RecursionBasic {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        //5.4!
        System.out.println(sumOfNaturalNumber(5));

    }

    public static int factorial(int n) {
       /* int res=1;
        //with the help  of loop
        for(int i=1;i<=n;i++){
            //storing into the result res and multiplying
            res=res*i;

        }
        return res;*/

        //put the condition u must have the clarity
        System.out.println("##with the help of recursion##");
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    //sum of n natural number
    public static int sumOfNaturalNumber(int n) {
        //5+4+3+2+1
        //n+(n-1)+(n-2)....0;
        //with the help of iterative Approach
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //store the result into the sum
            sum = sum + i;
        }
        return sum;

        //with the help of recursion
       /* if(n==1){
            return 1;
        }
        return n+sumOfNaturalNumber(n-1);*/

    }
}

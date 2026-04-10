import java.util.StringJoiner;

public class MissingNumber {

    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 10};

        //do the summetion
        //(n*(n+1))/2
        int totalSum = (10 * 11) / 2;
        System.out.println(totalSum);

        //subtract the actual sum from the calculated on
        //u will get  the missing number
        int actualSum = 0;

        //iterate the array and do the summation

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }
        System.out.println(actualSum);

        System.out.println("missing Number " + (totalSum - actualSum));
        System.out.println("ok perfect::");
        System.out.println("=====================================");

        String str = "monty love Aishwarya aishwarya love ankul";
        String upperCase = "";
        String lowerCase = "";
        //find the mid
        int mid = str.length() / 2;
        for (int i = 0; i < str.length(); i++) {
            if (i < mid) {
                lowerCase = lowerCase + Character.toLowerCase(str.charAt(i));
            } else {
                upperCase = upperCase + Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(upperCase + " " + lowerCase);
        System.out.println("**=======================================**");
        //count the number of digit

        int number = 1233450;
        String noOfDigit=Integer.toString(number);
        System.out.println("with help of toString  : "+noOfDigit.length());
        //change into the string
        String digit = String.valueOf(number);
        System.out.println("number of digit with the help of valueOff : " + digit.length());

        //divide by 10 count the number

        //lets with the help of while loop
        int count=0;
        while(number>0){
            number=number/10;
            count++;
        }
        System.out.println("number of digit with help of while : "+ count);
        System.out.println("===============Replace with ============");

        String input ="CloudTech";
        System.out.println(input.replace("C",""));
        System.out.println("===========================================");
        StringJoiner joiner=new StringJoiner(",","{","}");
        joiner.add("A").add("A").add("L");
        System.out.println(joiner);
        StringJoiner joiner2=new StringJoiner(":");
        joiner2.add("P").add("Q");
        System.out.println(joiner2);

        joiner.merge(joiner2);
        System.out.println(joiner);



    }
}

public class ArmstrongNumber {
    public static void main(String[] args) {

        //check whether the given number is armstrong or not

        //let be consider input as 153
        /*int countedDigit = countTheNumberDigit(1356);
        System.out.println(countedDigit);*/

        int input = 5;
        if (armstrongNumber2(input)) {
            System.out.println(input + "  an armstrong");
        } else {
            System.out.println(input + " not an armstrong");
        }

    }

    //for three digit number
    //153=1^3+5^3+3^3=153
    private static boolean isArmstrong(int input) {
        int j = input;
        int sum = 0;
        int digit = 0;

        while (j > 0) {
            //divide it with 10
            digit = j % 10;
            //aasigned to reminder\
            j = j / 10;
            sum = sum + digit * digit * digit;
            //perfrom the calculation

        }
        return input == sum;
    }
    //write the logic to count the number of digit

    private static int countTheNumberDigit(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }

        return count;
    }
    //for more dynamic in nature with any number

    private static boolean armstrongNumber2(int number) {
        //allocate the local variable to inout
        int j = number;
        int sum = 0;
        int digit = 0;
        int numOfDigit=countTheNumberDigit(number);
        while (j > 0) {
            //mod by 10 return the last digit
            digit = j % 10;
            //divide by 10 return the  remaining number
            j = j / 10;
            //add into the summetion
            sum = sum + (int)Math.pow(digit,numOfDigit);
        }


        return sum == number;
    }
}

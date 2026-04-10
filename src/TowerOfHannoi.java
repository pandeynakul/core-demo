import java.util.Scanner;

public class TowerOfHannoi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the disc");
        int noOfDisk = sc.nextInt();
        System.out.println("tower of Hannoi !!");
        numOfOperation(noOfDisk, 'A', 'B', 'C');
        System.out.println("End tower of hannoi !!");
    }

    //consider three tier
    public static void numOfOperation(int noOfDisk, char fromRod, char toRod, char auxRod) {

        //base case
        if (noOfDisk == 1) {
            System.out.println("move rod disk 1 from rod " + fromRod + "to" + toRod);
            return;
        }

        numOfOperation(noOfDisk - 1,fromRod , auxRod   , toRod);
        System.out.println(" move the rod "+ noOfDisk +" from rod "+ fromRod+" toRod "+toRod);
        numOfOperation(noOfDisk - 1, auxRod, toRod, fromRod);

    }
}

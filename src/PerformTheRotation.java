public class PerformTheRotation {
    //ABCD
    //CDAB
    //string 1 +string 2 =find String 2 is present
    //check whether its an rotation of not

    public static void main(String[] args) {

        String str1 = "ABCD";
        String str2 = "CDAB";
       // System.out.println(str1+str2);
        System.out.println((str1+str1).indexOf(str2)!=-1);
        if(isRotation(str1,str2)){
            System.out.println("rotation of the string is present ");
        }
        else {
            System.out.println("rotation of the string is Not present ");
        }

    }

    //ABCDABCD
    public static boolean isRotation(String str1, String str2) {

        //check the length of the string
        //check index of the second string is present in first 1
       if((str1.length()==str2.length()) && ((str1+str1).indexOf(str2)!=-1)){
           return  true;

       }
       return false;
    }
}

public class SpecialCharacter {

    //find out the special character and count the special character
    public static void main(String[] args) {

        String s= "CloudTech#@!";
        int count=0;

        String specialCharacterRemoved="";
        //iterate the string
       for(int i=0;i<s.length();i++){
           //isDigit and  isLetter  and  whitespace
           //increase the count++
           //else depend on the count t
          // System.out.println(s.charAt(i));
           if(!Character.isDigit(s.charAt(i)) &&
                   !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))){

               //if not digit and whitespace and not an letter
               count++;
           }
           //remove special character and and print the string
           else{
               specialCharacterRemoved= specialCharacterRemoved+ s.charAt(i);
           }

       }
       if(count==0){
           System.out.println("there is no special character in string ");
       }
       else{
           System.out.println("special character is found : "+count);
       }
        System.out.println("special character removed :: "+specialCharacterRemoved);
    }
}

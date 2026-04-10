import java.util.Arrays;

public class AnagramChecker {


    //one of the character is present or not
    //two strings are anagram or not
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "bca";

        if (areAnagram(str1, str2)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("not an anagram");
        }

        isAnagram2("Mother In Law", "Hitker Woman");
        isAnagram2("keEp", "peeK");
    }

    private static void isAnagram2(String str1, String str2) {
        String copyOfs1 = str1.replaceAll("\\s", "");
        String copyOfs2 = str2.replaceAll("\\s", "");
        //initially setting status true
        boolean status = true;
        if (copyOfs1.length() != copyOfs1.length()) {
            status = false;
        } else {
            //Changing the case of characters of both copyOfs1 and copyOfs2
            // and converting them to char array
            char[] s1Arr = copyOfs1.toLowerCase().toCharArray();
            char[] s2Arr = copyOfs2.toLowerCase().toCharArray();
            //sorting both the array!!
            Arrays.sort(s1Arr);
            Arrays.sort(s2Arr);

            status = Arrays.equals(s1Arr, s2Arr);

        }

        if (status) {
            System.out.println(str1 + " and " + str2 + " :: are palindrome");
        } else {
            System.out.println(str1 + " and " + str2 + " :: are not palindrome");
        }

    }

    private static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        //created an array
        int[] charCount = new int[26];
        //logic has been return for given hardcoded String
        //iterate the string and check it
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
            // System.out.println(charCount[str1.charAt(i)-'a']++);
        }
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i) - 'a']--;
            //System.out.println( charCount[str2.charAt(i)-'a']--);
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    //more easy way to sort it !!


}

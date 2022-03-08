import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1:=");
        String str1 = sc.nextLine();
        System.out.println("Enter string2:=");
        String str2 = sc.nextLine();
      /*  str1=str1.replace(" ","");
           str2=str2.replace(" ","");
            str1 = str1.toLowerCase();
             str2 = str2.toLowerCase();*/
        //above commenting syntax can be cahnged by  this syntax also in one line code
        str1=str1.replace(" ","").toLowerCase();
        str2=str2.replace(" ","").toLowerCase();


        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagram");


        } else {
         char [] a = str1.toCharArray();
          char[] b = str2.toCharArray();
            //biult in fuction for sorting in arrays from package import java.util.Arrays;
            Arrays.sort(a);
            Arrays.sort(b);
//Arrays .equals method checks two arrays are equal or not
       boolean result = Arrays.equals(a, b);
            if (result)//this means result is true
                 {

                System.out.println("Strings are anagram");

            } else if (!result) {
                System.out.println("Strings are not anagram");
            }


        }


}}

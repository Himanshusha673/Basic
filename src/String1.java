import java.util.Scanner;
 public class String1 {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enetr a string");
   String str =sc.nextLine();
   int consonant=0,vowel=0;
   for (int i=0;i<str.length();i++){
str=str.toLowerCase();
    if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
     vowel++;

    }else if(str.charAt(i)>'a'&&str.charAt(i)<'z') {
      consonant++;

     }


  }System.out.println("vowels  in string is"+vowel);
   System.out.println("consonant in string is" + consonant);
  }


}

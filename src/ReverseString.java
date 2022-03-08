import java.util.Scanner;
public class ReverseString {
    public static void main( String [] args  ) {
        ReverseString R1 = new ReverseString();

         System.out.println("enter a string");
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();

        System.out.println("your reverse string is " + R1.reverse(str1));
    }
 String reverse(String str){

  int i;
  String rev=" ";

    for( i=str.length()-1;i>=0;i--){

                         rev=rev+str.charAt(i) ;

    }

              return rev;

    }





    

}

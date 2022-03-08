import java.util.Scanner;
public class LinearSearch {
 static int [] input_and_printarray(  ) {
     Scanner sc= new Scanner (System.in);
     System.out.println("Enter the size of the array");
     int size =sc.nextInt();
     int input []= new int[size];

     for (int i = 0; i <size; i++) {

         System.out.print("arr[" + i + "]=");
     input[i] = sc.nextInt();
     System.out.println();
     }
     System.out.print("arr=[");
     for (int j=0;j<size;j++) {
         if (j == size - 1) {
             System.out.print(input[j]);

         } else
             System.out.print(input[j] + ",");
     }
         System.out.print("]");
     return input;
 }



 public static void main(String [] args){



 int [] arr= input_and_printarray();


 }
}

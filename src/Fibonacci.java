import java.util.Scanner;
public class Fibonacci {
    public static void main (String []args){
        int a=0,b=01,inp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the no. series till you want to print fibonacci series");
       inp=sc.nextInt() ;

        System.out.print(a+","+b+",");
        for (int i=2;i<inp;i++){

         int sum=a+b;
           a=b;
           b=sum;
           if ( i==inp-1)
            System.out.print(sum);
           else
           System.out.print(sum+",");


        }





    }




}

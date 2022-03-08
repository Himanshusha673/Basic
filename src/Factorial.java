import java.sql.SQLOutput;
import java.util.Scanner;
;
public class Factorial {
    public static void main(String[] args) { int fact=1;
        Scanner sc= new Scanner (System.in);
        System.out.print("Enetr the no. which you want to get factorial"); int s;
        int a = sc.nextInt();int i;
        for( i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("factorial is " + fact);
    }}
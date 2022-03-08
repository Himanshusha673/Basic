import java.sql.SQLOutput;
import java.util.Scanner;
public class PrimeNo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end, i, j, count;
        System.out.println("enetr stating no.");
        start = sc.nextInt();
        System.out.println("enter ending no.");
        end = sc.nextInt();
        for (i = start; i < end; i++) {
            count = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0){

                    System.out.println("");
                break;
                }

            }if (i==j)
            System.out.println(i);
        }
    }
}
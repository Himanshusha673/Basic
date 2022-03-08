import java.util.Scanner;
public class CheckElementInArray {
    public static int checkelement(int input [],int value) {
        int len = input.length;
        if (len <= 0) {
            return 0;
        } else if (input[len - 1] == value) {
            return (len - 1);
        } else {
           --len;
            return checkelement ( input ,value);
    }

    }


    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of array array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("enter the no. that you want to search in array");
        int a=sc.nextInt();

        int ans =checkelement(arr,a);
        System.out.println("your value is  at index"+ans);
    }




}

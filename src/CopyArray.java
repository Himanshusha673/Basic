import java.util.Scanner;
public class CopyArray {
//size must be same if one array value pass to another


            public static void print(int arr []) {
                System.out.print("arr=[");
                int size=arr.length;
                //************length is a variable of method length()
                for (int j=0;j<size;j++) {
                    if (j ==size - 1) {
                        System.out.print(arr[j]);

                    } else
                        System.out.print(arr[j] + ",");
                }
                System.out.print("]");
            }
            public static void main(String [] args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of the array");
                int size = sc.nextInt();
                int arr1[] = new int[size];

                for (int i = 0; i < size; i++) {

                    System.out.print("arr[" + i + "]=");
                    arr1[i] = sc.nextInt();
                    System.out.println();
                }
                int arr2[]=new int[arr1.length];

                for (int j=0;j<arr1.length;j++){

                    arr2[j]=arr1[j];


                }
                System.out.println("first array is"+'\t');
                        print(arr1);
                System.out.println("\nsecond  array is");
                print(arr2);

            }
        }
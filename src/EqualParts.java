import java.util.Scanner;
public class EqualParts {

    public static void check(String inp){
        int size=inp.length()/2;
        if (inp.length()%2==0) {
            String str1 = new String();
            String str2 = new String();
            str1 = str1.substring(0,size);
            str2 = str2.substring(size, inp.length());
            System.out.println(str1+"    "+str2);
        }
            else if(inp.length()%2!=0){
            System.out.println("please enter another string");







        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Eneter a string");

        String input=sc.nextLine();
        check(input);
    }

}

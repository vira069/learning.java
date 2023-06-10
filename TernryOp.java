import java.util.Scanner;
import java.lang.String;
public class TernryOp {
    public static void main(String[]args){
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String ans  = ((number % 2 == 0) ? "Even" : "Odd");
        System.out.println(ans);
    }
}

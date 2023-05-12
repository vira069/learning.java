import java.util.Scanner;
public class TernryOp {
    public static void main(String[]args){
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String ans  =(number%2==0) ? System.out.println("Even") : System.out.println("Odd");
    }
}

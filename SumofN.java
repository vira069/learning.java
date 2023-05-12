import java.util.Scanner;

public class SumofN {
    public static void main(String[]args){
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt(); 
        int sum=0;
        int num=1;
        while(n<1){
            sum = sum+num;
        }
        System.out.println(+sum);
               
        num++;
    }
    
}

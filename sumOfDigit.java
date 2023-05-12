import java.util.Scanner;
public class sumOfDigit {
    
        public static void main (String[]args){
            System.out.println("Enter a number:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int sumOfDigit = 0;
    
            while(num>=0){
                sumOfDigit =  num%10 + sumOfDigit;
                num = num/10;
            
            }
            System.out.println(sumOfDigit);
    
        }
        
    }
    
    


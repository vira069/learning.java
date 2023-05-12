import java.util.Scanner;
    public class weiredOrNot{
        public static void main(String[]args){
            System.out.println("Enter a number:");
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();
            if(n%2!=0){
                System.out.println("Weired");
            }
            if(n%2==0){
                else if(2<=n<=5){
                    System.out.println("Not Weired");
                
                    else if else(6<=n<=20){
                        System.out.println("Weired");
                        
                        else{
                            System.out.println("Not Weired");
                        }
                    }
                }
            
            }
            
        }
    }
    
}

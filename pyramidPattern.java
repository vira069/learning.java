import java.util.Scanner;
public class pyramidPattern {
    public static void main(String[] args) {
        System.out.println("Enter the value of row:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r+1-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i+(i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

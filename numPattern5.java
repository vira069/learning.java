import java.util.Scanner;
public class numPattern5 {
    
    public static void main(String[] args) {
        System.out.println("Enter the value of row:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r+1-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    
}

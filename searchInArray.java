

import java.util.Scanner;

public class searchInArray {
    static void findElement(int[] arr){
        System.out.println("Enter searching element");
        int x = scan.nextInt();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println(i);
            }
            else{
                 System.out.println(-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter array size:");
        int n= scan.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter"+n+"elemnts");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        findElement(arr);
    }
}

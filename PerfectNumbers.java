import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[]args)
    {
        long n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        n=sc.nextLong();
        int i=1;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        if(sum==0)
        {
            System.out.println(n+ " is perfect number");
        }
        else
        System.out.println(n+ " is not a perfect number");
    }
}

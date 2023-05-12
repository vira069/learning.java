import java.util.Scanner;

public class MonthsDays {

public static void main(String[]args)
{
System.out.println("Enter any number 1 to 12:");
Scanner sc = new Scanner(System.in);
int month=sc.nextInt();
switch(month) { 
 case 1:
    System.out.println("January");
    System.out.println("31 Days");
    break;
    case 2:
    System.out.println("February");
    System.out.println("29 Days");
    break;
    case 3:
    System.out.println("March");
    System.out.println("31 Days");
    break;
    case 4:
    System.out.println("April");
    System.out.println("30 Days");
    break;
    case 5:
    System.out.println("May");
    System.out.println("31 Days");
    break;
    case 6:
    System.out.println("June");
    System.out.println("30 Days");
    break;
    case 7:
    System.out.println("July");
    System.out.println("31 Days");
    break;
    case 8:
    System.out.println("August");
    System.out.println("31 Days");
    break;
    case 9:
    System.out.println("September");
    System.out.println("30 Days");
    break;
    case 10:
    System.out.println("October");
    System.out.println("31 Days");
    break;
    case 11:
    System.out.println("November");
    System.out.println("30 Days");
    break;
    case 12:
    System.out.println("December");
    System.out.println("31 Days");
    break;
default:
System.out.println("***Months are only 12....na So please enter valid month***");
}
}
    
}

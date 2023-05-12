import java.util.Scanner;
public class VowelConsonant {
  public static void main(String[]args){
    System.out.println("Enter a to z any charcter:");
    Scanner sc = new Scanner(System.in);
    char charecters = sc.next().charAt(0);
switch(charecters){
    case 'a' ->{
        System.out.println("Vowel letter a.");
    }
    case 'e' ->{
        System.out.println("Vowel letter e.");
    }
    case 'i' ->{
        System.out.println("Vowel letter i.");
    }
    case 'o' ->{
        System.out.println("Vowel letter o.");
    }
case 'u' ->{
    System.out.println("Vowel letter u.");
}
default ->{
    System.out.println("It is Consonant.");
}
  }  
  }
}


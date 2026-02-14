
import java.util.Scanner;

class Chapter3{
    public static void main(String[] args) {
        String a = "   Hello Jay!";
        // Lowercase
        System.out.println("Lowercase : " + a.toLowerCase());
        
        //Replace space with underscore
        System.out.println("Replaced : " + a.replace(' ','_'));

        // make a sntance
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        System.out.println("Dear " + b + " , Thanks a lot");

        // Double and Triple
        String c = "Hello  Hii  ,Jay";
        System.out.println(c.indexOf("  "));
        System.out.println(c.indexOf("   "));

        // Escape sequencce
        String d = "Dear Jay,\nThis Java Course is Nice.\nThanks!";
        System.out.println();
    }    
}
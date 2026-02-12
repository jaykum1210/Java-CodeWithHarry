import java.util.Scanner;

class Chapter2{
    public static void main(String[] args) {
        
        // Print Result
        int a = 7/4*9/2;
        System.out.println(a);

        // Encrypt By ading 8 and decrypt it
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        b+=8;
        System.out.println("Encrypted Value : " + b);
        b-=8;
        System.out.println("Decrypted Value : " + b);

        // Comparision Operator
        System.out.print("Enter Numebr more or less then 20 : ");
        int c = sc.nextInt();
        System.out.println(c>20);

        // Formula Solve
        System.out.print("Enter V : ");
        int V = sc.nextInt();
        System.out.print("Enter U : ");
        int U = sc.nextInt();
        System.out.print("Enter a :");
        int A = sc.nextInt();
        System.err.print("Enter s : ");
        int S = sc.nextInt();
        float f = (float)(V*V - U*U)/(float)(2*A*S);
        System.out.println("Formula : "+f);

        //Expression

        int z = 7 + 49/7 + 35/7;
        System.out.println("Expression : " + z);
    }
}
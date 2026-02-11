
import java.util.Scanner;

class Chapter1 {

    public static void main(String[] args) {

        // Sum of Three Numbers
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println("Sum : " + (a + b + c));

        // Percenatge of Five Subjects
        System.out.print("Enter Five SUbjects Marks : ");
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Percenatge : " + ((float) (d + e + f + g + h) / 5) + "%");

        //Input name and greet
        sc.nextLine();
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Hello! " + name);

        // Convert Kilometer to Miles
        System.out.print("Enter Kilometer : ");
        float kilo = sc.nextFloat();
        System.out.printf("Miles : %.2f\n", kilo * 0.621371);

        //Check User Input Interger or not
        System.out.print("Enter Integer : ");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}

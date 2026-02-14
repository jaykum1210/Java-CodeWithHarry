
import java.util.Scanner;

class Chapter4 {

    public static void main(String[] args) {

        // Output
        int a = 10;
        if (a == 11) {
            System.out.println("I am 11.");
        } else {
            System.out.println("I am not 11");
        }

        // Pass Or Fail
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of Three Subjects : ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        if (m1 < 33 || m2 < 33 || m3 < 33 || ((float) (m1 + m2 + m3) / 3) < 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }

        // Tax
        System.out.println("Enter income : ");
        float i = sc.nextFloat();
        if (i >= 250000 && i < 500000) {
            System.out.println("Tax : " + (i / 20));
        } else if (i >= 500000 && i < 1000000) {
            System.out.println("Tax : " + (i / 5));
        } else {
            System.out.println("Tax : " + ((i * 3) / 10));
        }

        // Day 
        System.out.println("Day Number :");
        int d = sc.nextInt();
        d%=7;
        switch (d) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesdayy");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            default:
                throw new AssertionError();
        }

        // Leap Year
        
        int y = sc.nextInt();
        if((y%4==0 && y%100!=0) || y%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }

        //Website type

        String w = sc.nextLine();
        if(w.endsWith(".com")){
            System.out.println(".Com Website");
        }
        else if(w.endsWith(".org")){
            System.out.println(".Org Website");
        }
        else if(w.endsWith(".in")){
            System.out.println(".In Webiste");
        }
    }
}

import java.util.Scanner;

class Percentage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        float percent = (float)sum/5;
        System.out.println("Percentage : " + percent + "%");
    }
}
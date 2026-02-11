
class Operator {

    public static void main(String[] args) {
        // Arithemetic operators
        // +, -,*,/,%

        System.out.println(20 + 10);
        System.out.println(20 - 10);
        System.out.println(20 * 10);
        System.out.println(20 / 10);
        System.out.println(21 % 10);

        // Assignment Operators
        // =,+=,-=

        int a = 10;
        System.out.println("a = " + a);
        a += 10;
        System.out.println(a);
        a -= 10;
        System.out.println(a);

        // Comparision Operator
        // ==,!=,<,>,<=,>=

        int b = 10;
        int c = 20;
        System.out.println(b == c);
        System.out.println(b != c);
        System.out.println(b < c);
        System.out.println(b > c);
        System.out.println(b <= c);
        System.out.println(b >= c);

        // Logical Operator
        // &&, ||, !

        System.out.println(b==10 && c == 100);
        System.out.println(b==10 || c == 100);
        System.out.println(b!=10);

        // Bitwise Operator
        // &,|
        System.out.println(2&3);
        System.out.println(2|3);
    }
}

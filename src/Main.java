import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello NOVI");

        int i = 12345;
        long number = 12_345_678_901L;
        System.out.println(i + number);

        long sum = i + number;

        float f = 123.45f;
        double d = 987.65;

        char c = 'x';
        String s = "101";
        System.out.println(c + s);

        System.out.println(s + i);

        boolean b = true;
        if (b) {
            System.out.println("b is true");
        }
        else {
            System.out.println("b is false");
        }

        int dd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Voer getal in:");
        dd = sc.nextInt();
        switch (dd) {
            case 1:
                System.out.println("een ingevoerd");
                break;
            case 2:
                System.out.println("twee ingevoerd");
                break;
            default:
                System.out.println("Ander getal");
        }

        System.out.println(calculateVat(1000, 21));
        double vat = calculateVat(67, 9);

        System.out.println(faculty(4));
    }

    public static double calculateVat(double amount, double percentage) {
        return amount * percentage / 100;
    }

    // faculteit functie:  6! = 6 * 5 * 4 * 3 * 2 * 1
    // recursieve method
    public static int faculty(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * faculty(n - 1);
        }
    }
}

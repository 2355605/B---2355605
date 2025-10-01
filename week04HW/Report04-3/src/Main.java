import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Dollars 개수 : ");
        int dollar = keyboard.nextInt();
        System.out.print("Halves(50¢) 개수 : ");
        int half = keyboard.nextInt();
        System.out.print("Quarters(25¢) 개수 : ");
        int quarter = keyboard.nextInt();
        System.out.print("Dimes(10¢) 개수 : ");
        int dime = keyboard.nextInt();
        System.out.print("Nickels(5¢) 개수 : ");
        int nickel = keyboard.nextInt();
        System.out.print("Pennies(1¢) 개수 : ");
        int penny = keyboard.nextInt();

        int cents = dollar * 100 + half * 50 + quarter * 25
                + dime * 10 + nickel * 5 + penny;

        int outDollars = cents / 100;
        int outCents = cents % 100;

        System.out.printf("총액: $%d.%02d (=%d cents)\n",
                outDollars, outCents, cents);
        keyboard.close();
    }
}
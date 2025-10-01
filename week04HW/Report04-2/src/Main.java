import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("판매금액(부가세 포함) 입력 : ");
        int total = keyboard.nextInt();

        int amount = (int) (total / 1.1);
        int tax = total - amount;

        System.out.printf("금액 : %,d원\n", amount);
        System.out.printf("세금 : %,d원\n", tax);
        keyboard.close();
    }
}

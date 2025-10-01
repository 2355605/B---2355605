import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int UNIT = 56000;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("주택지 면적(평)을 입력하세요 : ");
        int pyeong = keyboard.nextInt();

        int price = pyeong * UNIT;

        price = (price / 1000) * 1000;

        System.out.printf("주택지 가격 : %,d원\n", price);
        keyboard.close();
    }
}
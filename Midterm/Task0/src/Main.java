import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int base, height;

        System.out.println("**** 삼각형의 넓이 구하기 ****");
        System.out.print("밑변 : ");
        base = keyboard.nextInt();
        System.out.print("높이 : ");
        height = keyboard.nextInt();

        double area = ((double)base * height) / 2;

        System.out.printf("\n넓이 : %.2f \u33A0\n", area);

        keyboard.close();
    }
}
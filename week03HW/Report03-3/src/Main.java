import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("섭씨 온도(℃) 입력 : ");
        double c = keyboard.nextDouble();
        double f = c * 9 / 5 + 32; // F = C*9/5 + 32
        System.out.printf("섭씨 %.2f℃ -> 화씨 %.2f℉\n", c, f);
        keyboard.close();
    }
}
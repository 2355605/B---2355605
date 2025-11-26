import java.util.Scanner;

public class Input {
    public static double ReadData() {
        Scanner keyboard = new Scanner(System.in);
        double temp;
        System.out.print("섭씨 온도 입력: ");
        temp = keyboard.nextDouble();
        return temp;
    }
}

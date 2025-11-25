import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        int result;

        System.out.print("정수 입력 (1 ~ 9999) : ");
        num = keyboard.nextInt();

        if (!(num >= 1 && num < 10000)) {
            System.err.println("ERROR : 입력 범위는 1 ~ 9999 입니다");
        } else {
            if (num >= 1000) {              // 4자리 수
                result = 10000 - num;
            } else if (num >= 100) {        // 3자리 수
                result = 1000 - num;
            } else if (num >= 10) {         // 2자리 수
                result = 100 - num;
            } else {                        // 1자리 수
                result = 10 - num;
            }

            System.out.printf("입력한 정수 %d의 10의 보수는 %d 입니다.\n", num, result);
        }

        keyboard.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char ch;
        String result;

        System.out.print("하나의 문자 입력 : ");
        ch = keyboard.next().charAt(0);

        result = (ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9') ? "올바른" : "올바르지 않은";

        System.out.printf("입력 받은 %c는 %s 문자 입니다.\n", ch, result);
    }
}

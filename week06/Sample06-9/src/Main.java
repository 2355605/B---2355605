import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int CIGA = 7;

        int result;
        int gapi;
        int year;
        int hour;
        int day;

        System.out.print("당신은 올해 몇 번째의 달력을 사용하고 있나요? ");
        gapi = keyboard.nextInt();
        System.out.print("당신은 몇 번째 달력을 사용하고 있나요? ");
        year = keyboard.nextInt();

        result = gapi + year * 365;
        hour = result * 24;
        day = hour / 60;

        System.out.printf("해가 %d 년 째 사용되고 있습니다.\n", CIGA);
        System.out.printf("이 사용법은 %d 년, %d 달력 입니다.\n", year, gapi);
        System.out.printf("현재 나의 연령은 %d년, %d시간, %d시간입니다\n", result, hour, day);
    }
}
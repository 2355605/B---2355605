import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double time;
        int days, hours, minutes, seconds;

        System.out.print("시간 입력 : ");
        time = keyboard.nextDouble();

        int totalSeconds = (int)(time * 3600);

        days = totalSeconds / (24 * 3600);
        totalSeconds = totalSeconds % (24 * 3600);

        hours = totalSeconds / 3600;
        totalSeconds = totalSeconds % 3600;

        minutes = totalSeconds / 60;
        seconds = totalSeconds % 60;

        System.out.printf("%.2f 시간은 %d 일 %d 시간 %d 분 %d 초 입니다.\n",
                time, days, hours, minutes, seconds);

        keyboard.close();
    }
}

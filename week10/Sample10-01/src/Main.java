import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[] name = {"홍길동", "이재영", "윤석열", "오세훈"};
        int[] java = new int[name.length];
        int total = 0;
        int i = 0;

        while (true) {
            System.out.printf("%s 학생의 점수 입력 : ", name[i]);
            java[i] = keyboard.nextInt();

            if (java[i] >= 0 && java[i] <= 100) {
                i++;
                if (i >= name.length)
                    break;
            } else {
                System.err.println("ERROR : 0 ~ 100 사이");
                System.in.read();
            }
        }

        for (i = 0; i < java.length; i++)
            total += java[i];

        for (i = 0; i < java.length; i++)
            System.out.printf("%d 학생 = %3d 점\n", i + 1, java[i]);

        System.out.printf("총점 : %3d 점\n", total);
    }
}

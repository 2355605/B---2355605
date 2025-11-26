import java.io.IOException;
import java.util.Scanner;

class Input {
    static Scanner keyboard = new Scanner(System.in);

    public static void readData(String[][] students, int[] height) throws IOException {
        int i = 0;
        while (i < students.length) {
            System.out.printf("%s의 키 입력 : ", students[i][0]);
            height[i] = keyboard.nextInt();
            if (height[i] >= 30 && height[i] <= 250) {
                i++;
            } else {
                System.err.println("ERROR : 30 ~ 250");
                System.in.read();
            }
        }
    }

    public static void readData(String[][] students, float[][] weight) {
        int i = 0;
        while (i < students.length) {
            System.out.printf("%s의 체중 입력 : ", students[i][0]);
            weight[i][0] = keyboard.nextFloat();   // 실제 체중 저장

            if (weight[i][0] >= 10 && weight[i][0] <= 200) {
                i++;
            } else {
                System.err.println("ERROR : 10 ~ 200");
            }
        }
    }
}

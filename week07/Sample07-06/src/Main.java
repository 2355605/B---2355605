import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a, b, c;
        String result = "";
        double s;       // better use double for Math.sqrt
        double area;
        boolean flag = true;

        System.out.print("삼각형의 세 변의 길이(정수) 입력 : ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        // 삼각형이 될 수 있는 조건 검사
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            s = (a + b + c) / 2.0;   // ✅ fixed: (a + + c) → (a + b + c)
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            result = String.format("삼각형의 넓이는 %.2f cm² 입니다.", area);
        } else {
            result = "삼각형을 만들 수 없습니다.";
            flag = false;
        }

        if (flag) {
            System.out.printf("삼각형의 각 변의 길이: %,d cm, %,d cm, %,d cm → %s\n", a, b, c, result);
        } else {
            System.err.printf("삼각형의 각 변의 길이: %,d cm, %,d cm, %,d cm → %s\n", a, b, c, result);
        }

        keyboard.close();
    }
}

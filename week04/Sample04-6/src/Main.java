import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int base;
        int height;
        float area;
        System.out.print("삼각형의 밑변 입력: ");
        base = keyboard.nextInt();
        System.out.print("삼각형의 높이 입력: ");
        height = keyboard.nextInt();
        area = (base * height) / 2.0f;

        System.out.printf(">>> 삼각형 면적 <<<");
        System.out.printf("\t 밑변 :%,d Cm\n", base);
        System.out.printf("\t 높이 :%,d Cm\n", height);
        System.out.printf("\t 면적 :% 0.f,d Cm\n", area);



    }
}
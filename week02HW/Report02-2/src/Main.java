import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요 : ");
        double r = sc.nextDouble();

        double boxArea = 4.0 * r * r;
        double circleArea = Math.PI * r * r;
        double area = boxArea - circleArea;

        System.out.printf("정사각형면적 : %.2f Cm2\n", boxArea);
        System.out.printf("원의면적 : %.2f Cm2\n", circleArea);
        System.out.printf("구하는면적 : %.2f Cm2\n", area);
        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.print("체중(kg)을 입력하세요: ");
        double weight = sc.nextDouble();

        System.out.print("신장(cm)을 입력하세요: ");
        double height = sc.nextDouble();

        System.out.printf("당신의 나이는 %d살입니다.\n", age);
        System.out.printf("당신의 체중은 %.1fkg 입니다.\n", weight);
        System.out.printf("당신의 신장은 %.1fcm 입니다.\n", height);

        sc.close();
    }
}


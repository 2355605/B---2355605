import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int GOLD = 849000;
        float weight;
        float don;
        int result;

        System.out.print("당신의 체중은 ? ");
        weight = keyboard.nextFloat();

        don = weight;
        result = (int)(don * 1000 / 3.75f);

        System.out.printf("3근(3.75kg)의 가격은 %d 원 입니다.\n", GOLD);
        System.out.printf("당신의 체중은 %.1f Kg(%.1f 근) 입니다.\n", weight, don);
        System.out.printf("나의 몸무게는 %.1f Kg에 대해 %,d 원 입니다.\n", weight, result);
    }
}
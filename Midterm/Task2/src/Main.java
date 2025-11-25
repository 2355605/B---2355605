import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        int fee = 0;

        System.out.print("나이 입력 : ");
        age = keyboard.nextInt();

        if (age >= 18) {
            fee = 4000;
        } else if (age >= 13) {
            fee = 3000;
        } else if (age >= 7) {
            fee = 1000;
        } else {
            fee = 0;
        }

        System.out.printf("나이 : %d세\n", age);

        if (fee == 0) {
            System.out.println("입장료 : 무료");
        } else {
            System.out.printf("입장료 : %,d원\n", fee);
        }

        keyboard.close();
    }
}

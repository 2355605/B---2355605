import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int salary;
        int tax = 0; // ✅ initialize

        System.out.print("입금 입력 (1 ~ 30000000): ");
        salary = keyboard.nextInt();

        if (salary >= 1 && salary <= 30000000) {
            if (salary < 2_000_000) {
                tax = 0;
            } else if (salary <= 4_000_000) {
                tax = (int) ((salary - 2_000_000) * 0.10);
            } else if (salary <= 6_000_000) {
                tax = (int) ((salary - 2_000_000) * 0.08);
            } else if (salary <= 20_000_000) {
                tax = (int) ((salary - 2_000_000) * 0.06);
            } else {
                tax = (int) ((salary - 2_000_000) * 0.04); // ✅ added for >20M case
            }

            System.out.printf("급여액 %,d원의 세금은 %,d원 입니다.\n", salary, tax);
        } else {
            System.err.println("ERROR : 입력 범위는 1 ~ 30,000,000원 입니다.");
        }

        keyboard.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, num3;
        int result;

        System.out.print("세 개의 정수를 입력 : ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        // 1️⃣ Using ternary operator
        result = (num1 > num2)
                ? ((num1 > num3) ? num1 : (num2 >= num3 ? num2 : num3))
                : (num2 >= num3 ? num2 : (num3 >= num1 ? num3 : num1));

        System.out.printf("입력한 정수 %d, %d, %d 중에 큰 수는 %d 입니다.\n", num1, num2, num3, result);


        // 2️⃣ Using if-else
        if (num1 >= num2) {
            if (num1 >= num3) {
                result = num1;
            } else {
                result = num3;
            }
        } else {
            if (num2 >= num3) {
                result = num2;
            } else {
                result = num3;
            }
        }

        System.out.printf("입력한 정수 %d, %d, %d 중에 큰 수는 %d 입니다.\n", num1, num2, num3, result);


        // 3️⃣ Using switch
        // We'll first find which number is largest using conditions
        int temp;
        if (num1 >= num2 && num1 >= num3) {
            temp = 1;
        } else if (num2 >= num1 && num2 >= num3) {
            temp = 2;
        } else {
            temp = 3;
        }

        switch (temp) {
            case 1:
                result = num1;
                break;
            case 2:
                result = num2;
                break;
            case 3:
                result = num3;
                break;
            default:
                result = 0; // Should never happen
        }

        System.out.printf("입력한 정수 %d, %d, %d 중에 큰 수는 %d 입니다.\n", num1, num2, num3, result);
    }
}

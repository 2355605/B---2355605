import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        short age = 0;
        char gender = ' ';
        char result = ' ';


        System.out.print(" 당신의 이름은 ? ");
        name = keyboard.nextLine( );

        System.out.printf(" %s님의 나이는 ? ", name);
        age = keyboard.nextShort();

        System.out.printf(" %s님의 성별(남 = M, 여 = F) ? ", name);
        gender = keyboard.next().charAt(0);

        result = gender == 'M' ? '남' : '여';
        System.out.printf(" %s님의 성별은 %c(%c) 입니다.\n", name, gender, result);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("학교 : ");
        String school = keyboard.nextLine();

        System.out.print("이름 : ");
        String name = keyboard.nextLine();

        System.out.print("나이 : ");
        int age = keyboard.nextInt();

        System.out.print("성별(남/여) : ");
        char gender = keyboard.next().charAt(0);

        System.out.print("신장(cm) : ");
        double height = keyboard.nextDouble();

        System.out.print("체중(kg) : ");
        double weight = keyboard.nextDouble();

        System.out.println("*********************");
        System.out.printf("학교 : %s\n", school);
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("성별 : %c(여)\n", gender);
        System.out.printf("신장 : %.1f Cm\n", height);
        System.out.printf("체중 : %.1f Kg\n", weight);
        System.out.println("\n*********************");

        keyboard.close();
    }
}


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float height, weight; //data
        float feet, pound;
        final float FEETUNIT = 30.48f;
        final float POUNDUNIT = 0.453592f;

        System.out.print("키 입력(cm): ");
         height = keyboard.nextInt();
        System.out.print("몸무게 입력(kg): ");
         weight = keyboard.nextInt();
         feet = (height * FEETUNIT);
         pound = weight * POUNDUNIT;

        System.out.printf("키(%.2f cm)는 %.3f 피트(feet) 입니다.\n",height, weight );
        System.out.printf("몸무게(%.2f kg)는 %.3f 파운드(pound) 입니다.\n",feet, pound );
    }
}
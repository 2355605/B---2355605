import java.util.Scanner;

import static java.awt.AWTEventMulticaster.add;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int first, second;
        int result;

        Output.display();
        first = Input.readData("first data: ");
        second = Input.readData("second data: ");

        /*System.out.print("");
        first = keyboard.nextInt();
        System.out.print("");
        second = keyboard.nextInt();
        result = first + second;
        System.out.printf("\n", first, second, result);*/

        result = Compute.add(first, second);
        Output.display(first, second, result);
        Output.display();

    }


}
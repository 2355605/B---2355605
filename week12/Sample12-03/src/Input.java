import java.util.Scanner;

public class Input {
    public static void readData(int[] data) {
        Scanner keyboard = new Scanner(System.in);
        int i = 0;
        while(i < data.length){
            System.out.printf("");
            data[i] = keyboard.nextInt();
        }
    }
}

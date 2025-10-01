import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의이름은 ? ");
        String name = sc.nextLine().trim();

        System.out.printf("%s님의가족은몇 명입니까 ? ", name);
        int count = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.printf("%s님의가족은어디에서살지요 ? ", name);
        String where = sc.nextLine().trim();

        System.out.printf("%s님의가족은 %d명입니다.\n", name, count);
        System.out.printf("%s님의가족은 %s에서살고있습니다.\n", name, where);
        sc.close();
    }
}

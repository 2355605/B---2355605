public class Main {
    public static void main(String[] args) {
        boolean test  = ((('a' + 1) > 'A') && ('A' > 'B')); // 98>65 -> true && 65>66 -> false => false
        boolean test1 = ((('a' + 1) > 'A') || ('A' > 'B')); // true || false => true

        int a = 5;

        boolean test2 = ((5 > 3) && ((a++) != 0)); // left true; right 5!=0 -> true; a становится 6 => true
        boolean test3 = ((2 > 3) && ((++a) != 0)); // left false -> short-circuit; right не вычисляется; a остаётся 6 => false

        System.out.printf("test  = %b%n", test);
        System.out.printf("test1 = %b%n", test1);
        System.out.printf("test2 = %b, a = %d%n", test2, a); // true, a=6
        System.out.printf("test3 = %b, a = %d%n", test3, a); // false, a=6
    }
}

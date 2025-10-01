public class Main {
    public static void main(String[] args) {
        int a = 5 > 3 ? 6 :7;
        System.out.printf("a  = %d\n", a);

        int b = 2 > 3 ? (a++) : (a--);
        System.out.printf("a  = %d, b = %d\n", a, b);

        int c = b > a ? ++b -1 : a++ +1;
        System.out.printf("a  = %d, b = %d, c = %d\n", a, b, c);

        int d = (b > a) && (a++ > 3) ? (++b) -1 : (a++) +1;
        System.out.printf("a  = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
    }
}
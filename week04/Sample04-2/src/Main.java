//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 5 % 2; //1
        int d = -5 % 2; //-1
        int e = -5 % -2; //-1; a % b = a - (a / b) * b ; Сначала целочисленное деление: -5 / -2 = 2 ; Остаток: -5 - (2 * -2) = -5 + 4 = -1
        int f = 5 % -2; //1

        a +=(3+6); // a = a +(3+6) =14


        System.out.printf("a = %d, b =%d, c =%d, d =%d, e =%d, f=%d  \n", a,b,c,d,e,f);
    }
}
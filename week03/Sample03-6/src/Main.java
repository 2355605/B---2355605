public class Main {
    public static void main(String[] args) {
        int time = 5800;
        int work = 5;;
        int day = 7;
        int money = 25000;
        money = money + ((time * work)* day);


        System.out.printf("나의 시급 : %d %c\n", time, '\uffe6');
        System.out.printf("하루에 일한 시간 : %d 일\n", work);
        System.out.printf("며칠 일했나요 : %d 일\n", day);
        System.out.printf("나의 지갑 돈 : %,d %c\n", money, '\uffe6', money);
    }
}
public class Main {
    public static void main(String[] args) {
        final float YEAR = 365.2422f;
        int day;
        int hour;
        int minute;
        int second;

        day = (int) YEAR;
        float temp = YEAR - day;
        hour = (int) (temp * 24);
        temp = temp * 24 - hour;
        minute = (int) (temp * 60);
        temp = temp * 60 - minute;
        second = (int) (temp * 60 + 0.5);

        System.out.printf("1년은 %.4f일인데 이것은\n" +
                "%d일 %d시간 %d분 %d초 입니다.\n", YEAR, day, hour, minute, second);
    }
}
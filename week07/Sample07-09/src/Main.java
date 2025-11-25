import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score;
        char grade;
        char plus;

        System.out.print("점수 입력 (0 ~ 100) : ");
        score = keyboard.nextInt();

        if (score >= 0 && score <= 100) {
            int temp = score / 10;   // 10의 자리

            switch (temp) {
                case 10:              // 100점
                    grade = 'A';
                    plus  = '+';
                    break;
                case 9:               // 90~99
                    grade = 'A';
                    plus  = ' ';
                    break;
                case 8:               // 80~89
                    grade = 'B';
                    plus  = ' ';
                    break;
                case 7:               // 70~79
                    grade = 'C';
                    plus  = ' ';
                    break;
                case 6:               // 60~69
                    grade = 'D';
                    plus  = ' ';
                    break;
                default:              // 0~59
                    grade = 'F';
                    plus  = ' ';
                    break;
            }

            if (grade == 'B' || grade == 'C' || grade == 'D') {
                int temp1 = score % 10;  // 1의 자리
                switch (temp1) {
                    case 9:
                    case 8:
                    case 7:
                    case 6:
                    case 5:
                        plus = '+';
                        break;
                    default:
                        plus = ' ';
                        break;
                }
            }

            System.out.printf("점수가 %d이면 학점은 %c%c 입니다.\n", score, grade, plus);
        } else {
            System.err.println("ERROR : 점수는 0 ~ 100 입니다.");
        }

        keyboard.close();
    }
}

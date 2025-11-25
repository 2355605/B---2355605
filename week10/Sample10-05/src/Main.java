import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        String[] name = {"황길동","이재명","윤석열","경복대","오세훈",
                "강민성","김진성","니키타","김시온","김정은"};
        String[] hakbun = {"2501002","2501003","2501004","2501005","2501006",
                "2501007","2501008","2501009","2501010","2501011"};

        int[] kor  = new int[name.length];
        int[] eng  = new int[name.length];
        int[] math = new int[name.length];
        int[] sum  = new int[name.length];
        float[] avg = new float[name.length];
        int[] rank = new int[name.length];

        // 입력
        int i = 0;
        while (i < name.length) {
            System.out.printf("%s 학생의 국어 성적 입력: ", name[i]);
            kor[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 영어 성적 입력: ", name[i]);
            eng[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 수학 성적 입력: ", name[i]);
            math[i] = keyboard.nextInt();

            if ((kor[i]  >= 0 && kor[i]  <= 100) &&
                    (eng[i]  >= 0 && eng[i]  <= 100) &&
                    (math[i] >= 0 && math[i] <= 100)) {
                i++;
            } else {
                System.err.println("ERROR : 0 ~ 100");
                System.in.read();
            }
        }

        // 합계/평균
        for (i = 0; i < name.length; i++) {
            sum[i] = kor[i] + eng[i] + math[i];
            avg[i] = sum[i] / 3.0f;
        }

        // 1) 평균 내림차순 정렬 (버블) + 동반 교환
        for (i = 0; i < name.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < name.length - 1 - i; j++) {
                if (avg[j] < avg[j + 1]) { // 내림차순
                    // avg / sum
                    float f_temp = avg[j];  avg[j] = avg[j + 1];  avg[j + 1] = f_temp;
                    int   test   = sum[j];  sum[j] = sum[j + 1];  sum[j + 1] = test;

                    // 과목
                    test = kor[j];  kor[j] = kor[j + 1];  kor[j + 1] = test;
                    test = eng[j];  eng[j] = eng[j + 1];  eng[j + 1] = test;
                    test = math[j]; math[j] = math[j + 1]; math[j + 1] = test;

                    // 이름/학번
                    String s_temp = name[j];  name[j] = name[j + 1];  name[j + 1] = s_temp;
                    s_temp = hakbun[j];       hakbun[j] = hakbun[j + 1]; hakbun[j + 1] = s_temp;

                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        // 2) 등수(동점 동일 등수)
        for (i = 0; i < name.length; i++) rank[i] = i + 1;
        for (i = 0; i < name.length - 1; i++) {
            if (Math.abs(avg[i] - avg[i + 1]) < 1e-6) { // avg 같으면
                rank[i + 1] = rank[i];
            }
        }

        // 3) 학번 오름차순으로 재정렬(등수/평균/총점/점수 같이 이동)
        for (i = 0; i < name.length - 1; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (hakbun[i].compareTo(hakbun[j]) > 0) {
                    String s_temp = hakbun[j]; hakbun[j] = hakbun[i]; hakbun[i] = s_temp;
                    s_temp = name[j];          name[j]   = name[i];   name[i]   = s_temp;

                    int test = kor[j]; kor[j] = kor[i]; kor[i] = test;
                    test = eng[j];     eng[j] = eng[i]; eng[i] = test;
                    test = math[j];    math[j] = math[i]; math[i] = test;
                    test = sum[j];     sum[j] = sum[i];   sum[i] = test;

                    float f_temp = avg[j]; avg[j] = avg[i]; avg[i] = f_temp;

                    test = rank[j]; rank[j] = rank[i]; rank[i] = test;
                }
            }
        }

        // 출력 (샘플 화면 형태)
        System.out.println("****************************************************************");
        System.out.println("학번     이름    국어  영어  수학   총점    평균  등수");
        System.out.println("****************************************************************");
        for (i = 0; i < name.length; i++) {
            System.out.printf("%s  %-6s %4d %4d %4d %5d %7.1f %3d%n",
                    hakbun[i], name[i], kor[i], eng[i], math[i], sum[i], avg[i], rank[i]);
        }
        System.out.println("****************************************************************");
    }
}

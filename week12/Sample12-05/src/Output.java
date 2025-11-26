class Output {

    public static void display(String[][] students, int[] height, float[][] weight) {
        line();
        System.out.println("이름\t성별\t키\t실제체중\t표준체중\t편차(%)\t판정");
        line();

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%3s\t%1s\t%3d\t%6.1f\t%6.1f\t%6.1f\t%s\n",
                    students[i][0], students[i][1], height[i],
                    weight[i][0], weight[i][1], weight[i][2],
                    students[i][2]);
        }
        line();
    }

    private static void line() {
        System.out.println("************************************************");
    }
}

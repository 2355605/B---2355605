import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[][] students= new String[][] {{"김민준", "남", ""}, {"이서연", "여", ""}, {"박지후", "남", ""},
                {"최예린", "여", ""}, {"정우진", "남", "" }, {"한지민" , "남", ""}, {"오세훈", "남", ""}, {"윤아린", "여", ""},
                {"장도윤", "남", ""}, {"강하린", "여", ""}};

        int[] height = new int[students.length];
        float[][] weight = new float[students.length][3];

        Input.readData(students, height);
        Input.readData(students, weight);

        Compute.standard(students, height, weight);
        Compute.bmi(students, height, weight);
        Compute.check(students, weight);

        Output.display(students, height, weight);
    }
}
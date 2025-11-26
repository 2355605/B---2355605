public class Main {
    public static void main(String[] args) {
        double temp;
        double result;

        temp = Input.ReadData();
        result = Compute.convert(temp);
        Output.display(temp, result);
    }
}
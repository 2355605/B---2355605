public class Main {
    public static void main(String[] args) {
        int[] data = new int[10];
        int result;

        Input.readData(data);
        result = Compute.add(data);
        Output.display(data, result);

    }
}
public class Main {
    public static void main(String[] args) {
        int radius;
        float area;

        radius = Input.readData();
        area = Compute.area(radius);
        Output.display(radius, area);

    }
}
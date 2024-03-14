public class MyApp {
    public static void main(String[] args) {
        int length = 2;
        int width = 3;
        int height = 4;

        int volume = length * width * height;
        System.out.println("Об'єм паралелепіпеда = " + volume);

        int sumLength = 4 * (length + width + height);
        System.out.println("Довжина сторін = " + sumLength);
    }
}

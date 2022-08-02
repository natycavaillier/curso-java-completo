package estaticos;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double radius = 5;

        double circumference = Calculator.circumference(radius);
        double volume = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);

    }
}

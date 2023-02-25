package dominio;
import java.util.stream.Stream;

public class ej2_13_lambda {
    public static int fib12() {
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}).limit(12).map(f -> f[0]).reduce(0, (a, b) -> b);
    }

    public static int fib13() {
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}).limit(13).map(f -> f[0]).reduce(0, (a, b) -> b);
    }

    public static boolean comparar(double a) {
        double fib = fib13() / fib12();
        if (a == fib) {
            return true;
        } else {
            return false;
        }
    }
}

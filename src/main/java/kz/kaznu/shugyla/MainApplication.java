package kz.kaznu.shugyla;

public class MainApplication {
    public static void main(String[] args) {
        double[] bValues = {1e3, 1e4, 1e5, 1e6, 1e7,1e8,1e9};

        System.out.println("b\t\tNaive Algorithm (x2)\tStable Algorithm (x2)\tRelative Error");
        System.out.println("-----------------------------------------------------------------------------------------");

        for (double b : bValues) {
            double discriminant = b * b - 4.0;
            double x_naive = (-b + Math.sqrt(discriminant)) / 2.0;
            double x_stable = -2.0 / (b + Math.sqrt(b * b - 4.0));
            double relError = Math.abs((x_naive - x_stable) / x_stable);
            System.out.printf("%.0e\t%.15e\t%.15e\t%.2e\n", b, x_naive, x_stable, relError);
        }
    }
}

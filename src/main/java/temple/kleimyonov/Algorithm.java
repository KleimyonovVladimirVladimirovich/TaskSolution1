package temple.kleimyonov;

public class Algorithm {
    public double series(double temp, double sum) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            temp *= (double) 1/i;
            sum += temp;

        }
        return sum;
    }
}

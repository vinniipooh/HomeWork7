/**
 * Created by Александр on 14.04.2017.
 */
public class MethodTask1 {
    private double fraction1;
    private double fraction2;
    private double fraction3;

    public MethodTask1(int _a1, int _b1, int _a2, int _b2, int _a3, int _b3) {
        fraction1 = _a1 / _b1;
        fraction2 = _a2 / _b2;
        fraction3 = _a3 / _b3;
    }

    public double reverseFraction(double _fraction) {
        return 1 / _fraction;
    }

    public double getFraction1() {
        return fraction1;
    }

    public double getFraction2() {
        return fraction2;
    }

    public double getFraction3() {
        return fraction3;
    }

    public double plusFraction(double fr1, double fr2) {
        return fr1 + fr2;
    }
    public double multFraction(double fr1, double fr2) {
        return fr1 * fr2;
    }
    public double minusFraction(double fr1, double fr2) {
        return fr1 - fr2;
    }
}

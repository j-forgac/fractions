import java.util.ArrayList;

public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

    @Override
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public IFraction plus(IFraction other) {

        int newNumerator = this.numerator * other.getDenominator() + other.getNumerator() * this.getDenominator();
        int newDenominator = this.denominator * other.getDenominator();
        return Fraction.createNormalised(newNumerator, newDenominator);
    }

    @Override
    public IFraction minus(IFraction other) {

        int newNumerator = this.numerator * other.getDenominator() - other.getNumerator() * this.getDenominator();
        int newDenominator = this.denominator * other.getDenominator();
        return Fraction.createNormalised(newNumerator, newDenominator);
    }

    @Override
    public IFraction times(IFraction other) {
        int newNumerator = this.numerator * other.getNumerator();
        int newDenominator = this.denominator * other.getDenominator();
        return Fraction.createNormalised(newNumerator, newDenominator);
    }

    @Override
    public IFraction dividedBy(IFraction other) {
        int newNumerator = this.numerator * other.getDenominator();
        int newDenominator = this.denominator * other.getNumerator();
        return Fraction.createNormalised(newNumerator, newDenominator);
    }

    public static Fraction createNormalised(Integer numerator, Integer denominator) {
        int greatestCommonDenominator = findGreatestCommonDenominator(numerator, denominator);
        int newNumerator = numerator / greatestCommonDenominator;
        int newDenominator = denominator / greatestCommonDenominator;
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * @link https://www.baeldung.com/java-greatest-common-divisor
     */

    private static Integer findGreatestCommonDenominator(Integer i1, Integer i2) {
        if (i1 < i2) return findGreatestCommonDenominator(i2, i1);
        if (i2 == 0) return i1;
        return findGreatestCommonDenominator(i2, i1 % i2);
    }

    /**
     * USELESS - zbytečný řádky, který se nemusí ani použít
     * bohatě stačí jen findGreatestCommonDenominator
     */

    private static Integer findLowestCommonMultiple(Integer i1, Integer i2) {
        if (i1 == 0 || i2 == 0) return 0;
        else {
            int gcd = findGreatestCommonDenominator(i1, i2);
            return Math.abs(i1 * i2) / gcd;
        }
    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }
}

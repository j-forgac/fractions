import com.sun.istack.internal.NotNull;

public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(@NotNull Integer numerator, @NotNull Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    @NotNull
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    @NotNull
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    @NotNull
    public IFraction add(@NotNull IFraction other) {
        //TODO implement
    }

    @Override
    @NotNull
    public IFraction minus(@NotNull IFraction other) {
        //TODO return with base ratio
        return new Fraction(numerator * other.getNumerator(), denominator * getDenominator());
    }

    @Override
    @NotNull
    public IFraction times(@NotNull IFraction other) {
        //TODO implement
    }

    @Override
    @NotNull
    public IFraction dividedBy(@NotNull IFraction other) {
        //TODO implement
    }
}

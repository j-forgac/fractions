import com.sun.istack.internal.NotNull;

public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(@NotNull Integer numerator, @NotNull Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public @NotNull
    Integer getNumerator() {
        return numerator;
    }

    @Override
    public @NotNull
    Integer getDenominator() {
        return null;
    }

    @Override
    public @NotNull
    IFraction add(@NotNull IFraction other) {
        return new Fraction(other.getNumerator(), other.getDenominator());
    }

    @Override
    public @NotNull
    IFraction minus(@NotNull IFraction other) {
        return null;
    }

    @Override
    public @NotNull
    IFraction times(@NotNull IFraction other) {
        return null;
    }

    @Override
    public @NotNull
    IFraction dividedBy(@NotNull IFraction other) {
        return null;
    }
}

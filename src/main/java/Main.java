public class Main {

    public static void main(String[] args) {
        System.out.println("0. priklad");
        System.out.println(Fraction.createNormalised(22, 12));
        System.out.println("1. priklad");
        System.out.println(Fraction.createNormalised(4, 12));
        System.out.println("2. priklad");
        System.out.println(new Fraction(2, 4).plus(new Fraction(3, 9)));
        System.out.println(new Fraction(2, 4).minus(new Fraction(3, 9)));
        System.out.println(new Fraction(2, 4).times(new Fraction(3, 9)));
        System.out.println(new Fraction(2, 4).dividedBy(new Fraction(3, 9)));
    }
}

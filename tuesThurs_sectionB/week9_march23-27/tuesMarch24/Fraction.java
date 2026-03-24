//what does a fraction need?
public class Fraction {
    private int num;
    private int denom;

    public Fraction(int n, int d) {
        num = n;
        denom = d;
    }

    public Fraction plus(Fraction other) {
        //first fraction's numerator: num
        //second fraction's numerator: other.num
        //first fraction's denominator: denom
        //second fraction's denominator: other.denom

        int commonDenom = denom*other.denom;
        int newNum = num*other.denom + other.num*denom;

        Fraction result = new Fraction(newNum, commonDenom);
        return result;
    }
}
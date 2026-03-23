//what does a fraction need?
public class Fraction {
    //fields
    private int num;
    private int denom;

    //constructor
    public Fraction(int n, int d) {
        num = n;
        denom = d;
    }

    //methods
    //add

    public Fraction plus(Fraction other) {
        //num is 1 
        //denom is 2
        //other.num is 2
        //other.denom is 3

        int newDenom = denom*other.denom;
        int newNum = num*other.denom + other.num*denom;

        Fraction answer = new Fraction(newNum, newDenom);
        return answer;
    }
}
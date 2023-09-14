class Rational {
    long numerator,denominator;

    class Illegal extends Exception {
        String reason;
        Illegal (String reason) {
            this.reason = reason;
        }
    }

    Rational() {
        // to be completed
        super();
    }

    Rational(long numerator, long denominator) throws Illegal {
        // to be completed
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // find the reduce form
    private void simplestForm() {
        long computeGCD;
        computeGCD = GCD(Math.abs(numerator), denominator);
        numerator /= computeGCD;
        denominator /= computeGCD;
    }

    // find the greatest common denominator
    private long GCD(long a, long b) {
        if (a%b ==0) return b;
        else return GCD(b,a%b);
    }

    /***
     * Compute an addition of the current rational number to another given rational number
     * @param x the rational number to be added to the current rational number
     */
    public void add(Rational x) {
        numerator = (numerator * x.denominator) + (x.numerator * denominator);
        denominator = (denominator * x.denominator);
        simplestForm();
    }

    /***
     * Compute a subtraction of the current rational number to another given rational number
     * @param x the rational number to be subtracted from the current rational number
     */
    public void subtract(Rational x) {
        // to be completed
        numerator = (numerator * x.denominator) - (x.numerator * denominator);
        denominator = (denominator * x.denominator);
        simplestForm();
    }

    /***
     * Compute a multiplication of the current rational number to another given rational number
     * @param x the rational number to be multiplied to the current rational number
     */
    public void multiply(Rational x) {
        // to be completed
        numerator = (numerator * x.numerator);
        denominator = (denominator * x.denominator);
        simplestForm();
    }

    /***
     * Compute a division of the current rational number to another given rational number
     * @param x the rational number to be divided by the current rational number
     */
    public void divide(Rational x) {
        // to be completed
        numerator = (numerator * x.denominator);
        denominator = (denominator * x.numerator);
        simplestForm();
    }

    /***
     * Check if the given rational number equals to the current rational number
     * @param x the rational number to be compared to the current rational number
     * @return true if the given rational number equals to the current, false otherwise
     */
    public boolean equals(Object x) {
        // to be completed
        // TODO: This needs to be modified.
        if (x == null) return false;
        if (x.getClass() != this.getClass()) return false;
        Rational b = (Rational) x;
        return compareTo(b) == 0;
    }

    /***
     * Compare the current rational number to the current rational number
     * @param x the rational number to be compared to the current rational number
     * @return -1 if the current rational number is less than the given number, 0 if they're equal, 1 if the current
     * rational number is larger than the given number
     */
    public long compareTo(Object x) {
        // to be completed
        // TODO: this needs to be modified.
        Rational b = (Rational) x;
        Rational a = this;
        long lhs = a.numerator * b.denominator;
        long rhs = a.denominator * b.numerator;
        if (lhs < rhs) return -1;
        if (lhs > rhs) return +1;
        return 0;
    }

    /***
     * Give the formatted string of the rational number
     * @return the string representation of the rational number. For example, "1/2", "3/4".
     */
    public String toString() {
        // to be completed
        // TODO: This needs to be modified.
        if(denominator == 1)
            return Long.toString(numerator);
        return Long.toString(numerator)+"/"+Long.toString(denominator);
    }

    public static void main(String[] args) {
        System.out.println("This is Rational class.");

        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
//        x.add(y);
//        x.subtract(y);
        x.multiply(y);
//        x.divide(y);
        System.out.println(x.toString());
    }
}
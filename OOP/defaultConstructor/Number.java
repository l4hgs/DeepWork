public class Number {
    private int value;
    private Sign sign;

    enum Sign {
        ZERO, POSITIVE, NEGATIVE;
    }
    // default constructor
    /* Number() {
        value = 0;
        sign = Sign.ZERO;
    } */

    // overloaded constructor
    Number(int n) {
        value = n;
        getSign();
    }

    private void getSign() {
        if (value < 0) {
            sign = Sign.NEGATIVE;
        } else if (value > 0) {
            sign = Sign.POSITIVE;
        } else {
            sign = Sign.ZERO;
        }
    }

    void display() {
        System.out.println("Value: " + value);
        System.out.println("Sign: " + sign);
    }
}

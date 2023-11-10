package pwo.seq;

import java.math.BigDecimal;

public class TribonacciGenerator extends FibonacciGenerator {

    public TribonacciGenerator() {
        super();
        f_3 = BigDecimal.ZERO;
    }

    @Override
    public void reset() {
        super.reset();
        f_3 = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            current = BigDecimal.ZERO;
        } else if (lastIndex == 1) {
            current = BigDecimal.ONE;
        } else if (lastIndex == 2) {
            current = BigDecimal.ONE;
        } else {
            current = super.nextTerm();
        }

        lastIndex++;
        return current;
    }

    @Override
    public BigDecimal previousTerm() {
        if (lastIndex <= 1) {
            return null;
        } else if (lastIndex == 2) {
            return BigDecimal.ONE;
        } else {
            for (int i = lastIndex; i >= 3; i--) {
                BigDecimal temp = f_3.subtract(f_2).subtract(f_1);
                f_1 = f_2;
                f_2 = f_3;
                f_3 = temp;
            }
            lastIndex--;
            return f_3;
        }
    }
}

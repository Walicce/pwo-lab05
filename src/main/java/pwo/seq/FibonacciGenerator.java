package pwo.seq;

import java.math.BigDecimal;

public class FibonacciGenerator extends Generator {

    public FibonacciGenerator() {
        current = BigDecimal.ZERO;
        f_1 = BigDecimal.ONE;
        f_2 = BigDecimal.ZERO;
    }

    @Override
    public void reset() {
        super.reset();
        current = BigDecimal.ZERO;
        f_1 = BigDecimal.ONE;
        f_2 = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = BigDecimal.ONE;
        } else {
            current = BigDecimal.ZERO;
        }
        lastIndex++;
        return current;
    }

    @Override
    public BigDecimal previousTerm() {
        if (lastIndex <= 2) {
            reset();
            return BigDecimal.ZERO;
        } else {
            BigDecimal temp = f_2.subtract(f_1);
            f_1 = f_2;
            f_2 = temp;
            lastIndex--;
            return temp;
        }
    }
}

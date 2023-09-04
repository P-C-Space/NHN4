package com.nhnacademy.exam;

import java.util.function.*;

public interface IteratorAsDouble {
    boolean hasMore();

    double next();

    default double reduce(java.util.function.DoubleBinaryOperator binaryOperator, double init) {
        double result = init;
        while (hasMore()) {
            double current = next();
            result = binaryOperator.applyAsDouble(result, current);
        }
        return result;// TODO: 채웁니다
    }

    default IteratorAsDouble take(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("take: n <= 0, where n == " + n);
        }
        return new IteratorAsDouble() {

            private int current = 0;
            private double nextElement;

            public boolean hasMore() {
                while (IteratorAsDouble.this.hasMore() && current <= 10) {
                    nextElement = IteratorAsDouble.this.next();
                    return true;
                }
                return false;
            }

            public double next() {
                current++;
                return nextElement;
            }
        };
    }

    default void forEachRemaining(DoubleConsumer f) {
        while (hasMore()) {
            double current = next();
            f.accept(current);
        }
    }

    public static IteratorAsDouble of(double... numbers) {
        return new IteratorAsDouble() {
            private int currentIndex = 0;
            public boolean hasMore(){
                while(currentIndex < numbers.length -1){
                    return true;
                }
                return false;
            }
            
            public double next(){
                return numbers[currentIndex++];
            }
            };
    }

    default IteratorAsDouble filter(DoublePredicate predicate) {
        return new IteratorAsDouble() {
            private double nextElement;

            public boolean hasMore() {
                while (IteratorAsDouble.this.hasMore()) {
                    nextElement = IteratorAsDouble.this.next();
                    if (predicate.test(nextElement))
                        return true;
                }
                return false;
            }

            public double next() {
                return nextElement;
            }
        };
    }
}

package com.nhnacademy.exam;

import static com.nhnacademy.exam.Mathx.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FibonacciTest {

    @Test
    @DisplayName("FibonacciBaseCase")
    void FibonacciBaseCase(){
        Assertions.assertEquals(0, fibonacci(0));
    }

    @Test
    @DisplayName("FibonacciBaseCase2")
    void FibonacciBaseCase2(){
        Assertions.assertEquals(1, fibonacci(1));
    }


    static Stream<Arguments> fibonacciValue(){
        return Stream.of(
                Arguments.of(5,5),
                Arguments.of(6,8),
                Arguments.of(9,34),
                Arguments.of(14,377),
                Arguments.of(18,2584)
        );
    }

    @ParameterizedTest
    @MethodSource("fibonacciValue")
    @DisplayName("fibonaccirecursionCase")
    void fibonaccirecursionCase(int x,int y){
        Assertions.assertEquals(y,fibonacci(x));
    }

    @Test
    @DisplayName("fibonacciPreCondition")
    void fibonacciPreCondition(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->fibonacci(-1));
    }

    @Test
    @DisplayName("fibonacciPostCondition")
    void fibonacciPostCondition(){
        Assertions.assertThrows(StackOverflowError.class, () -> fibonacci(Integer.MAX_VALUE));
    }

}
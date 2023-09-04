package com.nhnacademy.exam;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MathxTest {

    @Test
    @DisplayName("sphereminusTest")
    void sphereminusTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> Mathx.sphereVolume(-1));
    }


    static Stream<Arguments> sphereVolumeValue(){
        return Stream.of(
                Arguments.of(12, 2304.0 * Math.PI),
                Arguments.of(9, 972.0 * Math.PI)
        );
    }
    @ParameterizedTest
    @MethodSource("sphereVolumeValue")
    @DisplayName("sphereVolumeTest")
    void sphereVolumeTest(int x,double y){
        Assertions.assertEquals(y,Mathx.sphereVolume(x));
    }

    @Test
    @DisplayName("rangeMinMaxTest")
    void rangeMinMaxTest(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> Range.of(1,0));
    }


    static Stream<Arguments> rangeValue(){
        return Stream.of(
                Arguments.of(0,0,0),
                Arguments.of(0,10,55),
                Arguments.of(-2,2,0)
        );
    }
    @ParameterizedTest
    @MethodSource("rangeValue")
    @DisplayName("rangeSumTest")
    void rangeSumTest(int x,int y, int result){
        Assertions.assertEquals(Mathx.sum(Range.of(x,y)),result);
    }

    @Test
    @DisplayName("rangeSumTest2")
    void rangeSumTest2(){
        Assertions.assertEquals(Mathx.sum(Range.of(-10,0)),-Mathx.sum(Range.of(0,10)));
        Assertions.assertEquals(Mathx.sum(Range.of(10,99)) + 100,Mathx.sum(Range.of(10,100)));
    }

//    private static void iterator() {
//        Range r = Range.of(1, 100);
//        assert Mathx.sum(1, 2, 3, 7, 9, 10, 5, 4, 8, 6) == Mathx.sum(Range.of(1, 10));
//        assert Mathx.product(1, 2, 3, 7, 9, 10, 5, 4, 8, 6) == Mathx
//                .product(Range.of(1, 10).iterator());
//        assert (Mathx.sum(r.iterator().filter(Mathx.even))
//                + Mathx.sum(r.iterator().filter(Mathx::odd))) == Mathx.sum(r.iterator());
//        assert r.iterator().take(10).reduce((x, y) -> x + y, 0) == 55;
//        Mathx.randomNumbers(r).take(10).forEachRemaining(x -> System.out.print(x + " "));
//    }


}
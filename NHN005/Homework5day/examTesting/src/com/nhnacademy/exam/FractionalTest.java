package com.nhnacademy.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FractionalTest { // 또는 Rational
    private FractionalTest() {}
    @Test
    @DisplayName("FractionalTest")
    void FractionalTest(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->Fractional.of(1,0));
    }


    @Test
    @DisplayName("FractionalnormalizeTest")
    void FractionalnormalizeTest(){
        Assertions.assertEquals(Fractional.of(1,2),Fractional.of(2,4));
        Assertions.assertEquals(Fractional.of(1,-2),Fractional.of(-1,2));
    }

    @Test
    @DisplayName("FractionalHashTest")
    void FractionalHashTest(){
        Assertions.assertEquals(Fractional.of(1,2).hashCode(),Fractional.of(2,4).hashCode());
        Assertions.assertEquals(Fractional.of(1,-2).hashCode(),Fractional.of(-1,2).hashCode());
    }


}

package com.nhnacademy.dicecalculatorTest;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DiceCalculatorTest {

    // TA Code
    static Stream<Arguments> diceValue() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(2, 2, 4),
                Arguments.of(3, 2, 5),
                Arguments.of(4, 2, 6),
                Arguments.of(5, 2, 7),
                Arguments.of(6, 2, 8),
                Arguments.of(6, 3, 9),
                Arguments.of(6, 4, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("diceValue")
    @DisplayName("DiceCalculator.addDice Param Test")
    void addDiceParamTest(int first, int second, int result) {
        Dice firstDice = new Dice(first);
        Dice secondDice = new Dice(second);

        Assertions.assertEquals(result, DiceCalculator.addDice(firstDice, secondDice));
    }

    // My Code
    @Test
    @DisplayName("DiceCalculator addDice 테스트")
    void addDiceTest() {
        Dice a = new Dice(5);
        Dice b = new Dice(3);
        int result = 8;

        Assertions.assertEquals(result, DiceCalculator.addDice(a, b));
    }

    // TA Code
    @Test
    @DisplayName("DiceCalculator.getIndexOf Test")
    void getIndexTest() {
        Dice dice = new Dice(6);
        String str = "a1b2c3d4";

        Assertions.assertEquals("a1b2c3", DiceCalculator.getIndexOf(str, dice.getNumber()));
    }


    // My Code
    @Test
    @DisplayName("DiceCaculator getIndexOf 테스트")
    void getIndexOfTest() {
        String test = "args";
        int val = test.length();

        Assertions.assertEquals(test, DiceCalculator.getIndexOf(test, val));
    }

    // TA Code
    @Test
    @DisplayName("DiceCalculator.odd Test")
    void oddTest() {
        Dice dice = new Dice(2);
        Assertions.assertFalse(DiceCalculator.odd(dice));

        Dice dice2 = new Dice(3);
        Assertions.assertTrue(DiceCalculator.odd(dice2));
    }

    // My Code
    @Test
    @DisplayName("DiceCalculator odd 테스트")
    void CaculatorOddTest() {
        Dice a = new Dice(4);
        boolean test = false;

        Assertions.assertEquals(test, DiceCalculator.odd(a));
    }
}

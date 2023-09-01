package com.nhnacademy.converter;
// 2진수 : binary number      0b
// 8진수 : octal number       0
// 10진수 : decimal number
// 16진수 : hexadecimal       0x
public class Main {
    public static void main(String[] args) {

        // 2, 8, 16 -> 10 진수
        System.out.println(Converter.numberToDecimal("0b1101011")); // 107
        System.out.println(Converter.numberToDecimal("O153"));      // 107
        System.out.println(Converter.numberToDecimal("0xA249"));    // 41545

        // 10 진수 -> 2, 8, 16
        System.out.println(Converter.decimalToNumber(107,2));   // 0b1101011
        System.out.println(Converter.decimalToNumber(107,8));   // 0153
        System.out.println(Converter.decimalToNumber(41545,16)); // 0xA249

        // 2 -> 8
        System.out.println(Converter.binaryToOctal("0b1101011")); // 015

        // 8 -> 2
        System.out.println(Converter.octalToBinary("O153")); // Ob1101011

        // 2 -> 16
        System.out.println(Converter.binaryToHex("0b1010001001001001")); // 0xA249

        // 16 -> 2
        System.out.println(Converter.hexToBinary("0xA249")); // 0b1010001001001001

        // 8 -> 16
        System.out.println(Converter.octalToHex("0153")); // 0x6B

        // 16 -> 8
        System.out.println(Converter.hexToOctal("0xA249")); // 0b121111

    }
}

# Java 기초

## 준비

- 문제를 푼 source code를 nhnexam@gmail.com로 압축해서 첨부 파일로 보내세요.
    - *.class 파일을 보내면 0 점 처리합니다.
- Java 기초 과정을 들은 지원자는 [설문](https://forms.gle/kUqpNEXDgpxJ2uTA7)에 답하세요.

## 구문과 해석

[Mathx.fibonacci][Mathx]에서 if를 switch로 바꿉니다.
- return 2개만 써서
- break 1개, return 1개만 써서

## 수식

구의 부피 ${ 4 \over3 } r^3 \pi $을 구하는 Mathx.sphereVolume를 만듭니다.
- java.lang.Math를 씁니다.
- 테스트 코드는 [MathxTest.sphereVolume()][MathxTest]입니다.

## 애플리케이션

```console
$ java TrueTest true True AnythingButTrueIsFalse
true
$ java TrueTest 0 x true true true
false
$ java TrueTest true true
Exception in thread "main" java.lang.IllegalArgumentException: TrueTest: three boolean arguments required
    ...
```

TrueTest.twoMoreTrue를 정의하고 TrueTest application을 만듭니다.
TrueTest.twoMoreTrue는:
- boolean 값을 셋 받아서 true가 둘보다 많으면 true 아니면 false라 답합니다.
- if를 쓰지 않고 풉니다.
- Boolean.valueOf(String s)를 씁니다.

## Evaluation Process

[FibonacciTest][FibonacciTest]의 어느 method에서 무슨 Exception 던지나요? 왜 그런가요?

## Data Abstraction

- [Mathx.sum(Range range)][Mathx]에서는 쓰는 Range class를 만듭니다. Test code는 [MathxTest.range()][MathxTest] 입니다.
- [FractionalTest][FractionalTest]에서 AssertionError가 나지 않도록 [Fractional(분수)][Fractional] class를 고칩니다. 왜 그렇게 고쳤나요?

## Polymorphism

[MathxTest.iterator()][MathxTest]가 AssertionError 없이 잘 돌아가도록 IteratorAsDouble class의 TODO를 채웁니다.
- [Mathx.randomNumbers(Range)][Mathx]와 [IteratorAsDouble][IteratorAsDouble] class의 filter(DoublePredicate predicate)

[Mathx]: ./exam/Mathx.java
[MathxTest]: ./exam/MathxTest.java
[FibonacciTest]: ./exam/FibonacciTest.java
[FractionalTest]: ./exam/FractionalTest.java
[Fractional]: ./exam/Fractional.java
[IteratorAsDouble]: ./exam/IteratorAsDouble.java

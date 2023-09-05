## 반도체 P형, N형



## 트랜지스터
* 전류가 흐르면 1, 아니면 0
* Logical GAte(논리 회로)
    * AND, OR, NOT, XOR (기본 논리 연산)

## IC 산술 논리 장치
* ALU ( Arithmetic Logic Unit)

## CPU
* 수 십억개의 트랜지스터 - Mosfet 트랜지스터 들어 있음 2023 - 250억개
* 반도체와 전도체로 구성

## 주 기억장치와 보조 기억 장치
* 프로그램 Disk에 설치
* 메모리에 운영체제 올라가는 과정 (부팅)
* 부팅하는 시작점 (부트스트랩) - java (main함수)
* 디스크 - 메모리 - CPU (Cache 메모리를 통해 속도를 맞춤)
    * Cashe는 3계층으로 L1, L2, L3 숫자가 높을수록 용량이 높고, 속도가 낮음

## Register
* 여러 종류의 레지스터가 각각의 역할을 수행

## CPU 동작
* Fetch -> Decode -> Execute -> Store

## 오후 수업
* 자바의 형 변환 -> Type casting 
* 정수형
    * byte
    * shot
    * integer
    * long
    * char
        * double + int => double 큰 타입으로 변환
            * double + int = int 일때는 double를 (int) 형 변환
        * byte + byte, byte + short => int로 변환한 후 byte로 다시 계산

## 객체지향 언어의 4대 원칙
* 캡슐화 - Encapsulation
* 상속 - Inheritance
* 디형성 - polymorphism
* 추상화 - abstraction

## 객체 지향 설계 (SOLID)
* SRP - 단일 책임 원칙
* OCP - 개방 폐쇄의 원칙
* LSP - 리스코프 치환 원칙
* ISP - 인터페이스 분리 원칙
* DIP - 의존관계 역전 원칙

## 스택 - 활성화 레코드
* 지역 변수
* 반환 주소
* 값 파라미터
* 반환 값

## 자바가 순수객체지향 언어가 아닌 이유
* 원시타입 (Primitive Type) 원시타입
    * int long bool float char short double byte
* static 키워드
    * 객체 생성 없이 메소드의 사용이 가능
* Wrapper 클래스
    * 객체의 연산은 객체의 메소드를 통해서만 이루어져야 함
    * ex) Integer class 는 연산할때 내부에서 int로 연산을 하기 때문에


## 객체의 3요소
* Identifier
* Statement
* behavior


## 메서드
```java
Sample sample = new Sample();
sample.compare // instance 메서드
static compare() // class 메서드
```

## 접근자
* private < default < protected < public

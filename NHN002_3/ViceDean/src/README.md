# 부학장님 수업
### 복습
* 함수와 메서드의 차이
* 메서드는 객체에 종속하며 객체에 의해 실행
* 함수는 자유롭게 실행
* VsCode 상위폴더 하나만 존재 하도록 하고 실행

### 자바 기초 수업
* 자바는 실행 파일이 아님
* 자바는 byte Code(class) 생성
* 이 Byte Code를 실행시키는 것은 JVM
* public static void main(String[] args){} 필요 => 어플리케이션 시작점 - 어플리케이션 엔트리 포인트

#### JVM - Java Virtual Machine
* 바이트 코드를 실행할 수 있는 주체
* 인터프리터나 JIT 컴파일 방식으로 다른 컴퓨터에서 바이트코드를 실행할 수 있도록 구현
* 플랫폼에 독립적이며 모든 java 가상 머신은 그 규격에 정의된 대로 java 바이트 코드를 실행
* 표준 Java API 까지 동일한 동작으로 구현한 상태에서는 이론적으로 CPU나 운영체제의 종류에 상관없이 동일하게 동작할 것을 보장함
* Garbage Collector - 메모리 관리
* javap -v => 자바 가상 머신이 실행하는 코드
###### JVM 언어
* Clojure - 함수형 언어 Java 플랫폼에서 동작하는 LISP의 방언
* Groovy - Java에 Python, Ruby, SmallTalk등의 특징을 버무린 동적 타입 언어
* Jruby - Ruby Java로 구현
* Jython - Python을 Java로 구현
* Kotlin - JetBrains에서 개발한 JVM언어로, 안드로이드의 공식 언어
* Rhino - 모질라 재단이 만든 JVM에서 동작하는 JavaScript엔진
* Scala - 객체지향 언어의 특징과 함수형 언어의 특징을 함께 가지는 다중 패러다임 프로그래밍 언어


#### JRE - Java Runtime Environment 자바 실행 환경
* Java 가상머신, Java 클래스 라이브러리, Java  명령 및 기타 인프라를 포함한 컴파일된 Java 프로그램을 실행하는데 패키지
* Java 실행 환경이며, 기본적으로 Java 관련 파일이 있는 패키지

#### JDK - Java Development Kit 자바 개발 환경
* JRE와 개발 도구들을 포함하는 패키지
* 프로그램을 생성하고 컴파일 할 수 있음

##### JDK JRE 구분표
![스크린샷 2023-08-29 오후 3 41 30](https://github.com/P-C-Space/NHNEdu/assets/39722575/96f3b951-2005-4da5-b537-394e836121f6)


#### 식(expression)
* 값을 만들어내는 코드 단위 
* 하나의 값을 반환하는 것은 식
* 10, "Hi", true, 1 + 4, 10 < 100, "Hello" + "World"

#### 문(Statement)
* 무언가를 수행하는 코드 단위, 하지만 값을 만들지는 않는다.
* 함수의 인자나 피연산자 등과 같이 값이 들어가야하는 곳에 사용할 수 없다.
* 분기문(if, switch), 반복문(for, while), 변수 선언, 함수 선언
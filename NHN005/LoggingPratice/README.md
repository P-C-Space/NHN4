# Java Logging
## Logging
* 시스템 동작 시, 시스템의 상태와 작동 정보를 시간 경과에 따라 기록하는 것
* java에서의 Logging방법은 System.out.println, log4j, logback등

### System.out.println()
* 표준 출력 작업을 수행하는 메서드를 제공
* System.out로 로그를 남기면 안됨
    * 에러 발생 시 추적할 수 있는 최소한의 정보가 남지 않음
    * 로그 출력 레벨을 사용할 수 없음
    * 성능 저하 발생

## LogBack
* slf4j(Simle Logging Facade for Java)구현체
* 다양한 Logging framework 중 하나 log4j 향상 된 기능
* 로그 레벨
  * error > warn > info > debug > trace
  * error : 요청 처리 중 문제가 발생
  * warn : 프로그램 실행 문제 없지만, 향후 문제를 일으킬 수도 있음
  * info : 정보성 메세지
  * debug : 개발 시 디버그 용도
  * trace : 좀 더 상세한 이벤트 나타낼 때 사용


### Java Standard Loggin
* java.util.loggin.Logger
  * java에 내장되어 있는 로깅용 유틸 클래스
  * java.util.loggin 패키지 속해 있음
  * 로그 레벨 지원
    * SEVERE > WARNING > INFO > CONFIG > FINE > FINER > FINERST
    * 로깅을 끄는 OFF, 모든 로깅을 찍는 ALL
  * 장점
    * 외부 라이브러리 사용 안함
  * 단점
    * 다른 라이브러리와 비교 했을 떄, 속도가 느림
    * 타 라이브러리에 비해 기능 부족
    * 커스텀 레벨을 만들 떄 메모리 누수가 일어남



### dependencies 추가
~~~
<dependencies>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>2.0.7</version>
    </dependency>
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
        <version>1.4.8</version>
    </dependency>
</dependencies>
~~~

### resources/logback.xml 생성 후 걸정 작성
~~~
<configuration>
    <!-- 파일로 출력 -->
    <appender name="FILE" class="ch.qos.logback.core.FileAppender">
        <file>myApp.log</file>
        <encoder>
            <pattern>%date [%thread] %level %logger{10} [%file:%line] - %msg%n</pattern>
        </encoder>
    </appender>

    <!-- 표준 출력 -->
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>

    <!-- debug 레벨 설정 -->
    <root level="debug">
        <appender-ref ref="FILE"/>
        <appender-ref ref="STDOUT"/>
    </root>
</configuration>
~~~
package practice.GeometryTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import practice.Geometry.CubeSurfaceArea;

public class cubeSurfaceAreaTest {

    // class 생성자 테스트 시작
    // =====================================================================================================

    // 정사각형 생성자 테스트
    @Test
    @DisplayName("cubeSurfaceAreaConstructorTest Square")
    public void cubeSurfaceAreaConstructorTestX1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CubeSurfaceArea(0));
    }

    // 직사각형 생성자 테스트 1
    @Test
    @DisplayName("cubeSurfaceAreaConstructorTest Rectangle1")
    public void cubeSurfaceAreaConstructorRectangle1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CubeSurfaceArea(1, 0));
    }

    // 직사각형 생성자 테스트 2
    @Test
    @DisplayName("cubeSurfaceAreaConstructorTest Rectangle2")
    public void cubeSurfaceAreaConstructorTestRectangle2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CubeSurfaceArea(0, 1));
    }

    // 직육면체 생성자 테스트 1
    @Test
    @DisplayName("cubeSurfaceAreaConstructorTest Box1")
    public void cubeSurfaceAreaConstructorTestBox1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CubeSurfaceArea(0, 1, 1));
    }

    // 직육면체 생성자 테스트 2
    @Test
    @DisplayName("cubeSurfaceAreaConstructorTest Box2")
    public void cubeSurfaceAreaConstructorTestBox2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CubeSurfaceArea(1, 0, 1));
    }

    // 직육면체 생성자 테스트 3
    @Test
    @DisplayName("cubeSurfaceAreaConstructorTest Box3")
    public void cubeSurfaceAreaConstructorTestBox3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CubeSurfaceArea(1, 1, 0));
    }

    // 크기 초과 테스트 직육면체
    @Test
    @DisplayName("boxSurfaceOutofRangeTest")
    public void boxSurfaceTestOutofRange() {
        // 직육면체 공식 2(xy + xz + yz)
        // 2, 5, 8 -> 10 + 16 + 40 = 66 * 2 = > 132
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CubeSurfaceArea(Double.MAX_VALUE, 1, 1));

    }

    // 크기 초과 테스트 정사각형
    @Test
    @DisplayName("squareSurfaceOutofRangeTest")
    public void squareSurfaceTestOutofRange() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CubeSurfaceArea(Double.MAX_VALUE));

    }

    // 크기 초과 테스트 직사각형
    @Test
    @DisplayName("rectangleSurfaceOutofRangeTest")
    public void rectangleSurfaceTestOutofRange() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CubeSurfaceArea(Double.MAX_VALUE, 2));
    }

    // class 생성자 테스트 종료
    // =====================================================================================================

    // 메서드 매개변수 값 테스트 시작
    // =====================================================================================================

    // 직육면체 매개변수값 테스트 1
    @Test
    @DisplayName("boxSurfaceMethodTest1")
    public void boxSurfaceMethodTest1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CubeSurfaceArea.boxSurface(1, 1, 0));
    }

    // 직육면체 매개변수값 테스트 2
    @Test
    @DisplayName("boxSurfaceMethodTest2")
    public void boxSurfaceMethodTest2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CubeSurfaceArea.boxSurface(1, 0, 1));
    }

    // 직육면체 매개변수값 테스트 3
    @Test
    @DisplayName("boxSurfaceMethodTest3")
    public void boxSurfaceMethodTest3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CubeSurfaceArea.boxSurface(0, 1, 1));
    }

    // 직사각형 매개변수값 테스트 1
    @Test
    @DisplayName("rectangleSurfaceMethodTest1")
    public void rectangleSurfaceMethodTest1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CubeSurfaceArea.rectangleSurface(0, 1));
    }

    // 직사각형 매개변수값 테스트 2
    @Test
    @DisplayName("rectangleSurfaceMethodTest2")
    public void rectangleSurfaceMethodTest2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CubeSurfaceArea.rectangleSurface(1, 0));
    }

    @Test
    @DisplayName("squareSurfaceMethodTest")
    public void squareSurfaceMethodTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> CubeSurfaceArea.squareSurface(0));
    }
    // 메서드 매개변수 값 테스트 종료
    // =====================================================================================================

    // 클래스 멤버 변수 활용 면적 테스트 시작
    // =====================================================================================================

    // 직육면체 넓이 테스트
    @Test
    @DisplayName("boxSurfaceTest")
    public void boxSurfaceTest() {
        // 직육면체 공식 2(xy + xz + yz)
        // 2, 5, 8 -> 10 + 16 + 40 = 66 * 2 = > 132
        CubeSurfaceArea cubeSurfaceArea = new CubeSurfaceArea(2, 5, 8);
        Assertions.assertEquals(132, cubeSurfaceArea.getSurface());
    }

    // 정사각형 넓이 테스트
    @Test
    @DisplayName("squareSurfaceTest")
    public void squareSurfaceTest() {
        CubeSurfaceArea cubeSurfaceArea = new CubeSurfaceArea(5);
        Assertions.assertEquals(25, cubeSurfaceArea.getSurface());
    }

    // 직사각형 넓이 테스트
    @Test
    @DisplayName("rectangleSurfaceTest")
    public void rectangleSurfaceTest() {
        CubeSurfaceArea cubeSurfaceArea = new CubeSurfaceArea(2, 5);
        Assertions.assertEquals(10, cubeSurfaceArea.getSurface());
    }

    // 클래스 멤버 변수 활용 면적 테스트 종료
    // =====================================================================================================

    // 스태틱 메서드 면적 테스트 시작
    // =====================================================================================================

    // 직사각형 넓이 테스트2
    @Test
    @DisplayName("rectangleSurfaceTest2")
    public void rectangleSurfaceTest2() {
        Assertions.assertEquals(25, CubeSurfaceArea.squareSurface(5));
    }

    // 직육면체 넓이 테스트
    @Test
    @DisplayName("boxSurfaceTest2")
    public void boxSurfaceTest2() {
        // 직육면체 공식 2(xy + xz + yz)
        // 2, 5, 8 -> 10 + 16 + 40 = 66 * 2 = > 132
        Assertions.assertEquals(132, CubeSurfaceArea.boxSurface(2, 5, 8));
    }

    // 정사각형 넓이 테스트
    @Test
    @DisplayName("squareSurfaceTest2")
    public void squareSurfaceTest2() {
        Assertions.assertEquals(10, CubeSurfaceArea.rectangleSurface(2, 5));
    }

    // 스태틱 메서드 면적 테스트 시작
    // =====================================================================================================

}

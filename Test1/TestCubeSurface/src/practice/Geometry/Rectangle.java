package practice.Geometry;

public class Rectangle extends Cube {

    public Rectangle(double x, double y) {
        super(x, y, 0);
        if(x < 1 || y < 1){
            throw new IllegalArgumentException("x or y가 1보다 작습니다.");
        }
    }
    
}

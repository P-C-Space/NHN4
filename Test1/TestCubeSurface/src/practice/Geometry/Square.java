package practice.Geometry;

public class Square extends Cube {

    public Square(double x) {
        super(x, 0,0);
        if(x < 1){
            throw new IllegalArgumentException("x가 1보다 작습니다.");
        }
    }
    
}

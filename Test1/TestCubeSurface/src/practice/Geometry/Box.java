package practice.Geometry;

public class Box extends Cube {

    public Box(double x, double y, double z) {
        super(x, y, z);

        if((x < 1 || y < 1) || z < 1){
            throw new IllegalArgumentException("x or y or z가 1보다 작습니다.");
        }
    }
    
}

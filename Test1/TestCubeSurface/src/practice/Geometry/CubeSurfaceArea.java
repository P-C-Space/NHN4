package practice.Geometry;

public class CubeSurfaceArea {
    private double x;
    private double y;
    private double z;
    private double surface = 0;

    public CubeSurfaceArea(double x) {
        this.x = x;
        this.y = 1;
        this.z = 1;
        precondition();
        postcondition(x);
        this.surface = x * x;
    }

    public CubeSurfaceArea(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 1;
        precondition();
        postcondition(x,y);
        this.surface = x * y;
    }

    public CubeSurfaceArea(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        precondition();
        postcondition(x,y,z);
        this.surface = 2 * ((x * y) + (x * z) + (y * z));
    }

    public double getSurface() {
        return surface;
    }

    private void precondition() {
        if (x < 1) {
            throw new IllegalArgumentException("x 값이 1보다 작습니다.");
        } else if (y < 1) {
            throw new IllegalArgumentException("y 값이 1보다 작습니다.");
        } else if (z < 1) {
            throw new IllegalArgumentException("z 값이 1보다 작습니다.");
        }
    }

    private void postcondition(double... numbers) {
        switch (numbers.length) {
            case 1:
                if (Double.MAX_VALUE < x * x) {
                    throw new IllegalArgumentException("double형의 범위 초과");
                }
                break;
            case 2:
                if (Double.MAX_VALUE < x * y) {
                    throw new IllegalArgumentException("double형의 범위 초과");
                }
                break;
            case 3:
                if (Double.MAX_VALUE < 2 * ((x * y) + (x * z) + (y * z))) {
                    throw new IllegalArgumentException("double형의 범위 초과");
                }
                break;
            default:
                break;
        }
    }

    public static int boxSurface(int xp, int yp, int zp) {
        if (xp < 1 || (yp < 1 || zp < 1)) {
            throw new IllegalArgumentException("1보다 작은 값이 있습니다.");
        }
        return 2 * ((xp * yp) + (xp * zp) + (yp * zp));
    }

    public static int rectangleSurface(int xp, int yp) {
        if (xp < 1 || yp < 1) {
            throw new IllegalArgumentException("1보다 작은 값이 있습니다.");
        }
        return xp * yp;
    }

    public static int squareSurface(int xp) {
        if (xp < 1) {
            throw new IllegalArgumentException("1보다 작은 값이 있습니다.");
        }
        return xp * xp;
    }

}
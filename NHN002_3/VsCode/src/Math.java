public class Math {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int zero = 0;

        System.out.println(sum(a, b));
        System.out.println(sub(a, b));
        System.out.println(div(a, zero));
        if (b == 0)
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
    }
}

// parameter or return value shift + comman + space

// option 방향키 => 해당 줄 이동

// command shift L => 해당 단어 모두선택

// fn + f2 => 단어 바꾸기

package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역 변수
        final int data2 = 10;
        //data2 = 20; //컴파일 오류
        //
        method(10);

    }

    static void method(final int parameter) {
        //parameter = 20; //컴파일 오류
    }
}

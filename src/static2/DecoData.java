package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++; //인스턴스 변수 접근, staticCall()은 클래스 소속이라 instanceValue를 사용하려면 객체를 만들어야된다.
//        instanceMethod(); //인스턴스 메서드 접근
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public void instanceValue() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue= " + instanceValue);

    }

    private static void staticMethod() {
        System.out.println("staticValue= " + staticValue);
    }
}

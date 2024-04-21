package poly.ex6;

public class Chicken extends AbstarctAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("꼭꼭");
    }

    @Override
    public void fiy() {
        System.out.println("닭 날기");
    }
}

package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar(); //전기차
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar(); //가솔린차
        gasCar.move();
        gasCar.fillUp();
    }
}

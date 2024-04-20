package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw cow = new Caw();
        Duck duck = new Duck();

        sountAnimal(dog);
        sountAnimal(cat);
        sountAnimal(cow);
        sountAnimal(duck);
    }

    private static void sountAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

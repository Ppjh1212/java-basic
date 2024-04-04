package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data(); //x001
        dataA.value = 10;
        Data dataB = dataA; //x002 -> x001

        System.out.println("dataA = " + dataA);
        System.out.println("dataB = " + dataB);
        System.out.println(dataA.value);
        System.out.println(dataB.value);
        System.out.println();

        dataA.value = 20; //x001.value = 20
        System.out.println(dataA.value);
        System.out.println(dataB.value);
        System.out.println();

        dataB.value = 30; //x001.value = 30
        System.out.println(dataA.value);
        System.out.println(dataB.value);

    }
}

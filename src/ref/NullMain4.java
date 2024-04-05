package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); //x001
        bigData.data = new Data(); //x001.data = x002 data의 참조값을 만들어줌
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value); //x001.null.value null에 참조할 곳이 없다
    }
}

package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data(); //패키지가 같을 때
        pack.a.User user = new pack.a.User(); //패키지가 다를 때
    }
}

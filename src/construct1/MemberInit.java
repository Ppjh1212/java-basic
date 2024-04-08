package construct1;

public class MemberInit {

    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name; //this.name은 자기 자신의 인스턴스를 가리킨다
        this.age = age;
        this.grade = grade;
    }
}

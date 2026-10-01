
class Person {
    private String name;
    private int age;

    // 멤버 변수 초기화 하기 위한 생성자
    // 아무런 값을 받지 않는 생성자
    public Person(){
        this("김길동", 20);
    }
    // 나이, 이름 순으로 값
    public Person(int age, String name) {
        // this(); // 현재 클래스 => Person(); -> 현재 클래스의 생성자 호출
        this(name, age); //
    }
    // 이름 나이 순으로 값
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 생성자 내에 중복 코드 제거

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // public 메서드 / 이름 입력을 위한 메서드 / public 매우 중요
    public void setName( String n){
        name = n + "님"; // 수정사항이 있을 경우 메서드만 수정하면 됨
    }

    public String getName(){
        return name;
    }
}

public class OOPEx1 {
    public static void main(String[] args) {
        // 한 사람의 정보 저장 -> Person 클래스를 객체화 -> 변수 수정
//        Person p1 = new Person();
//        p1.name = "홍길동";
//        p1.age = 20;
//
//        Person p2 = new Person();
//        p2.name = "김철수";
//        p2.age = 25;
//
//        Person p3 = new Person();
//        p3.name = "이영희";
//        p3.age = 30;
        // 위의 코드는 객체 지향적 시점에서 봤을 경우 좋지 않음 -> 객체 지향적 프로그램이 아님
        // 유지보수가 어려움

        // 객체 지향 프로그램으로 해결
        // 클래스의 변수를 private으로 변경
        Person p1 = new Person();
        p1.setName("홍길동");
        p1.setAge(20);

        Person p2 = new Person();
        p2.setName("김철수");
        p1.setAge(25);

        Person p3 = new Person();
        p3.setName("이영희");
        p3.setAge(30);
        // p1.name 사용 불가 -> private이기 때문
        // getName 메서드를 만들고 값 리턴
        System.out.println(p1.getName());
    }
}

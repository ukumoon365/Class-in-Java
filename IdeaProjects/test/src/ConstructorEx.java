// 생성자 constructor
// 클래스가 객체화 될 때 단 한번 호출
// 메소드 문법과 비슷함 but 리턴형이 없고 / 이름은 클래스 명과 같아야함
// 생성자를 쓰는 이유?
// 멤버 변수 초기화 용도 매우 중요

class MyCon{
    int age;
    String name;
    // 생성자
    // 생성자는 생략이 가능
    public MyCon( int a, String n){
//        System.out.println("생성자 호출");
        age = a; // 이거 할라고 생성자 씀 // 파라미터 값을 받아서 변수 초기화
        name = n;
    }
    // 성성자 오버로딩
    public MyCon(){
        age = 20;
        name = "홍길동";
    }

// 변수가 많을 때
// 사용자를 위해 입력 순서를 바꿔도 입력 되도록 하는 방법이 있음 / 개발자를 위한 것이 아님
    public MyCon( String n, int a){
        age = a;
        name = n;
}
}
public class ConstructorEx {

    public static void main(String[] args){
        // new MyCon( 20 );
        MyCon m1 = new MyCon(10, "철수");
        System.out.println(m1.name);

        MyCon m2 = new MyCon("영희", 30);
        System.out.println(m2.name);
    }
}

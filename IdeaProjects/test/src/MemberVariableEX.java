// 멤버 변수, 지역 변수 / 변수 선언이 어디에서 이루어져있는지에 따라 구별
// 멤버 변수: 클래스 전체에서 사용 가능한 변수
// 지역변수: 특정 지역(영역)안에서만 사용 가능한 변수
class MyMember {
    // 멤벼 변수
    int y; // 멤버 변수 선언 / 0으로 자동 초기화
    static int j;
}


public class MemberVariableEX {
    int k = 30;
    public static void main(String[] args){
        // 자바에서 main 메소드는 프로그램 실행시 1번만 실행됨 / 재활용, 반복 코드 제거의 용도가 아님
        // static 변수 or 메소드가 스스로 메모리에 올라감
        MemberVariableEX mx = new MemberVariableEX();
        System.out.println( mx.k); //

        // int y; // 변수 선언
        // y = 10; // 변수 초기화
        int x = 10; // 지약 변수 / main 메소드 안에서 선언한 변수 -> main 메소드 내에서만 사용가능한 지역 변수
        System.out.println(x);


        // MyMember class의 y 변수 출력
        // System.out.println(y); // 오류 -> y는 MyMember class에서만 사용 가능한 멤버 변수
        // 해당 클래스를 사용하려면 메모리에 올려야함 매우 중요
        MyMember m = new MyMember();
        System.out.println(m.y);

        // 지역 변수는 자동 초기화 되지 않음  int a; -> Error
        // 멤버 변수는 자동 초기화 int a; -> 0

        // System.out.println(j); -> Error
        // static으로 메모리에 올라간 상태임 하지만 어떤 클래스에 j인지 모름
        System.out.println(MyMember. j);
        // 변수 사용시 어떤 클래스에 있는 건지 클래스 명시 필요

    }
}

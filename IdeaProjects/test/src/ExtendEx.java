// 자바 상속(extend)
// 자바에서 상속의 대상은 기본적으로 클래스
// 특정 클래스 상속을 위해 extends 사용

class MyA {
    int x = 10;
    // 생성자 없음 -> 생성자 생략 가능 default constructor ( 파라미터를 받지 않는 생성자)
    // public MyA(int x){} // 파라미터 x를 받고 있음
    // -> Default constructor가 생성 되지 않음 -> 생략 불가능  / extends 시에도 오류

    // 3개의 생성자
    public MyA() {}
    public MyA(int x){
        this.x = x;
    }
    public void printX(){
        System.out.println("x = " + x);
    }
}

class MyB extends MyA {
    public MyB(int x){
        super(x); // 이걸로 인해 생성자도 상속 불가능한 문제를 상위 클래스 생성자 호출로 해결
    }
}

public class ExtendEx {
    public static void  main(String[] args) {
        // MyA 클래스 객체화
        MyA a = new MyA(5);
        // 생성자가 하나라도 있으면 ()에 빨간 줄 -> 오류
        System.out.println(a.x);
        a.printX();

        // MyA의 멤버 변수가 상속됨을 확인
        MyB b = new MyB(15);
        System.out.println(b.x);
        b.printX();
    }



    }


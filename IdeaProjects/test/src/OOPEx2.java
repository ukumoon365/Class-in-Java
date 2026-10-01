class A {
    public A() {
        System.out.println("A 클래스 객체화"); // 이 문구가 실행된다는 것은 A 클래스가 객체화 됨을 의미 (생성자는 클래스 객체화시 1회 실행)
    }
}

// A 클래스를 상속받은 B
class B extends A {
    public B () { // default constructor 생략
        super(); // super(); 생략
    }
//    public B() {
//        System.out.println("B 클래스 객체화");
//    }
}

public class OOPEx2 {
    public static void main (String[] args){
        new B(); // B 클래스 안에 A 클래스 객체화됨 상속 받았기 때문
//        A a = new A();
//        B b = new B();
//        A c = new B(); // 권장된 코드

        // B d = new A(); 잘못된 코드
        // A를 상속 받은
    }
}

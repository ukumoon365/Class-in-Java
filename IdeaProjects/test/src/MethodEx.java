// 자바에서는 함수(function)를 메소드라고 칭함

class MyMethod {
    // 1. 메소드 정의 기본 문법
    // 메소드를 클래스 없이 만들 수 없다 / 클래스 안에 메소드 생성
    // 1. 접근제한자 2. 리턴형 3. 메소드 이름 4.(파라미터) 5.{ 코드 }
    // 접근 제한자: public, protected, default, private
    // 접근 제한자란? / 현 메소드를 누가 쓸 수 있는 지 / 접근 가능한지 규정 / 메소드 뿐만 아니라 변수에도 사용가능
        // 지역변수 시에는 사용안하지만 클래스 내에서 접근 제한자 규정 가능
        // default는 생략 (제일 기본적)
    // 리턴형: 기본자료형 / 객체 (기본 자료형 외 나머지)
    //        void: 리턴값이 존재하지 않을 경우 사용
    // 리턴형란? 메소드를 호출하고 나서 나온 결과값을 어떤 값으로 리턴할지
    // 파라미터: 메소드를 호출할 때 어떤 값을 넘기는 가

    public int add(int x, int y) {
        int result = x + y;
        // 메소드의 리턴 타입이 지정되어 있을 경우 / return 문법을 통해 값을 넘긴다
        return result;
    }

    public int minus(int x, int y){
        int result = x - y;
        return  result;
    }

    public double addfloat(double x, double y) {
        double result = x + y;
        return result;
    }


}
public class MethodEx {
    public static void main(String[] args){
        // 2. 메소드 호출
        // 메소드를 사용하기 위해선 객체화를 해야한다
        // 자바에서는 메소드만 메모리에 올릴 수 없음 클래스 전체를 메모리에 올려야함
        // add()가 있는 클래스를 메모리에 올림
        // 메소드를 사용할 때는 어떤 클래스의 메소드인지 저장해야함
        // MyMethod가 들어 있는 m / 이거 공부좀 해야될듯
        // m에는 MyMethod의 주소값이 들어감 !! 중요
        MyMethod m = new MyMethod();

        // "."은 ~ 안에 라는 뜻
        // m.add m 안에 add 메소드
        // add(안에는 값만 /  x:10 이거 아님 주의)
        int addResult = m.add(20, 10);

        int minusResult = m.minus(20, 10);

        double floatResult = m.addfloat(0.1, 0.2);
        // 실수는 완벽히 2진수로 표현 불가능 -> 0.3이 안나옴


        System.out.println(addResult);
        System.out.println(minusResult);
        System.out.println(floatResult);



    }
}

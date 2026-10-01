public class BasicTypeEx {

    public static void main(String[] args) {

        // 자바의 기본 자료형

        // 정수형
        // byte, short, int, long (범위가 작은 거부터 큰순)
        // byte(1 byte) short(2 byte) int(4 byte) long(8 byte)
        // 변수 선언시 변수명 앞에 자료형 지정 / 정적 자료형 선언
        byte b = 10; // 1byte의 범위 -128 ~ +127 / 범위를 넘어서면 빨간색 오류
        // byte result = b + 1;  or short result = b + 1; // 오류
        // 오류 -> 자바에서 컴파일 할 때 b가 무슨 값을 가지는 지 알 수 없음 -> 최악의 상황 가정 범위를 넘을 수 있음
        // 산술 연산자 사용시 int 값 취급 -> 산술 연산자 사용시에는 int 선언
        // 자바에서 정수타입 산술 연산를하면 int 타입으로 간주됨 / 정수형일 경우 int로 사용하면됨 byte를 사용해도 산술 연산시 int로 바뀜
        int result = b + 1;
        // 산술 하다가 int 범위를 넘어서면 long 타입으로 변경하면 됨
        // 그렇기 때문에 정수형의 기본 값은 int 설정

        // 실수형
        // 두가지로 나뉨 float, double
        // float f = 0.1; // 오류
        // 실수형은 기본값이 명시적으로 지정 되어 있음 double임 default = double
        double d = 0.1;
        // float는 double의 범위가 반 정도
        float f = 0.1f;
        // float Type은 값 뒤에 f or F로 float이라는 명시가 필요

        // 문자형
        // 문자 하나를 저장하기 위한 기본 자료형
        // 문자 하나를 사용할 때는 '' 2문자 이상은 ""
        // 문자형은 char 하나만 존재
        char c = 'A';
        System.out.println( c ); // 출력 A
        char c2 = 65;
        System.out.println(c2); // 출력 A
        // char Type은 정수는 아스키코드로 이해함 / 아스키 코드로 된 값은 1개만 66, 65 안됨
        // (아스키 코드는 8bit 1byte / 256개 실제는 7bit만 들어있음) / 한글(각 나라의 언어) 그래서 표준을 잡아야함 검색해서 공부해보기 나중에 알려준대
        // 이름을 알파벳 순서로 나열 or 다음 알파벳 순서
        char c3 = '\u0041'; // 유니코드
        char c4 = 65 + 1;
        System.out.println(c3); // 출력 B
        // 출력시 두개 변수 값 출력하고 싶으면 +로 연결 , 아님

        // boolean형
        boolean boo = true;
        // true, false만 저장 가능 / 전부 소문자

    }
}

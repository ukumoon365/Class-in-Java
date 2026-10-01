public class MyTest {

    public static void main(String[] args){
        // 자바에서 = 의 의미 시험 문제 나옴
        int x =  10;
        int y = x;
        x = 100;
        // y의 값은? 10

        System.out.println("x == " + x);
        System.out.println("y == " + y);

        int[] a = {10, 20, 30};
        int[] b = a;
        a[0] = 100;
        // b의 값은? 100
        System.out.println("a[0] == " + a[0]);
        System.out.println("b[0] == " + b[0]);

        // Array의 변수는 참조변수 / 값이 아닌 주소값을 저장, a와 b는 이름은 다르지만 같은 Array의 주소값을 공유함 겉은 다르지만 속은 같음
        // shallow copy

        // =를 사용하면 1번 예제는 변수에 값 value가 들어감 (값 대입)
        // 2번 예제 주소값(번지) 레퍼런스가 넘어감 (주소값 대입)

        // 자바에서는 기본자료형만 빼고 모든 자료형은 주소값이 넘어간다 (매우 중요함)
        // 기본자료형은 값을 넘김 / 그 외 자료형은 주소값을 넘김


    }
}

public class ForEx {
    public static void main(String[] args) {

        // 반복문: 특정 작업을 반복 수행하기 위한 코드 / 연달아 이어오는 중복되는 코드 제거를 위해 사용

//        for (int i = 0; i < 10; i ++){
//            System.out.println(i);
//        }
//        double result = 0;
//        double x = 0.1;
//        for (int i = 0 ; i < 10 ; i++) {
//            result = result + x;
//        }
//        System.out.println(result); // 0.9999999999999999
        // 어째서 1이 아닌가
        // 10진수 0.1 -> 2진수 끝나지 않는 무한소수 / 오류가 발생할 수 밖에 없음
        // 사칙 연산시 보정을 해주지 않는 언어는 클래스 같은걸로 개발자가 보정해야함
        // 10을 곱하고 나중에 10를 나눠줌
        // x = 0.1 * 10 / result / 10

        // 1~10까지 누적 덧셈 후 결과 값 출력
        int result = 1+2+3+4+5+6+7+8+9+10;
        System.out.println(result);

        // result를 반복문으로
        int forResult = 0;

        // 반복문의 변수 i를 사용한 반복문
        for (int i = 1; i <= 10; i ++) {
            forResult += i;
        }
        System.out.println(forResult);
    }
}

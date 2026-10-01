public class StringEx {
    public static void main(String[] args) {
        // 암묵적 객체 생성
        String str1 = "ABC"; // => new String("ABC");
        // 원칙적으로는 class String {}를 선언 후 생성자를 통해 객체화후 사용
        // String은 자바에서 암묵적으로 객체화를 지원
        String str2 = "EFG";


//        if (str1 == str2) {
//            System.out.println("같은 문자열"); // 문자열 리터럴이 같을 경우 객체를 공유 / new String("ABC")하고 명시하면 객체 공유 안함
//        } else {
//            System.out.println("다른 문자열");
//        } // 위 코드는 값을 비교하는 코드가 아닌 주소값을 비교하는 잘못된 코드

        // 값을 비교하기 위해선
        if (str1.equals(str2)) {
            System.out.println("같은 문자열");
        } else {
            System.out.println("다른 문자열");
        } // equals() 문법 사용

        // 불변
        String str3 = "ABC";
        str3 = str3 + "D";
        str3 = str3 + "e";
        // -> 결론적 메모리에는 "ABC", "ABCD", "ABCDe" 3개의 객체가 존재
    }
}

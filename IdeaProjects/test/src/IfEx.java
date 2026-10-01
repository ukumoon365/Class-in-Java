public class IfEx {
    public static void main(String[] args){
        // 제어문
        // 특정된 조건 제어 / 즉, 판정을 위해 사용되는 문법

        // 점수가 90점 이상인지 확인
       int score = 80;

        // if (조건식)
//        if (score >= 90)
//            //    들여쓰기 후 코드 작성;
//            System.out.print("90점 이상입니다");
//        else // 조건을 만족하지 않을 경우
//            //    들여쓰기 후 코드 작성;
//            System.out.println("90점 미만입니다");


        // 자바의 제어문 if 기본 문법
        // if (조건식) {
        //     조건을 만족할 경우 실행 구문
        // }else
        //      조건을 만족하지 못할 경우
        //}

        // 조건에 따라 실행해야 할때 두 라인 이상의 코드가 사용 될때 꼭 {}로 묶기 / 한 줄은 생략 가능
        // 상관없이 {}로 묶는 것을 권장

//        score = 80;
//        // 점수에 따라 학점 출력
//        if (score >= 90){
//            System.out.println("A");
//        } else if (score >= 80) { // score < 90 & score >= 80 / and 연산자는 &
//            System.out.println("B");
//        } else if ( score >= 70 ) {
//            System.out.println("C");
//        } else {
//            System.out.println("F");
//        }

//        int x = 10;
//        int y = 10;
//        System.out.println(x++); // 가독성이 낮은 코드
//        System.out.println(x);
//
//        System.out.println();
//
//        x = 10;
//        System.out.println(++x);

//        x += 10;
//        y -= 10;
//        System.out.println(x);
//        System.out.println(y);
        // x = +10은 x = 10가 같음 / +=은 다름

        int k = 10;
        int j = 20;

//        if (k == 10 & j == 20){
//            System.out.println("둘 다 만족");
//        }
//        if ( k == 10 | j != 20){
//            System.out.println("둘 중 하나만 만족");
//        }

        if ( k > 100 && (j += 10) > 20){
            System.out.println("&& 두개 사용");
        }
        System.out.println(j);

        if ( k > 100 & (j += 10) > 20){
        }
        System.out.println(j);



    }
}

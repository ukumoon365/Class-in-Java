public class GUGUDAN {
    public static void main(String[] args) {

        // 구구단 2단 출력
//        System.out.println("2 * 1 = 2");
//        System.out.println("2 * 2 = 4");
//        System.out.println("2 * 3 = 6");
//        System.out.println("2 * 4 = 8");
//        System.out.println("2 * 5 = 10");
//        System.out.println("2 * 6 = 12");
//        System.out.println("2 * 7 = 14");
//        System.out.println("2 * 8 = 16");
//        System.out.println("2 * 9 = 18");

//        for (int i = 1; i <= 9; i++) {
//            int result = 2 * i;
//            System.out.println("2 * " + i + " = " + result);
//        }
//        System.out.println("-----------------------------");
//        for (int i = 1; i <= 9; i++) {
//            int result = 3 * i;
//            System.out.println("3 * " + i + " = " + result);
//        }

        // 다중 반복문 (이중)
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println(dan + "단");
            System.out.println("-----------------------------");
            for (int i = 1; i <= 9; i++) {
                int result = dan * i;
                System.out.println(dan + " * " + i + " = " + result);
            }
            System.out.println("-----------------------------");
        }
    }
}
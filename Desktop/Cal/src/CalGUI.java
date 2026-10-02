import javax.swing.*;
import java.awt.*;


// CalGUI가 내부에 멤버 변수로 JFrame를 가지고 있는 has a 관계

// 계산기 화면 구현 클래스
public class CalGUI {
    // 선언은 클래스 내에서
    JFrame f; // 프레임
    JButton bInput; // 버튼
    JPanel p1, p2, p3, p4, p5, p6, p7 ;
    JButton b9,b8, b7, b6, b5, b4, b3, b2, b1, b0;
    JButton bClear, bDivision, bMultiply, bMinus, bPlus, bEqual;
    FlowLayout layout; // 배치 관리자
    JTextField jtf; // 한 줄 입력창

    public CalGUI() { // 파라미터 값이 없는 생성자
        // 생성자는 멤버변수 초기화 용도
        // 중요! 멤버 변수 초기화는 생성자 내에서 하기
        f = new JFrame();

        layout = new FlowLayout();
        p1 = new JPanel(new FlowLayout());
        p2 = new JPanel(new FlowLayout());
        p3 = new JPanel(new FlowLayout());
        p4 = new JPanel(new FlowLayout());
        p5 = new JPanel(new FlowLayout());
        p6 = new JPanel(new FlowLayout());
        p7 = new JPanel(new FlowLayout());

        jtf = new JTextField(10); // 파라미터는 글자 수
        p1.add(jtf);

        bInput = new JButton("입력");
        p1.add(bInput);

        bClear = new JButton("C");
        bClear.setBackground(Color.RED);
        p2.add(bClear);

        bDivision = new JButton("÷");
        p3.add(bDivision);

        b7 = new JButton("7");
        p4.add(b7);
        b8 = new JButton("8");
        p4.add(b8);
        b9 = new JButton("9");
        p4.add(b9);
        bMultiply = new JButton("×");
        p4.add(bMultiply);

        b4 = new JButton("4");
        p5.add(b4);
        b5 = new JButton("5");
        p5.add(b5);
        b6 = new JButton("6");
        p5.add(b6);
        bMinus = new JButton("-");
        p5.add(bMinus);


        b1 = new JButton("1");
        p6.add(b1);
        b2 = new JButton("2");
        p6.add(b2);
        b3 = new JButton("3");
        p6.add(b3);
        bPlus = new JButton("+");
        p6.add(bPlus);

        b0 = new JButton("0");
        p7.add(b0);
        bEqual = new JButton("=");
        p7.add(bEqual);





        f.add (p1);
        f.add (p2);
        f.add (p3);
        f.add (p4);
        f.add (p5);
        f.add (p6);
        f.add (p7);


        f.setLayout(layout);
        f.setSize(250, 450);//크기
        f.setLocation(1450, 500);//위치
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 강제 종료
        f.setVisible(true); // 프레임 출력 설정 true -> 출력 / false -> 출력 안함

    }
}
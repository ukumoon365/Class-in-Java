import javax.swing.*;
import java.awt.*;

// CalGUI2가 JFrame를 상속 받는 is a 관계
// CalGUI2 is JFrame


// JFrame 상속받는 CalGUI2 클래스
public class CalGUI2  extends JFrame {
//    JFrame f; // 프레임
    JButton b; // 버튼
    FlowLayout layout; // 배치 관리자
    JTextField jtf; // 한 줄 입력창

    public CalGUI2() { // 파라미터 값이 없는 생성자
        // 생성자는 멤버변수 초기화 용도
        // 중요! 멤버 변수 초기화는 생성자 내에서 하기
//        f = new JFrame();
        // f. 하지 않아도 됨 -> 현재 클래스에 JFrame 클래스가 상속 됐기 때문에, 멤버 변수, 메소드 상속됨
        // 하지만 어떤 클래스에서 쓰는지 모르기 때문에 this 사용으로 현재 클래스 임을 명시
        b = new JButton("상속된 프레임");
        layout = new FlowLayout();
        jtf = new JTextField(10); // 파라미터는 글자 수


        this.add(jtf);
        this.add(b);
        this.setLayout(layout);
        this.setSize(250, 450);//크기
        this.setLocation(1450, 500);//위치
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 강제 종료
        this.setVisible(true); // 프레임 출력 설정 true -> 출력 / false -> 출력 안함
    }
}
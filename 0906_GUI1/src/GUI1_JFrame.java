import javax.swing.*;

public class GUI1_JFrame {
    public static void main(String args[]){
        JFrame frame = new JFrame("창이름");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("아싸 어쩌다 금요일");
        JButton button = new JButton("오예!");

        frame.add(label);
        frame.add(button);

        frame.pack();   //구성 요소만큼 창 크기가 변화 한다.
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //닫기 버튼 누르면 끝
    }
}

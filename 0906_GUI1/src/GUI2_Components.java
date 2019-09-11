import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GUI2_Components {
    public static void main(String args[]){
        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();
        JLabel lb0 = new JLabel("JLabel");
        JButton bt0 = new JButton("JButton");
        JCheckBox ch0 = new JCheckBox("JCheckBox0");
        JCheckBox ch1 = new JCheckBox("JCheckBox1");
        JRadioButton rb0 = new JRadioButton("미성년자");
        JRadioButton rb1 = new JRadioButton("성인");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb0);
        bg.add(rb1);

        JTextField tf0 = new JTextField("JTextField");
        JTextArea ta0 = new JTextArea(2, 10);

        String[] food = new String[]{"치킨","피자","파스타"};
        JComboBox<String> cbox0 = new JComboBox<String>(food);
        cbox0.addItem("족발");
        cbox0.addItem("닭발");

        panel.add(lb0);
        panel.add(bt0);
        panel.add(ch0);
        panel.add(ch1);
        panel.add(rb0);
        panel.add(rb1);
        panel.add(tf0);
        panel.add(ta0);
        panel.add(cbox0);

        frame.add(panel);


        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

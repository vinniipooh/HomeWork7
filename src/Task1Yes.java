import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Александр on 14.04.2017.
 */
public class Task1Yes extends JFrame {
    private static JFrame task1yes = new JFrame("Task 1");
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton sumbitButton;
    private JButton clearButton;
    private JButton backButton;
    private JLabel LabelR;
    private JPanel Panel;
    private JLabel Label1R;
    private String clearFirstLabel = "R = ";
    private String clearSecondLabel = "1/R = ";

    public Task1Yes() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                task1yes.setVisible(false);
                MainWindow.runMainWindow();

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(null);
                textField2.setText(null);
                textField3.setText(null);
                textField4.setText(null);
                textField5.setText(null);
                textField6.setText(null);
                LabelR.setText(clearFirstLabel);
                Label1R.setText(clearSecondLabel);
            }
        });
        sumbitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a1 = Integer.parseInt(textField1.getText());
                    int a2 = Integer.parseInt(textField2.getText());
                    int a3 = Integer.parseInt(textField3.getText());
                    int b1 = Integer.parseInt(textField4.getText());
                    int b2 = Integer.parseInt(textField5.getText());
                    int b3 = Integer.parseInt(textField6.getText());

                    MethodTask1 t1 = new MethodTask1(a1, b1, a2, b2, a3, b3);

                    LabelR.setText(clearFirstLabel + t1.multFraction(t1.plusFraction(t1.getFraction1(), t1.getFraction2()), t1.plusFraction(t1.getFraction1(), t1.getFraction3())));
                    Label1R.setText(clearSecondLabel + t1.reverseFraction(t1.multFraction(t1.plusFraction(t1.getFraction1(), t1.getFraction2()), t1.plusFraction(t1.getFraction1(), t1.getFraction3()))));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Please enter integer number");
                    textField1.setText(null);
                    textField2.setText(null);
                    textField3.setText(null);
                    textField4.setText(null);
                    textField5.setText(null);
                    textField6.setText(null);
                }
            }
        });
    }

    public static void RunTask1Yes() {
        task1yes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        task1yes.setLocationRelativeTo(null);
        task1yes.setVisible(true);
        task1yes.pack();
        task1yes.setSize(600, 300);
        task1yes.setContentPane(new Task1Yes().mainPanel);
        task1yes.setResizable(false);
    }
}

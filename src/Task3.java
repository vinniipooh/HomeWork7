import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Александр on 15.04.2017.
 */
public class Task3 extends JFrame {
    private static JFrame task3 = new JFrame("Task 3");
    private JList list1;
    private JRadioButton radioButton1;
    private JCheckBox checkBox1;
    private JTextPane textPane1;
    private JPasswordField passwordField1;
    private JPanel mainPanel;
    private JTabbedPane Pane;
    private JPanel pane3Points;
    private JPanel pane4Points;
    private JPanel pane5Points;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JButton submitButton;
    private JButton clearButton;
    private JButton backButton;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField22;
    private JTextField textField23;
    private JTextField textField24;
    private JTextField textField19;
    private JTextField textField20;
    private JTextField textField21;
    private JTextField textField25;
    private JTextField textField26;
    private JTextField textField27;
    private JTextField textField28;
    private JTextField textField29;
    private JTextField textField30;
    private JTextField textField31;
    private JTextField textField32;
    private JTextField textField33;
    private JTextField textField34;
    private JTextField textField35;
    private JTextField textField36;
    private JLabel ais3;
    private JLabel bis3;
    private JLabel cis3;
    private JLabel P3;
    private JLabel ais4;
    private JLabel bis4;
    private JLabel cis4;
    private JLabel dis4;
    private JLabel P4;
    private JLabel ais5;
    private JLabel bis5;
    private JLabel cis5;
    private JLabel dis5;
    private JLabel eis5;
    private JLabel P5;

    public Task3() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Pane.getSelectedIndex() == 0) {

                        Task3Point A = new Task3Point(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()), textField3.getText());
                        Task3Point B = new Task3Point(Integer.parseInt(textField4.getText()), Integer.parseInt(textField5.getText()), textField6.getText());
                        Task3Point C = new Task3Point(Integer.parseInt(textField4.getText()), Integer.parseInt(textField5.getText()), textField6.getText());

                        Task3Figure Point3 = new Task3Figure(A, B, C);

                        ais3.setText(A.dot + B.dot + " = " + Point3.a);
                        bis3.setText(B.dot + C.dot + " = " + Point3.b);
                        cis3.setText(C.dot + A.dot + " = " + Point3.c);

                        P3.setText(Task3Figure.PerimeterCalculator(Point3));
                    }
                    if (Pane.getSelectedIndex() == 1) {

                        Task3Point A = new Task3Point(Integer.parseInt(textField10.getText()), Integer.parseInt(textField12.getText()), textField13.getText());
                        Task3Point B = new Task3Point(Integer.parseInt(textField14.getText()), Integer.parseInt(textField11.getText()), textField15.getText());
                        Task3Point C = new Task3Point(Integer.parseInt(textField16.getText()), Integer.parseInt(textField17.getText()), textField18.getText());
                        Task3Point D = new Task3Point(Integer.parseInt(textField22.getText()), Integer.parseInt(textField23.getText()), textField24.getText());

                        Task3Figure Point3 = new Task3Figure(A, B, C, D);

                        ais4.setText(A.dot + B.dot + " = " + Point3.a);
                        bis4.setText(B.dot + C.dot + " = " + Point3.b);
                        cis4.setText(C.dot + D.dot + " = " + Point3.c);
                        dis4.setText(D.dot + A.dot + " = " + Point3.d);

                        P4.setText(Task3Figure.PerimeterCalculator(Point3));
                    }

                    if (Pane.getSelectedIndex() == 2) {
                        Task3Point A = new Task3Point(Integer.parseInt(textField19.getText()), Integer.parseInt(textField27.getText()), textField32.getText());
                        Task3Point B = new Task3Point(Integer.parseInt(textField20.getText()), Integer.parseInt(textField28.getText()), textField33.getText());
                        Task3Point C = new Task3Point(Integer.parseInt(textField21.getText()), Integer.parseInt(textField29.getText()), textField34.getText());
                        Task3Point D = new Task3Point(Integer.parseInt(textField25.getText()), Integer.parseInt(textField30.getText()), textField35.getText());
                        Task3Point E = new Task3Point(Integer.parseInt(textField26.getText()), Integer.parseInt(textField31.getText()), textField36.getText());

                        Task3Figure Point3 = new Task3Figure(A, B, C, D, E);

                        ais5.setText(A.dot + B.dot + " = " + Point3.a);
                        bis5.setText(B.dot + C.dot + " = " + Point3.b);
                        cis5.setText(C.dot + D.dot + " = " + Point3.c);
                        dis5.setText(D.dot + E.dot + " = " + Point3.d);
                        eis5.setText(E.dot + A.dot + " = " + Point3.e);

                        P5.setText(Task3Figure.PerimeterCalculator(Point3));
                    }
                } catch (Exception c) {
                    JOptionPane.showMessageDialog(null, "Please enter integer number into 'x' and 'y'");
                }
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                task3.setVisible(false);
                MainWindow.runMainWindow();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(null);
                textField4.setText(null);
                textField4.setText(null);
                textField2.setText(null);
                textField5.setText(null);
                textField5.setText(null);
                textField3.setText(null);
                textField6.setText(null);
                textField6.setText(null);
                textField10.setText(null);
                textField14.setText(null);
                textField16.setText(null);
                textField22.setText(null);
                textField12.setText(null);
                textField11.setText(null);
                textField17.setText(null);
                textField23.setText(null);
                textField13.setText(null);
                textField15.setText(null);
                textField18.setText(null);
                textField24.setText(null);
                textField19.setText(null);
                textField20.setText(null);
                textField21.setText(null);
                textField25.setText(null);
                textField26.setText(null);
                textField27.setText(null);
                textField28.setText(null);
                textField29.setText(null);
                textField30.setText(null);
                textField31.setText(null);
                textField32.setText(null);
                textField33.setText(null);
                textField34.setText(null);
                textField35.setText(null);
                textField36.setText(null);
            }
        });
    }

    public static void runTask3() {
        task3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        task3.setLocationRelativeTo(null);
        task3.setVisible(true);
        task3.pack();
        task3.setSize(1050, 300);
        task3.setContentPane(new Task3().mainPanel);
        task3.setResizable(false);
    }
}

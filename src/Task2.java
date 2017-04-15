import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Александр on 15.04.2017.
 */
public class Task2 extends JFrame {
    private static JFrame task2 = new JFrame("Matrix");
    private JPanel mainPanel;
    private JButton backButton;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField21;
    private JTextField textField22;
    private JTextField textField23;
    private JTextField textField31;
    private JTextField textField32;
    private JTextField textField33;
    private JButton defaultButton;
    private JButton clearButton;
    private JLabel exitLabel;
    private JButton submitMatrixAButton;
    private JButton submitMatrixBButton;
    private JButton countButton;
    private JLabel line1matrix1;
    private JLabel line2matrix1;
    private JLabel line3matrix1;
    private JLabel line1matrix2;
    private JLabel line2matrix2;
    private JLabel line3matrix2;
    private double[][] matrix1 = new double[3][3];
    private double[][] matrix2 = new double[3][3];

    public Task2() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                task2.setVisible(false);
                MainWindow.runMainWindow();
            }
        });
        defaultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                matrix1 = MethodTask2.defaultMatrix1;

                line1matrix1.setText(MethodTask2.getLineofMatrix(matrix1, 1));
                line2matrix1.setText(MethodTask2.getLineofMatrix(matrix1, 2));
                line3matrix1.setText(MethodTask2.getLineofMatrix(matrix1, 3));

                matrix2 = MethodTask2.defaultMatrix2;

                line1matrix2.setText(MethodTask2.getLineofMatrix(matrix2, 1));
                line2matrix2.setText(MethodTask2.getLineofMatrix(matrix2, 2));
                line3matrix2.setText(MethodTask2.getLineofMatrix(matrix2, 3));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitLabel.setText(null);

                textField11.setText(null);
                textField12.setText(null);
                textField13.setText(null);
                textField21.setText(null);
                textField22.setText(null);
                textField23.setText(null);
                textField31.setText(null);
                textField32.setText(null);
                textField33.setText(null);

                line1matrix2.setText(null);
                line2matrix2.setText(null);
                line3matrix2.setText(null);

                line1matrix1.setText(null);
                line2matrix1.setText(null);
                line3matrix1.setText(null);


            }
        });
        submitMatrixAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    matrix1[0][0] = Double.parseDouble(textField11.getText());
                    matrix1[0][1] = Double.parseDouble(textField12.getText());
                    matrix1[0][2] = Double.parseDouble(textField13.getText());
                    matrix1[1][0] = Double.parseDouble(textField21.getText());
                    matrix1[1][1] = Double.parseDouble(textField22.getText());
                    matrix1[1][2] = Double.parseDouble(textField23.getText());
                    matrix1[2][0] = Double.parseDouble(textField31.getText());
                    matrix1[2][1] = Double.parseDouble(textField32.getText());
                    matrix1[2][2] = Double.parseDouble(textField33.getText());

                    line1matrix1.setText(MethodTask2.getLineofMatrix(matrix1, 1));
                    line2matrix1.setText(MethodTask2.getLineofMatrix(matrix1, 2));
                    line3matrix1.setText(MethodTask2.getLineofMatrix(matrix1, 3));

                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "Please enter double or integer numeral");
                    textField11.setText(null);
                    textField12.setText(null);
                    textField13.setText(null);
                    textField21.setText(null);
                    textField22.setText(null);
                    textField23.setText(null);
                    textField31.setText(null);
                    textField32.setText(null);
                    textField33.setText(null);
                }
            }
        });
        submitMatrixBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    matrix2[0][0] = Double.parseDouble(textField11.getText());
                    matrix2[0][1] = Double.parseDouble(textField12.getText());
                    matrix2[0][2] = Double.parseDouble(textField13.getText());
                    matrix2[1][0] = Double.parseDouble(textField21.getText());
                    matrix2[1][1] = Double.parseDouble(textField22.getText());
                    matrix2[1][2] = Double.parseDouble(textField23.getText());
                    matrix2[2][0] = Double.parseDouble(textField31.getText());
                    matrix2[2][1] = Double.parseDouble(textField32.getText());
                    matrix2[2][2] = Double.parseDouble(textField33.getText());

                    line1matrix2.setText(MethodTask2.getLineofMatrix(matrix2, 1));
                    line2matrix2.setText(MethodTask2.getLineofMatrix(matrix2, 2));
                    line3matrix2.setText(MethodTask2.getLineofMatrix(matrix2, 3));

                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "Please enter double or integer numeral");
                    textField11.setText(null);
                    textField12.setText(null);
                    textField13.setText(null);
                    textField21.setText(null);
                    textField22.setText(null);
                    textField23.setText(null);
                    textField31.setText(null);
                    textField32.setText(null);
                    textField33.setText(null);
                }
            }
        });
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    exitLabel.setText(MethodTask2.detMatrix(MethodTask2.matrixPlus(MethodTask2.matrixMultiply(3, MethodTask2.matrixMultiply(matrix1, matrix2)),
                            MethodTask2.matrixMultiply(MethodTask2.matrixMinus(matrix1, matrix2), matrix1))) + "");
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "Fill in all the fields");
                }

            }
        });
    }

    public static void runTask2() {
        task2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        task2.setLocationRelativeTo(null);
        task2.setVisible(true);
        task2.pack();
        task2.setSize(600, 400);
        task2.setContentPane(new Task2().mainPanel);
        task2.setResizable(false);
    }
}

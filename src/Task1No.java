import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Александр on 14.04.2017.
 */
public class Task1No extends JFrame{
    private static JFrame task1no = new JFrame("Task 1");
    private JPanel mainPanel;
    private JButton backButton;
    private JButton sumbitButton;
    private JButton randomButton;
    private JLabel labelA1;
    private JLabel labelB1;
    private JLabel labelA2;
    private JLabel labelB2;
    private JLabel labelA3;
    private JLabel labelB3;
    private JButton clearButton;
    private JLabel firstLabel;
    private JLabel secondLabel;
    private String clear = "";
    private String clearFirstLabel = "R = ";
    private String clearSecondLabel = "1/R = ";

    public Task1No() {
        randomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();

                labelA1.setText(clear);
                labelA2.setText(clear);
                labelA3.setText(clear);
                labelB1.setText(clear);
                labelB2.setText(clear);
                labelB3.setText(clear);

                int a1 = random.nextInt(10);
                int a2 = random.nextInt(10);
                int a3 = random.nextInt(10);
                int b1 = random.nextInt(10);
                int b2 = random.nextInt(10);
                int b3 = random.nextInt(10);

                labelA1.setText(clear + a1);
                labelA2.setText(clear + a2);
                labelA3.setText(clear + a3);
                labelB1.setText(clear + b1);
                labelB2.setText(clear + b2);
                labelB3.setText(clear + b3);
            }
        });
        sumbitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a1 = Integer.parseInt(labelA1.getText());
                int a2 = Integer.parseInt(labelA2.getText());
                int a3 = Integer.parseInt(labelA3.getText());
                int b1 = Integer.parseInt(labelB1.getText());
                int b2 = Integer.parseInt(labelB2.getText());
                int b3 = Integer.parseInt(labelB3.getText());

                MethodTask1 t1 = new MethodTask1(a1, b1, a2, b2, a3, b3);

                firstLabel.setText(clearFirstLabel + t1.multFraction(t1.plusFraction(t1.getFraction1(), t1.getFraction2()), t1.plusFraction(t1.getFraction1(), t1.getFraction3())));
                secondLabel.setText(clearSecondLabel + t1.reverseFraction(t1.multFraction(t1.plusFraction(t1.getFraction1(), t1.getFraction2()), t1.plusFraction(t1.getFraction1(), t1.getFraction3()))));

            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow.runMainWindow();
                task1no.setVisible(false);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelA1.setText(clear);
                labelA2.setText(clear);
                labelA3.setText(clear);
                labelB1.setText(clear);
                labelB2.setText(clear);
                labelB3.setText(clear);

                firstLabel.setText(clearFirstLabel);
                secondLabel.setText(clearSecondLabel);
            }
        });
    }

    public static void runTask1No(){
        task1no.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        task1no.setLocationRelativeTo(null);
        task1no.setVisible(true);
        task1no.pack();
        task1no.setSize(600, 300);
        task1no.setContentPane(new Task1No().mainPanel);
        task1no.setResizable(false);
    }
}

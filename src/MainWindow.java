import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Александр on 14.04.2017.
 */
public class MainWindow extends JFrame {
    private static JFrame mainFrame = new JFrame("Home Work 7");
    private JButton task1Button;
    private JButton task2Button;
    private JButton task3Button;
    private JLabel Label1;
    private JPanel mainPanel;

    public MainWindow() {
        task1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(false);
                int result = JOptionPane.showConfirmDialog(null, "Choose fraction yourself?");
                if (result == JOptionPane.YES_OPTION) {
                    Task1Yes.RunTask1Yes();
                } else if (result == JOptionPane.NO_OPTION) {
                    Task1No.runTask1No();
                } else mainFrame.setVisible(true);


            }
        });
        task2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task2.runTask2();
                mainFrame.setVisible(false);
            }
        });
        task3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task3.runTask3();
                mainFrame.setVisible(false);
            }
        });
    }

    public static void runMainWindow() {
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.pack();
        mainFrame.setSize(500, 300);
        mainFrame.setContentPane(new MainWindow().mainPanel);
        mainFrame.setResizable(false);
    }
}

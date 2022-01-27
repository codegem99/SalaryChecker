import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationFive {
    private JPanel framePanel;
    private JTextField inputField;
    private JTextField displayField;
    private JTextField resultLabel;
    private JButton calButton;
    private JButton resetbutton;
    private JLabel titleLabel;
    private JLabel GrossPay;
    private JLabel Taxpay;
    private JLabel headerLabel;

    public ApplicationFive() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double iGrosspay=Double.parseDouble(inputField.getText());
                double iTax= Double.parseDouble(displayField.getText())/100;
                double iNetSalary= iGrosspay-(iGrosspay*iTax);


                String Calc_NetSalary=String.format("%.2f" ,iNetSalary);
                resultLabel.setText(Calc_NetSalary);
            }
        });
        resetbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText(null);
                resultLabel.setText(null);
                inputField.setText(null);
                displayField.setText(null);
                displayField.setOpaque(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame= new JFrame("ApplicationFive");
        frame.setContentPane(new ApplicationFive().framePanel);


        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}


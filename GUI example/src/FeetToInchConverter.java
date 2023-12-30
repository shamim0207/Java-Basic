import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeetToInchConverter extends JFrame {
    private JTextField feetField;
    private JLabel resultLabel;

    public FeetToInchConverter() {
        setTitle("Feet to Inch Converter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel feetLabel = new JLabel("Feet:");
        feetLabel.setBounds(30, 30, 80, 25);
        add(feetLabel);

        feetField = new JTextField();
        feetField.setBounds(120, 30, 120, 25);
        add(feetField);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(90, 70, 100, 30);
        add(convertButton);

        resultLabel = new JLabel("Converted Inch: ");
        resultLabel.setBounds(30, 120, 200, 25);
        add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertFeetToInch();
            }
        });
    }

    private void convertFeetToInch() {
        try {
            double feet = Double.parseDouble(feetField.getText());
            double inches = feet * 12;
            resultLabel.setText("Converted Inch: " + inches);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FeetToInchConverter().setVisible(true);
            }
        });
    }
}

import javax.swing.*;

public class CountdownApp {
    private static int counter = 3;
    private static JLabel label;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Run!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        label = new JLabel();
        panel.add(label);

        JButton button = new JButton("Click");
        button.addActionListener(e -> countdown());
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void countdown() {
        if (counter > 0) {
            label.setText(counter + "...");
            counter--;
        } else if (counter == 0) {
            label.setText("GO!");
            counter--;
        }
    }
}

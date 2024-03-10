import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class Greeting {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Greeting App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton greetButton = new JButton("Greet Me");

        greetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showGreetingDialog();
            }
        });

        frame.getContentPane().add(greetButton, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static void showGreetingDialog() {
        JFrame dialogFrame = new JFrame("Greetings");
        dialogFrame.setSize(200, 100);

        JLabel greetingLabel = new JLabel(getGreetingMessage());
        greetingLabel.setHorizontalAlignment(JLabel.CENTER);

        dialogFrame.getContentPane().add(greetingLabel);

        dialogFrame.setLocationRelativeTo(null);
        dialogFrame.setVisible(true);
    }

    private static String getGreetingMessage() {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        if (hour >= 6 && hour < 12) {
            return "Good Morning!";
        } else if (hour >= 12 && hour < 18) {
            return "Good Afternoon!";
        } else {
            return "Good Evening!";
        }
    }
}

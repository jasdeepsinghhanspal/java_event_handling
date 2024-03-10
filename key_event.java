import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class key_event {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Event Example");
        JPanel panel = new JPanel();

        CustomKeyListener keyListener = new CustomKeyListener();
        panel.addKeyListener(keyListener);
        panel.setFocusable(true);  // Ensure the panel can receive keyboard input

        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class CustomKeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
        // Invoked when a key is typed (pressed and released)
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Invoked when a physical key is pressed down
        System.out.println("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Invoked when a physical key is released
        System.out.println("Key Released: " + e.getKeyChar());
    }
}

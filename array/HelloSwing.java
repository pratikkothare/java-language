
    import javax.swing.*;

public class HelloSwing {
    public static void main(String[] args) {
        // Create a frame (window)
        JFrame frame = new JFrame("Hello Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 1000);

        // Create a label
        JLabel label = new JLabel("Welcome to Java Swing!", SwingConstants.CENTER);

        // Add the label to the frame
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}



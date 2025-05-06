package app;

import javax.swing.*;

public class MainApplication {
    public static void main(String[] args) {
        // Schedule GUI creation on Event Dispatch Thread (best practice)
        SwingUtilities.invokeLater(MainApplication::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("My OpenJDK App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a button
        JButton button = new JButton("Click Me!");

        // Add action listener to the button
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Hello from OpenJDK!"));

        // Add button to the frame
        frame.getContentPane().add(button);

        // Center the frame and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

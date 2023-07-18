import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
    private JTextField textField;

    public MyFrame() {
        setTitle("Action Listener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text field
        textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);

        // Add ActionListener to the text field
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform action when enter key is pressed in the text field
                String text = textField.getText();
                JOptionPane.showMessageDialog(null, "Entered text: " + text);
            }
        });

        // Add the text field to the frame
        getContentPane().setLayout(null);
        getContentPane().add(textField);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}

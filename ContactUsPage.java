import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContactUsPage extends JFrame implements ActionListener {
    private JLabel titleLabel, nameLabel, emailLabel, subjectLabel, messageLabel;
    private JTextField nameTextField, emailTextField, subjectTextField;
    private JTextArea messageTextArea;
    private JButton submitButton;
 private JButton backButton;
    public ContactUsPage() {
        super("CONTACT US");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
		
		ImageIcon logoIcon = new ImageIcon("p20.png");
         setIconImage(logoIcon.getImage());

        titleLabel = new JLabel("CONTACT US");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(200, 50, 200, 50);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        nameLabel.setBounds(100, 120, 100, 30);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial", Font.PLAIN, 14));
        nameTextField.setBounds(200, 120, 200, 30);

        // Set email label and text field
        emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        emailLabel.setBounds(100, 170, 100, 30);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Arial", Font.PLAIN, 14));
        emailTextField.setBounds(200, 170, 200, 30);

        // Set subject label and text field
        subjectLabel = new JLabel("Subject:");
        subjectLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        subjectLabel.setBounds(100, 220, 100, 30);

        subjectTextField = new JTextField();
        subjectTextField.setFont(new Font("Arial", Font.PLAIN, 14));
        subjectTextField.setBounds(200, 220, 200, 30);

        // Set message label and text area
        messageLabel = new JLabel("Message:");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        messageLabel.setBounds(100, 270, 100, 30);

        messageTextArea = new JTextArea();
        messageTextArea.setFont(new Font("Arial", Font.PLAIN, 14));
        messageTextArea.setBounds(200, 270, 200, 150);
        messageTextArea.setLineWrap(true);

        // Set submit button
        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 14));
        submitButton.setBounds(250, 422, 100, 30);
        submitButton.addActionListener(this);
		
		backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.PLAIN, 14));
        backButton.setBounds(350, 422, 100, 30);
        backButton.addActionListener(this);

        // Add components to the frame
        getContentPane().setLayout(null);
        getContentPane().add(titleLabel);
        getContentPane().add(nameLabel);
        getContentPane().add(nameTextField);
        getContentPane().add(emailLabel);
        getContentPane().add(emailTextField);
        getContentPane().add(subjectLabel);
        getContentPane().add(subjectTextField);
        getContentPane().add(messageLabel);
        getContentPane().add(messageTextArea);
        getContentPane().add(submitButton);
getContentPane().add(backButton);
        // Set frame size and make it visible
        setSize(700, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String subject = subjectTextField.getText();
            String message = messageTextArea.getText();

            // TODO: Process the submitted contact form (e.g., send email, save to database)

           
// Display a confirmation message
            JOptionPane.showMessageDialog(null, "Thank you for contacting us!");

            // Clear the form fields
            nameTextField.setText("");
            emailTextField.setText("");
            subjectTextField.setText("");
            messageTextArea.setText("");
       	   }
		   else if (e.getSource() == backButton) {
            Homepage homepage = new Homepage();
            homepage.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        new ContactUsPage();
    }
}
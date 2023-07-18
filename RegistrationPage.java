import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationPage extends JFrame implements ActionListener {
    JLabel titleLabel, nameLabel, emailLabel, contactLabel, passwordLabel, confirmPasswordLabel, loginLabel;
    JTextField nameTextField, emailTextField, contactTextField;
    JPasswordField passwordField, confirmPasswordField;
    JButton registerButton, loginButton;

    public RegistrationPage() {
        super("REGISTRATION");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        ImageIcon logoIcon = new ImageIcon("p20.png");
        setIconImage(logoIcon.getImage());
		
		Color backgroundColor = new Color(0xCA3D3E);

        titleLabel = new JLabel("REGISTRATION FORM");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(50, 50, 300, 50);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        nameLabel.setBounds(50, 120, 100, 30);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial", Font.PLAIN, 14));
        nameTextField.setBounds(150, 120, 200, 30);

        emailLabel = new JLabel("E-mail");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        emailLabel.setBounds(50, 170, 100, 30);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Arial", Font.PLAIN, 14));
        emailTextField.setBounds(150, 170, 200, 30);

        // Set contact label and text field
        contactLabel = new JLabel("Contact No.");
        contactLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        contactLabel.setBounds(50, 220, 100, 30);

        contactTextField = new JTextField();
        contactTextField.setFont(new Font("Arial", Font.PLAIN, 14));
        contactTextField.setBounds(150, 220, 200, 30);

        // Set password label and password field
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordLabel.setBounds(50, 270, 100, 30);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordField.setBounds(150, 270, 200, 30);

        // Set confirm password label and confirm password field
        confirmPasswordLabel = new JLabel("Confirm Password");
        confirmPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        confirmPasswordLabel.setBounds(20, 320, 130, 30);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setFont(new Font("Arial", Font.PLAIN, 14));
        confirmPasswordField.setBounds(150, 320, 200, 30);

        // Set register button
        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Arial", Font.PLAIN, 14));
        registerButton.setBounds(100, 380, 100, 30);
        registerButton.addActionListener(this);

        // Set login button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 14));
        loginButton.setBounds(200, 380, 100, 30);
        loginButton.addActionListener(this);

        // Set login label
        loginLabel = new JLabel("Already have an account? Login here!");
        loginLabel.setFont(new Font("Arial", Font.PLAIN ,14));
        loginLabel.setBounds(50, 430, 300, 30);
        loginLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add components to the frame
        getContentPane().setLayout(null);
        getContentPane().add(titleLabel);
        getContentPane().add(nameLabel);
        getContentPane().add(nameTextField);
        getContentPane().add(emailLabel);
        getContentPane().add(emailTextField);
        getContentPane().add(contactLabel);
        getContentPane().add(contactTextField);
        getContentPane().add(passwordLabel);
        getContentPane().add(passwordField);
        getContentPane().add(confirmPasswordLabel);
        getContentPane().add(confirmPasswordField);
        getContentPane().add(registerButton);
        getContentPane().add(loginButton);
        getContentPane().add(loginLabel);
        getContentPane().setBackground(backgroundColor);
        

        // Set frame size and make it visible
        setSize(700, 500);
        setLocationRelativeTo(null); // Open the frame in the middle of the screen
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String contact = contactTextField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            // TODO: Add registration logic here

            JOptionPane.showMessageDialog(null, "Registration successful!");
        } else if (e.getSource() == loginButton) {
            LoginPage loginPage = new LoginPage();
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new RegistrationPage();
    }
}
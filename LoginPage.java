import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {
    JLabel titleLabel, usernameLabel, passwordLabel, registerLabel;
    JTextField usernameTextField;
    JPasswordField passwordField;
    JButton loginButton, registerButton, forgotPasswordButton;
    JLabel createAccountLabel;

    public LoginPage() {
        super("CINEVERSE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        ImageIcon logoIcon = new ImageIcon("p20.png");
        setIconImage(logoIcon.getImage());

        titleLabel = new JLabel("CINEVERSE");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(250, 50, 200, 50);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        usernameLabel = new JLabel("E-Mail");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        usernameLabel.setBounds(150, 120, 100, 30);

        usernameTextField = new JTextField();
        usernameTextField.setFont(new Font("Arial", Font.PLAIN, 14));
        usernameTextField.setBounds(250, 120, 200, 30);

        // Set password label and password field
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordLabel.setBounds(150, 170, 100, 30);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordField.setBounds(250, 170, 200, 30);

        // Set login button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 14));
        loginButton.setBounds(200, 230, 100, 30);
        loginButton.addActionListener(this);

        // Set register button
        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Arial", Font.PLAIN, 14));
        registerButton.setBounds(300, 230, 100, 30);
        registerButton.addActionListener(this);

        // Set forgot password button
        forgotPasswordButton = new JButton("Forgot Password");
        forgotPasswordButton.setFont(new Font("Arial", Font.PLAIN, 12));
        forgotPasswordButton.setBounds(230, 280, 150, 30);
        forgotPasswordButton.addActionListener(this);

        // Set create account label
        createAccountLabel = new JLabel("Don't have an account yet? Register!");
        createAccountLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        createAccountLabel.setBounds(125, 320, 250, 25);
        createAccountLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add components to the frame
        getContentPane().setLayout(null);
        getContentPane().add(titleLabel);
        getContentPane().add(usernameLabel);
        getContentPane().add(usernameTextField);
        getContentPane().add(passwordLabel);
        getContentPane().add(passwordField);
        getContentPane().add(loginButton);
        getContentPane().add(registerButton);
        getContentPane().add(forgotPasswordButton);
        getContentPane().add(createAccountLabel);

        // Set frame size and make it visible
        setSize(700, 500);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameTextField.getText();
           
            String password = new String(passwordField.getPassword());

            // TODO: Add authentication logic here

            JOptionPane.showMessageDialog(null, "Login successful!");
        } else if (e.getSource() == registerButton) {
            RegistrationPage registrationPage = new RegistrationPage();
        } else if (e.getSource() == forgotPasswordButton) {
            ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage();
            forgetPasswordPage.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}

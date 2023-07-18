import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ForgetPasswordPage extends JFrame implements ActionListener {
    private JLabel titleLabel, emailLabel, loginLabel;
    private JTextField emailTextField;
    private JButton resetButton, loginButton;

    public ForgetPasswordPage() {
        super("FORGET PASSWORD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        ImageIcon logoIcon = new ImageIcon("D:\\Personal\\Programming-2nd semester(java)\\Notepad++\\Project\\p20.png");
        setIconImage(logoIcon.getImage());

        titleLabel = new JLabel("FORGET PASSWORD");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(200, 50, 300, 50);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        emailLabel.setBounds(150, 150, 100, 30);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Arial", Font.PLAIN, 14));
        emailTextField.setBounds(250, 150, 200, 30);

        // Set reset button
        resetButton = new JButton("Reset Password");
        resetButton.setFont(new Font("Arial", Font.PLAIN, 14));
        resetButton.setBounds(250, 200, 150, 30);
        resetButton.addActionListener(this);

        // Set login button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 14));
        loginButton.setBounds(250, 250, 150, 30);
        loginButton.addActionListener(this);

        // Set login label
        loginLabel = new JLabel("Have already an account? Login here!");
        loginLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        loginLabel.setBounds(200, 300, 250, 30);
        loginLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add components to the frame
        getContentPane().setLayout(null);
        getContentPane().add(titleLabel);
        getContentPane().add(emailLabel);
        getContentPane().add(emailTextField);
        getContentPane().add(resetButton);
        getContentPane().add(loginButton);
        getContentPane().add(loginLabel);

        setSize(700, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            String email = emailTextField.getText();

            JOptionPane.showMessageDialog(null, "Password reset link sent to your email!");
        } else if (e.getSource() == loginButton) {
            LoginPage loginPage = new LoginPage();
            loginPage.setVisible(true);
            dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ForgetPasswordPage();
            }
        });
    }
}



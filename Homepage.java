import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage extends JFrame implements ActionListener {
    private JLabel logoLabel;
    private JButton loginButton;
    private JButton registerButton;
    private JButton contactButton;
    private JButton parkingButton;
    private JButton foodCornerButton;
    private JButton buyTicketButton;
    private JLabel nameLabel;
    private JLabel photoLabel1; 
    private JLabel photoLabel2; 
    private JLabel photoLabel3; 
    private JLabel photoLabel4; 

    public Homepage() {
        setTitle("CINEVERSE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        ImageIcon icon = new ImageIcon("p20.png");
        setIconImage(icon.getImage());

        ImageIcon logoIcon = new ImageIcon("l2.png");
        logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(200, 10, 300, 80);

        loginButton = new JButton("Login");
        loginButton.setBounds(250, 150, 100, 30);
        loginButton.addActionListener(this);
        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(Color.RED);
        loginButton.setFont(new Font("Söhne Mono", Font.BOLD, 12));

        registerButton = new JButton("Register");
        registerButton.setBounds(350, 150, 100, 30);
        registerButton.addActionListener(this);
        registerButton.setBackground(Color.WHITE);
        registerButton.setForeground(Color.RED);
        registerButton.setFont(new Font("Söhne Mono", Font.BOLD, 12));

        contactButton = new JButton("Contact Us");
        contactButton.setBounds(450, 100, 100, 30);
        contactButton.addActionListener(this);
        contactButton.setBackground(Color.WHITE);
        contactButton.setForeground(Color.RED);
        contactButton.setFont(new Font("Söhne Mono", Font.BOLD, 12));

        parkingButton = new JButton("Parking");
        parkingButton.setBounds(350, 100, 100, 30);
        parkingButton.addActionListener(this);
        parkingButton.setBackground(Color.WHITE);
        parkingButton.setForeground(Color.RED);
        parkingButton.setFont(new Font("Söhne Mono", Font.BOLD, 12));

        foodCornerButton = new JButton("Food");
        foodCornerButton.setBounds(250, 100, 100, 30);
        foodCornerButton.addActionListener(this);
        foodCornerButton.setBackground(Color.WHITE);
        foodCornerButton.setForeground(Color.RED);
        foodCornerButton.setFont(new Font("Söhne Mono", Font.BOLD, 12));

        buyTicketButton = new JButton("Buy Ticket");
        buyTicketButton.setBounds(150, 100, 100, 30);
        buyTicketButton.addActionListener(this);
        buyTicketButton.setBackground(Color.WHITE);
        buyTicketButton.setForeground(Color.RED);
        buyTicketButton.setFont(new Font("Söhne Mono", Font.BOLD, 12));

        nameLabel = new JLabel("Now Showing");
        nameLabel.setBounds(253, 60, 200, 300);
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Söhne Mono", Font.BOLD | Font.ITALIC, 29));

        // Create the photo labels and set the images
        ImageIcon photoIcon1 = new ImageIcon("m1.jpg");
        photoLabel1 = new JLabel(photoIcon1);
        photoLabel1.setBounds(10, 250, 200, 200);

        ImageIcon photoIcon2 = new ImageIcon("m2.jpg");
               photoLabel2 = new JLabel(photoIcon2);
        photoLabel2.setBounds(245, 250, 200, 200);

        ImageIcon photoIcon3 = new ImageIcon("m3.jpg");
        photoLabel3 = new JLabel(photoIcon3);
        photoLabel3.setBounds(475, 250, 200, 200);

        ImageIcon photoIcon4 = new ImageIcon("23.jpg");
        photoLabel4 = new JLabel(photoIcon4);
        photoLabel4.setBounds(550, 400, 100, 100);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image background = new ImageIcon("b1.png").getImage();
                g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(null);
        panel.add(logoLabel);
        panel.add(loginButton);
        panel.add(registerButton);
        panel.add(contactButton);
        panel.add(parkingButton);
        panel.add(foodCornerButton);
        panel.add(buyTicketButton);
        panel.add(nameLabel);
        panel.add(photoLabel1); // Add the photo labels to the panel
        panel.add(photoLabel2);
        panel.add(photoLabel3);
        panel.add(photoLabel4);

        setContentPane(panel);
        setSize(700, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        this.dispose();  

        } else if (e.getSource() == registerButton) {
            new RegistrationPage();
			setVisible(false);

        } else if (e.getSource() == contactButton) {
            ContactUsPage contactUsPage = new ContactUsPage();
        contactUsPage.setVisible(true);
        this.dispose();

        } else if (e.getSource() == parkingButton) {
            // Handle parking button click

        } else if (e.getSource() == foodCornerButton) {
            // Handle food corner button click

        } else if (e.getSource() == buyTicketButton) {
            // Handle buy ticket button click

        }
    }

    public static void main(String[] args) {
        new Homepage();
    }
}

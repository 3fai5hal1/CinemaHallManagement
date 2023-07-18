import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieFrame extends JFrame {

    public MovieFrame() {
        super("Movie Frame");
        setIconImage(new ImageIcon("logo.png").getImage()); // Set logo as TitleBar icon
        setSize(900, 700); // Set size of the frame
        setLayout(new BorderLayout()); // Use BorderLayout as the layout manager

        // Create a JPanel for the top bar
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(62, 39, 35)); // Set background color
        add(topPanel, BorderLayout.NORTH);

        // Create a JButton for login
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Set custom font
        loginButton.setForeground(Color.WHITE); // Set font color
        loginButton.setBackground(new Color(255, 119, 84)); // Set button color
        loginButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Add padding
        topPanel.add(loginButton, BorderLayout.WEST);

        // Create a JButton for registration
        JButton registrationButton = new JButton("Registration");
        registrationButton.setFont(new Font("Segoe UI", Font.BOLD, 16)); // Set custom font
        registrationButton.setForeground(Color.WHITE); // Set font color
        registrationButton.setBackground(new Color(153, 204, 51)); // Set button color
        registrationButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Add padding
        topPanel.add(registrationButton, BorderLayout.CENTER);

        // Create a JButton for the menu
        JPopupMenu menu = new JPopupMenu();
        menu.add(new JMenuItem("Schedule"));
        menu.add(new JMenuItem("Food Coverage"));
        menu.add(new JMenuItem("Ticket Price"));
        menu.add(new JMenuItem("Contact Us"));
        menu.add(new JMenuItem("Parking"));
        JButton menuButton = new JButton(new ImageIcon("menu.png"));
        menuButton.setBorderPainted(false); // Remove border
        menuButton.setContentAreaFilled(false); // Remove background color
        menuButton.setFocusPainted(false); // Remove focus highlight
        menuButton.setComponentPopupMenu(menu);
        topPanel.add(menuButton, BorderLayout.EAST);

        // Create a JPanel for the movie posters
        JPanel posterPanel = new JPanel(new CardLayout());
        posterPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add spacing
        add(posterPanel, BorderLayout.CENTER);

        // Create three JLabels for the movie posters
        JLabel poster1 = new JLabel(new ImageIcon("poster1.png"));
        JLabel poster2 = new JLabel(new ImageIcon("poster2.png"));
        JLabel poster3 = new JLabel(new ImageIcon("poster3.png"));

        // Add the posters to the posterPanel
        posterPanel.add(poster1, "poster1");
        posterPanel.add(poster2, "poster2");
        posterPanel.add(poster3, "poster");
        // Create a Timer to switch between the posters every 5 seconds
        Timer timer = new Timer(5000, new ActionListener() {
            int index = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) posterPanel.getLayout();
                switch(index % 3) {
                    case 0:
                        cardLayout.show(posterPanel, "poster1");
                        break;
                    case 1:
                        cardLayout.show(posterPanel, "poster2");
                        break;
                    case 2:
                        cardLayout.show(posterPanel, "poster3");
                        break;
                }
                index++;
            }
        });
        timer.start(); // Start the timer

        setVisible(true); // Set the frame as visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the frame is closed
    }

    public static void main(String[] args) {
        new MovieFrame();
    }
}

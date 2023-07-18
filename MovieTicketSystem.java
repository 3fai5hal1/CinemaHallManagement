import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieTicketSystem {
    private JFrame frame;
    private Timer timer;
    private int currentPosterIndex;
	private JPanel moviePanel;

    public void run() {
        frame = new JFrame("Movie Ticket System");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        JPanel logoPanel = new JPanel();
        logoPanel.setBounds(0, 0, 800, 100);
        JLabel logoLabel = new JLabel("Your Logo Here");
        logoPanel.add(logoLabel);

                moviePanel = new JPanel();
        moviePanel.setLayout(null);
        moviePanel.setBounds(0, 100, 800, 400);

        JLabel moviePosterLabel1 = new JLabel(new ImageIcon("1.jpg"));
        JLabel moviePosterLabel2 = new JLabel(new ImageIcon("2.jpg"));
        JLabel moviePosterLabel3 = new JLabel(new ImageIcon("3.jpg"));
        JLabel moviePosterLabel4 = new JLabel(new ImageIcon("4.jpg"));
        JLabel moviePosterLabel5 = new JLabel(new ImageIcon("5.jpg"));
        moviePosterLabel1.setBounds(0, 0, 200, 400);
        moviePosterLabel2.setBounds(200, 0, 200, 400);
        moviePosterLabel3.setBounds(400, 0, 200, 400);
        moviePosterLabel4.setBounds(600, 0, 200, 400);
        moviePosterLabel5.setBounds(800, 0, 200, 400);
        moviePanel.add(moviePosterLabel1);
        moviePanel.add(moviePosterLabel2);
        moviePanel.add(moviePosterLabel3);
        moviePanel.add(moviePosterLabel4);
        moviePanel.add(moviePosterLabel5);
        currentPosterIndex = 0;
        timer = new Timer(3000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentPosterIndex = (currentPosterIndex + 1) % 5;
                moviePosterLabel1.setVisible(currentPosterIndex == 0);
                moviePosterLabel2.setVisible(currentPosterIndex == 1);
                moviePosterLabel3.setVisible(currentPosterIndex == 2);
                moviePosterLabel4.setVisible(currentPosterIndex == 3);
                moviePosterLabel5.setVisible(currentPosterIndex == 4);
            }
        });
        timer.start();

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(300, 200, 200, 50);
        loginButton.setFont(new Font("Arial", Font.PLAIN, 18)); // Set button font
        loginButton.setBackground(Color.BLUE); // Set button background color
        loginButton.setForeground(Color.WHITE); // Set button text color
        loginButton.setFocusPainted(false); // Remove focus border
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add action for login button here
            }
        });
        JButton registrationButton = new JButton("Registration");
        registrationButton.setBounds(300, 300, 200, 50);
	    registrationButton.setFont(new Font("Arial", Font.PLAIN, 18)); // Set button font
        registrationButton.setBackground(Color.GREEN); // Set button background color
        registrationButton.setForeground(Color.WHITE); // Set button text color
        registrationButton.setFocusPainted(false); // Remove focus border
        registrationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add action for registration button here
            }
        });
        JButton threeDotMenuButton = new JButton("...");
        threeDotMenuButton.setBounds(500, 250, 50, 50);
		ImageIcon menuIcon = new ImageIcon("menu_icon.png");
        threeDotMenuButton.setIcon(menuIcon);
        threeDotMenuButton.setFont(new Font("Arial", Font.PLAIN, 18)); // Set button font
        threeDotMenuButton.setBackground(Color.GRAY); // Set button background color
        threeDotMenuButton.setForeground(Color.WHITE); // Set button text color
        threeDotMenuButton.setFocusPainted(false); // Remove focus border
        threeDotMenuButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                // Add action for registration button here
            }
        });
        threeDotMenuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JPopupMenu popupMenu = new JPopupMenu();
                JMenuItem scheduleItem = new JMenuItem("SCHEDULE");
                JMenuItem foodItem = new JMenuItem("FOOD CONCESSION");
                JMenuItem ticketPriceItem = new JMenuItem("TICKET PRICE");
                JMenuItem contactUsItem = new JMenuItem("CONTACT US");
                JMenuItem parkingItem = new JMenuItem("PARKING");
                popupMenu.add(scheduleItem);
                popupMenu.add(foodItem);
                popupMenu.add(ticketPriceItem);
                popupMenu.add(contactUsItem);
                popupMenu.add(parkingItem);
                popupMenu.show(threeDotMenuButton, threeDotMenuButton.getWidth(), 0);
            }
        });

        frame.add(logoPanel);
        frame.add(moviePanel);
        frame.add(loginButton);
        frame.add(registrationButton);
        frame.add(threeDotMenuButton);

        frame.setVisible(true);
		frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        MovieTicketSystem movieTicketSystem = new MovieTicketSystem();
        movieTicketSystem.run();
    }
}

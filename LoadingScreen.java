import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadingScreen extends JFrame{
    private JLabel backgroundLabel;
    private Timer timer;

    public LoadingScreen(){
        setTitle("Loading Screen");
        setSize(700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        setLocationRelativeTo(null);

        ImageIcon backgroundIcon = new ImageIcon(getClass().getResource("g1.gif"));
        backgroundLabel = new JLabel(backgroundIcon);
        backgroundLabel.setPreferredSize(new Dimension(700, 500)); 
        add(backgroundLabel, BorderLayout.CENTER);

        ImageIcon titleIcon = new ImageIcon(getClass().getResource("p20.png"));
        setIconImage(titleIcon.getImage());

        timer = new Timer(3500,new ActionListener(){

            public void actionPerformed(ActionEvent e){

                dispose();

                timer.stop();
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        
        LoadingScreen frame = new LoadingScreen();
        frame.setVisible(true);
    }
}


import javax.swing.*;

public class Main {
public static void main(String[] args) {

        LoadingScreen loadingScreen = new LoadingScreen();
        loadingScreen.setVisible(true);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        loadingScreen.dispose();
SwingUtilities.invokeLater(new Runnable() {
public void run() {
    Homepage homepage = new Homepage();
    homepage.setVisible(true);
            }
        });
    }
}





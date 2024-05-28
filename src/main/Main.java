package main;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        JFrame window=new JFrame("Simple chess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit on closing the window
        window.setResizable(false);// cant resize
        window.setLocationRelativeTo(null);// to show up at centre of monitor

        window.setVisible(true);

    }
}
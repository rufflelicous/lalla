package _01_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker {

	public static void main(String[] args) {
        
        ChuckleClicker aa = new ChuckleClicker();
        
        
        
    }

    public void makeButtons() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JPanel panel = new JPanel();
        JButton one = new JButton("Joke");
        JButton two = new JButton("Punchline");
        frame.add(panel);
        frame.pack();
        panel.add(one);
        panel.add(two);
        frame.pack();
    }

	}

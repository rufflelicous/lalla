package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
    JFrame frame = new JFrame("ChuckleClicker");
    JPanel panel = new JPanel();
    JButton one = new JButton("Joke");
    JButton two = new JButton("Punchline");
	public static void main(String[] args) {
        
        ChuckleClicker aa = new ChuckleClicker();
        aa.makeButtons();
        
        
    }

    public void makeButtons() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        panel.add(one);
        panel.add(two);
        
        one.addActionListener(this); 
        	
        two.addActionListener(this);
        
        frame.pack();
        frame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(one == e.getSource()) {
			JOptionPane.showMessageDialog(null, "Why is there no c in dark???");
		}
		else {
			JOptionPane.showMessageDialog(null, "BECAUSE YOU CANT C AHAHAHAHA");
		}
		
	}

	}

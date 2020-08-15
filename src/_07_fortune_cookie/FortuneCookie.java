package _07_fortune_cookie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("click me");

	public FortuneCookie() {
		frame.add(button);
		frame.setLocationRelativeTo(null);
		frame.pack();
		button.addActionListener(this);
	}

	public void showButton() {
		frame.setVisible(true);
		System.out.println("Button clicked");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		JOptionPane.showMessageDialog(null,rand);
		
	}
}

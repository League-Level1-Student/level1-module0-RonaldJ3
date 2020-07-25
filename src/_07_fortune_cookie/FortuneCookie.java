package _07_fortune_cookie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();

	public FortuneCookie() {
		frame.add(button);
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
		
	}
}

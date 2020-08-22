package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class jackInTheBox {
	public class jakeInTheBox implements ActionListener {
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");

		public jakeInTheBox() {
			frame.add(button);
			frame.setLocationRelativeTo(null);
			frame.pack();
			button.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
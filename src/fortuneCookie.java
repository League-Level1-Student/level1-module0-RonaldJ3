import javax.swing.JButton;
import javax.swing.JFrame;

public class fortuneCookie {
	JFrame frame = new JFrame();
	JButton button = new JButton();

	public fortuneCookie() {
		frame.add(button);
		frame.pack();
		button.addActionListener("this");
	}

	public void showButton() {
		frame.setVisible(true);
		System.out.println("Button clicked");
	}
}

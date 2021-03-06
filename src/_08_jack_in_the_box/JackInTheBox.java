package _08_jack_in_the_box;


import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;

public class JackInTheBox implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("surprise");
    int counter = 0;
    String image;

    public JackInTheBox() {
        frame.add(button);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        counter++;
        if (counter >= 5) {
            showPicture("jackInTheBox.png");
            playSound("homer-woohoo.wav");
        }
    }

    private void showPicture(String fileName) {
        try {
            JLabel imageLabel = createLabelImage(fileName);
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(imageLabel);
            frame.setVisible(true);
            frame.pack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private JLabel createLabelImage(String fileName) {

        try {
            URL imageURL = getClass().getResource(fileName);
            if (imageURL == null) {
                System.err.println(image + fileName);
                return new JLabel();
            } else {
                Icon icon = new ImageIcon(imageURL);
                return new JLabel(icon);
            }
        } catch (Exception e) {
            System.err.println(image + fileName);
            return new JLabel();
        }
    }

    private void playSound(String soundFile) {
        try {
            AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
            sound.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
	

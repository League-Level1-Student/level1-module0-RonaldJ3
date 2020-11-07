package _09_sound_effects_machine;

import javax.swing.*;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoundEffectsMachine implements ActionListener {
    public void showButton() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton();
        frame.add(panel);
        panel.add(button);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        button.addActionListener(this);
    }

    private void playSound(String fileName) {
        AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
        sound.play();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        playSound("sawing-wood-daniel_simon.wav");
    }
}

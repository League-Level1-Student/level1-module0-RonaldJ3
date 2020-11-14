package _09_sound_effects_machine;

import javax.swing.*;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoundEffectsMachine implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    public void showButton() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        button1 = new JButton("click me 1");
        button2 = new JButton("click me 2");
        button3 = new JButton("click me 3");
        frame.add(panel);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }


    private void playSound(String fileName) {
        AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
        sound.play();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1) {
            playSound("sawing-wood-daniel_simon.wav");
        }
        if (e.getSource()==button2) {
            playSound("boing.wav");
        }
        if (e.getSource()==button3) {
            playSound("beach-noises.wav");
        }
    }
}



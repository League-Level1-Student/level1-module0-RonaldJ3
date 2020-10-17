package _09_sound_effects_machine;

import javax.swing.*;
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

package jnativechooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TesteNativeChooser {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Teste Native File Chooser");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLayout(new FlowLayout());

            JButton btn = new JButton("Selecionar arquivo nativo");
            JLabel label = new JLabel("Arquivo selecionado: nenhum");

            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String path = NativeFileChooser.showDialog(frame);
                    if (path != null) {
                        label.setText("Arquivo selecionado: " + path);
                    } else {
                        label.setText("Nenhum arquivo selecionado");
                    }
                }
            });

            frame.add(btn);
            frame.add(label);
            frame.setVisible(true);
        });
    }
}

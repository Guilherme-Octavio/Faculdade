package POO.uiTutorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UITutorial extends JFrame{
    private JTextField textNome;
    private JTextField textSobrenome;
    private JButton buttonMostrar;
    private JPanel uiPanel;
    private JLabel labelNomeCompleto;

    public UITutorial(){
        setContentPane(uiPanel);
        setTitle("Tutorial");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        buttonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeCompleto = textNome.getText() + " " + textSobrenome.getText();
                labelNomeCompleto.setText(nomeCompleto);
                JOptionPane.showMessageDialog(uiPanel, nomeCompleto);
            }
        });
    }

    public static void main(String[] args) {
        new UITutorial();
    }
}


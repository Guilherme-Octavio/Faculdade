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
    private JCheckBox checkUCase;
    private JRadioButton radioMasculino;
    private JRadioButton radioFeminino;

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
                String sobrenome = (checkUCase.isSelected()) ? textSobrenome.getText().toUpperCase() : textSobrenome.getText();
                String nomeCompleto = textNome.getText() + " " + sobrenome;
                String message = nomeCompleto;
                labelNomeCompleto.setText(nomeCompleto);

                message = (radioMasculino.isSelected()) ? ", Masculino" : ", Feminino";
                JOptionPane.showMessageDialog(uiPanel, message);
            }
        });
    }

    public static void main(String[] args) {
        new UITutorial();
    }
}


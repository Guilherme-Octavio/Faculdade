package POO.ProjetoFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class InterfaceFila extends JFrame {
    private JComboBox<String> comboTipoFila;
    private JPanel uiPanel;
    private JButton adicionarButton;
    private JButton ButtonChamar;
    private JButton ButtonAtender;
    private JButton ButtonSenhas;

    private ControleDeFila fila = new ControleDeFila();
    public InterfaceFila(){
       setContentPane(uiPanel);
       setTitle("Tutorial");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(600, 300);
       setLocationRelativeTo(null);
       adicionarButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                String TipoFila = Objects.requireNonNull(comboTipoFila.getSelectedItem()).toString();
                String message = fila.inserirFila(TipoLista.valueOf(TipoFila));
                JOptionPane.showMessageDialog(uiPanel, message);
           }
       });
       setVisible(true);
        ButtonChamar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(uiPanel, fila.chamarProximaSenha());
            }
        });
        ButtonAtender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(uiPanel, fila.atenderProximaSenha());
            }
        });
        ButtonSenhas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(uiPanel, fila.);
            }
        });
        ButtonSenhas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(uiPanel, fila.listarTodasAsSenhas())  ;
            }
        });
    }
    public static void main(String[] args) {
        new InterfaceFila();
    }
}

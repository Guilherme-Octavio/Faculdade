package POO.ProjetoFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceFila extends JFrame {
    private JComboBox<String> comboTipoFila;
    private JPanel uiPanel;
    private JButton adicionarButton;
    private JTable tableFila;
    private JTextField textNome;
    private JButton ButtonChamar;
    private JButton ButtonAtender;
    private JTextField textSobrenome;

    public InterfaceFila(){
       setContentPane(uiPanel);
       setTitle("Tutorial");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(600, 300);
       setLocationRelativeTo(null);

       adicionarButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               // Adicionar nova linha à tabela quando o botão for clicado
               JOptionPane.showMessageDialog(uiPanel, ControleDeFila.filaNormal.inserir());
           }
       });
       setVisible(true);
   }

    public static void main(String[] args) {
        new InterfaceFila();
    }
}

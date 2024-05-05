package POO.ProjetoFinal;

import EstruturaDeDados1.Vetores.Teste;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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

   public InterfaceFila(){
       setContentPane(uiPanel);
       setTitle("Tutorial");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(300, 600);
       setLocationRelativeTo(null);
       DefaultTableModel model = new DefaultTableModel();

       model.addColumn("Teste");

       tableFila.setModel(model);

       adicionarButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               // Adicionar nova linha à tabela quando o botão for clicado
               String nome = textNome.getText();
               model.addRow(new Object[]{nome});
               // Limpar campo de texto após adicionar
               textNome.setText("");
           }
       });
       setVisible(true);
   }

    public static void main(String[] args) {
        new InterfaceFila();
    }
}

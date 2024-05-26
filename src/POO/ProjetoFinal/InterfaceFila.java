package POO.ProjetoFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class InterfaceFila extends JFrame {
    private JComboBox<String> comboTipoFila;
    private JPanel uiPanel;
    private JButton adicionarButton;
    private JTable tableFila;
    private JButton ButtonChamar;
    private JButton ButtonAtender;
    private JButton ButtonSenhas;

    private JScrollPane barraRolagem;

    private ControleDeFila fila = new ControleDeFila();
    public InterfaceFila(){
       setContentPane(uiPanel);
       setTitle("Tutorial");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(600, 300);
       setLocationRelativeTo(null);
       criaGrid();
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
    }
    private void criaGrid(){
        String [] Colunas = {"NORMAL", "VIP", "IDOSO", "PREFERENCIAL", "IDOSO80", "URGENTE"};
        Object [][] dados = {{001, 002, 003, 004}};

        tableFila = new JTable(dados, Colunas);
        barraRolagem = new JScrollPane();
        tableFila.add(barraRolagem);
    }
    public static void main(String[] args) {
        new InterfaceFila();
    }
}

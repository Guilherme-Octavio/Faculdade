package POO.ProjetoFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

public class InterfaceFila extends JFrame {
    private JComboBox<String> comboTipoFila;
    private JPanel uiPanel;
    private JButton adicionarButton;
    private JTable tableFila;
    private JTextField textNome;
    private JButton ButtonChamar;
    private JButton ButtonAtender;
    private JTextField textSobrenome;

    static final TipoLista urgente = TipoLista.URGENTE;
    static Fila filaUrgente = new Fila(urgente);

    static final TipoLista preferencial = TipoLista.PREFERENCIAL;
    static Fila filaPreferencial = new Fila(preferencial);

    static final TipoLista idoso80 = TipoLista.IDOSO80;
    static Fila filaIdoso80 = new Fila(idoso80);

    static final TipoLista idoso = TipoLista.IDOSO;
    static Fila filaIdoso = new Fila(idoso);

    static final TipoLista vip = TipoLista.VIP;
    static Fila filaVip = new Fila(vip);

    static final TipoLista normal = TipoLista.NORMAL;
    static Fila filaNormal = new Fila(normal);

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
                switch (Objects.requireNonNull(comboTipoFila.getSelectedItem()).toString()){
                    case ("VIP"):
                        try{
                            String res = filaVip.inserir();
                            JOptionPane.showMessageDialog(uiPanel, res);
                        } catch (NullPointerException x){
                            JOptionPane.showMessageDialog(uiPanel, x);
                        }
                        break;
                    case ("NORMAL"):
                        try {
                            String res = filaNormal.inserir();
                            JOptionPane.showMessageDialog(uiPanel, res);
                        } catch (NullPointerException x){
                            JOptionPane.showMessageDialog(uiPanel, x);
                        }
                        break;
                    case ("URGENTE"):
                        try {
                            String res = filaUrgente.inserir();
                            JOptionPane.showMessageDialog(uiPanel, res);
                        } catch (NullPointerException x){
                            JOptionPane.showMessageDialog(uiPanel, x);
                        }
                        break;
                    case ("IDOSO"):
                        try {
                            String res = filaIdoso.inserir();
                            JOptionPane.showMessageDialog(uiPanel, res);
                        } catch (NullPointerException x){
                            JOptionPane.showMessageDialog(uiPanel, x);
                        }
                        break;
                    case ("IDOSO80"):
                        try {
                            String res = filaIdoso80.inserir();
                            JOptionPane.showMessageDialog(uiPanel, res);
                        } catch (NullPointerException x) {
                            JOptionPane.showMessageDialog(uiPanel, x);
                        }
                        break;
                    case ("PREFERENCIAL"):
                        try {
                            String res = filaPreferencial.inserir();
                            JOptionPane.showMessageDialog(uiPanel, res);
                        } catch (NullPointerException x){
                            JOptionPane.showMessageDialog(uiPanel, x);
                        }
                        break;
                }
           }
       });
       setVisible(true);
        ButtonChamar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // metodo de chamar fila.chamar();
                // mas para isso tenho que fazer um jeito de organizar as filas
                // pois quando eu for chamar a senha, tenho que pegar a fila mais prioritaria
                
            }
        });
    }

    public static void main(String[] args) {
        new InterfaceFila();
    }
}

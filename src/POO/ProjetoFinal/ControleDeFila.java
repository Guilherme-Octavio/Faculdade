package POO.ProjetoFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ControleDeFila extends JFrame {
    private JComboBox<String> comboTipoFila;
    private JPanel uiPanel;
    private JButton adicionarButton;
    private JButton ButtonChamar;
    private JButton ButtonAtender;
    private JButton ButtonSenhas;

    private static final TipoLista[] ordemPrioridade = {
            TipoLista.URGENTE,
            TipoLista.IDOSO80,
            TipoLista.PREFERENCIAL,
            TipoLista.IDOSO,
            TipoLista.VIP,
            TipoLista.NORMAL
    };

    private static final Map<TipoLista, Fila> filas = new HashMap<>();

    private void criarFilas() {
        for (TipoLista tipo : TipoLista.values()) {
            filas.put(tipo, new Fila(tipo));
        }
    }
    public Fila getFilaPossuiSenhaChamada(){
        for (TipoLista tipo : ordemPrioridade){
            Fila fila = filas.get(tipo);
            if (!fila.fila.isEmpty()){
                for (Senha senha : fila.fila){
                    if (senha.getChamado()){
                        return fila;
                    }
                }
            }
        } return null;
    }
    private String chamarSenha(){
        for (TipoLista tipo : ordemPrioridade){
            Fila fila = filas.get(tipo);
            if (!fila.fila.isEmpty()){
                return fila.chamar();
            }
        } return null;
    }
    private boolean existeSenha(){
        for (TipoLista tipo : ordemPrioridade){
            Fila fila = filas.get(tipo);
            if (!fila.fila.isEmpty()){
                return true;
            }
        } return false;
    }
    private String atenderSenha() {
        for (TipoLista tipo : ordemPrioridade){
            Fila fila = filas.get(tipo);
            if (!fila.fila.isEmpty()){
                return fila.atender();
            }
        } return null;
    }
    public ControleDeFila(){
       setContentPane(uiPanel);
       setTitle("Tutorial");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(600, 300);
       setLocationRelativeTo(null);
       criarFilas();
       setVisible(true);
       adicionarButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               TipoLista tipo = TipoLista.valueOf(Objects.requireNonNull(comboTipoFila.getSelectedItem()).toString());
               Fila filaSelecionada = filas.get(tipo);
               if (filaSelecionada != null) {
                   JOptionPane.showMessageDialog(uiPanel, filaSelecionada.inserir());
               }
               else
                    JOptionPane.showMessageDialog(uiPanel,"Fila não encontrada: "+ tipo);
           }
       });
        ButtonChamar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!existeSenha())
                    JOptionPane.showMessageDialog(uiPanel, "Todas as filas estão vazias.");
                else{
                    Fila fila = getFilaPossuiSenhaChamada();
                    if (fila != null){
                        JOptionPane.showMessageDialog(uiPanel, fila.chamar());
                    }else{
                        JOptionPane.showMessageDialog(uiPanel, chamarSenha());
                    }
                }
            }
        });
        ButtonAtender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!existeSenha())
                    JOptionPane.showMessageDialog(uiPanel, "Todas as filas estão vazias.");
                else{
                    Fila fila = getFilaPossuiSenhaChamada();
                    if (fila != null){
                        JOptionPane.showMessageDialog(uiPanel, fila.atender());
                    }else{
                        JOptionPane.showMessageDialog(uiPanel, atenderSenha());
                    }
                }
            }
        });
        ButtonSenhas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder todasAsSenhas = new StringBuilder();
                for (TipoLista tipo : ordemPrioridade) {
                    Fila fila = filas.get(tipo);
                    if (fila != null) {
                        todasAsSenhas.append(fila.listar()).append("\n");
                    }
                }
                JOptionPane.showMessageDialog(uiPanel, todasAsSenhas.toString());
            }
        });
    }
    public static void main(String[] args) {
        new ControleDeFila();
    }
}

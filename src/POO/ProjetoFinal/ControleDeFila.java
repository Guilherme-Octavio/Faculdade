package POO.ProjetoFinal;

/*
 * Autores         Guilherme Octávio Silva Amorim
 *               Lucas Lotti
 *               Augusto Calhas
 * Data          15/03/2024
 * Disciplina    Programação Orientada a Objetos
 * Atividade     AVALIATIVA FINAL (3SI)
 */

import java.util.HashMap;
import java.util.Map;

public class ControleDeFila {
    private static final TipoLista[] ordemPrioridade = {
            TipoLista.URGENTE,
            TipoLista.IDOSO80,
            TipoLista.PREFERENCIAL,
            TipoLista.IDOSO,
            TipoLista.VIP,
            TipoLista.NORMAL
    };

    private static final Map<TipoLista, Fila> filas = new HashMap<>();

    public ControleDeFila() {
        criarFilas();
    }

    private void criarFilas() {
        for (TipoLista tipo : TipoLista.values()) {
            filas.put(tipo, new Fila(tipo));
        }
    }

    public String inserirFila(TipoLista tipo) {
        Fila filaSelecionada = filas.get(tipo);
        if (filaSelecionada != null) {
            return filaSelecionada.inserir();
        }
        return "Fila não encontrada: "+ tipo;
    }

    public void removerFila(TipoLista tipo) {
        Fila filaSelecionada = filas.get(tipo);
        if (filaSelecionada != null) {
            filaSelecionada.remover();
        }
    }

    private boolean existeSenha(){
        for (TipoLista tipo : ordemPrioridade){
            Fila fila = filas.get(tipo);
            if (!fila.fila.isEmpty()){
                return true;
            }
        } return false;
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

    public String chamarProximaSenha() {
        if (!existeSenha())
            return "Todas as filas estão vazias.";
        else{
            Fila fila = getFilaPossuiSenhaChamada();
            if (fila != null){
                return fila.chamar();
            }else{
                return chamarSenha();
            }
        }
    }

    private String chamarSenha(){
        for (TipoLista tipo : ordemPrioridade){
            Fila fila = filas.get(tipo);
            if (!fila.fila.isEmpty()){
                return fila.chamar();
            }
        } return null;
    }

    public String atenderProximaSenha() {
        if (!existeSenha())
            return "Todas as filas estão vazias.";
        else{
            Fila fila = getFilaPossuiSenhaChamada();
            if (fila != null){
                return fila.atender();
            }else{
                return atenderSenha();
            }
        }
    }

    private String atenderSenha() {
        for (TipoLista tipo : ordemPrioridade){
            Fila fila = filas.get(tipo);
            if (!fila.fila.isEmpty()){
                return fila.atender();
            }
        } return null;
    }

    public String listarSenhas(TipoLista tipo) {
        Fila filaSelecionada = filas.get(tipo);
        if (filaSelecionada != null) {
            return filaSelecionada.listar();
        }
        return "Fila " + tipo.tipo + " não encontrada.";
    }

    public void listarTodasAsSenhas() {
        for (TipoLista tipo : TipoLista.values()) {
            Fila fila = filas.get(tipo);
            if (fila != null) {
                System.out.println(fila.listar());
            }
        }
    }
}
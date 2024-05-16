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

    public String chamarProximaSenha() {
        for (TipoLista tipo : ordemPrioridade) {
            Fila fila = filas.get(tipo);
            if (fila != null && !fila.fila.isEmpty()) {
                String senhaChamada = fila.chamar();
                if (!senhaChamada.equals("Fila vazia. Não há senhas para chamar.")) {
                    return "Chamando senha da fila " + tipo.tipo + senhaChamada;
                }
            }
        }
        return "Todas as filas estão vazias.";
    }



    private String VerificaChamarDaFila(TipoLista tipo) {
        Fila fila = filas.get(tipo);
        if (fila != null && !fila.fila.isEmpty()) {
            for (Senha senha : fila.fila) {
                if (!senha.getChamado()) {
                    senha.setChamado();
                    return senha.retornarSenha();
                }
            }
        }
        return null;
    }

    public String atenderProximaSenha() {
        for (TipoLista tipo : ordemPrioridade) {
            String senhaAtendida = VerificaAtenderDaFila(tipo);
            if (senhaAtendida != null) {
                return "Atendendo senha da fila " + tipo.tipo + ": " + senhaAtendida;
            }
        }
        return "Todas as filas estão vazias.";
    }

    private String VerificaAtenderDaFila(TipoLista tipo) {
        Fila fila = filas.get(tipo);
        if (fila != null && !fila.fila.isEmpty()) {
            return fila.atender();
        }
        return null;
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
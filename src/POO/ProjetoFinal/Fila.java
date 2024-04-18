package POO.ProjetoFinal;

import java.util.LinkedList;

public class Fila extends EstrategiaFIFO {
    protected LinkedList<Senha> fila;
    private TipoLista tipoLista;

    public Fila(TipoLista tipoLista) {
        this.fila = new LinkedList<>();
        this.tipoLista = tipoLista;
    }

    @Override
    public String inserir() {
        try {
            fila.add(new Senha());
        } catch (Exception e) {
            return "" + e;
        }
        return "Senha criada com sucesso";
    }

    @Override
    public void remover() {
        // Implementação da remoção da fila (não fornecida)
    }

    @Override
    public String chamar() {
        // Implementação da chamada da próxima senha (não fornecida)
        return "";
    }

    @Override
    public String atender() {
        // Implementação do atendimento da próxima senha (não fornecida)
        return "";
    }

    @Override
    public String listar() {
        StringBuilder listaSenhas = new StringBuilder();
        listaSenhas.append("Lista de Senhas na Fila:\n");

        for (Senha senha : fila) {
            listaSenhas.append(senha.retornarSenha()).append("\n");
        }

        return listaSenhas.toString();
    }
}

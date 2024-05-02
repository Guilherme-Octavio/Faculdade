package POO.ProjetoFinal;

import java.util.LinkedList;

public class Fila extends EstrategiaFIFO {
    protected LinkedList<Senha> fila;
    private final TipoLista tipoLista;

    public Fila(TipoLista tipoLista) {
        this.fila = new LinkedList<>();
        this.tipoLista = tipoLista;

    }
    @Override
    public void inserir() {
        fila.add(new Senha());
    }
    @Override
    public void remover() {
        if (fila.getFirst() != null) {
            fila.removeLast();
        }
    }
    @Override
    public String chamar() {
        if (fila.getFirst() != null) {
            Senha senha = fila.getFirst();
            if (senha.getChamado()) {
                return senha.retornarSenha();
            }
            return fila.getFirst().toString();
        }
        return "Fila vazia";
    }
    @Override
    public String atender() {
        if (fila.getFirst() != null) {
            return tipoLista.name() + fila.getFirst();
        }
        return "Fila vazia";
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

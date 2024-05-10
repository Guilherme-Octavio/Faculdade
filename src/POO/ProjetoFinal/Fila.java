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
    public String inserir() {
        Senha novaSenha = new Senha();
        novaSenha.gerarSenha();
        fila.add(novaSenha);
        return "Senha: "+ tipoLista.tipo+ ' ' + novaSenha.retornarSenha();
    }
    @Override
    public void remover() {
        if (!fila.isEmpty()) {
            fila.removeLast(); // Remove o último elemento da fila
        }
    }
    @Override
    public String chamar() {
        if (!fila.isEmpty()){
            if (!fila.peek().getChamado()){
                fila.peek().setChamado();
                return fila.peek().retornarSenha();
            }
            return fila.peek().retornarSenha();
        } return "Fila vazia. Não há senhas para atender.";
    }
    @Override
    public String atender() {
        if (!fila.isEmpty()) {
            String SenhaRemovida = fila.poll().retornarSenha(); // Remove a próxima senha da fila
            return "Senha atendida com sucesso.";
        } else {
            return "Fila vazia. Não há senhas para atender.";
        }
    }
    @Override
    public String listar() {
        if (fila.peek() != null) {
            StringBuilder listaSenhas = new StringBuilder();
            listaSenhas.append("Lista de Senhas na Fila ").append(tipoLista.tipo).append(":\n");
            for (Senha f: fila) {
                listaSenhas.append(f.retornarSenha()).append("\n");
            }
            return listaSenhas.toString();
        } return "Fila vazia. Não há senhas para chamar.";
    }
}

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
        try{
            fila.add(new Senha());
            return "Senha Adicionada";
        } catch (Exception e){
            return "erro ao inserir senha: "+ e;
        }
    }
    @Override
    public String remover() {
        if (fila.peek() != null) {
            fila.removeLast(); // Remove o último elemento da fila
            return "Senha removida com sucesso.";
        } else {
            return "Fila vazia. Não há senhas para remover.";
        }
    }
    @Override
    public String chamar() {
        if (!fila.isEmpty()) {
            // Define a senha como chamada
            assert fila.peek() != null;
            return "SENHA: " + fila.peek().retornarSenha();
        } else {
            return "Fila vazia. Não há senhas para chamar.";
        }
    }
    @Override
    public String atender() {
        if (!fila.isEmpty()) {
            fila.poll(); // Remove a próxima senha da fila
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

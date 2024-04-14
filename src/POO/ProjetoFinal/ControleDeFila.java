package POO.ProjetoFinal;

import java.util.LinkedList;

public class ControleDeFila {
    static TipoLista preferencial = TipoLista.PREFERENCIAL;
    static Fila filaPreferencial = new Fila(preferencial);

    public static void main(String[] args) {
        filaPreferencial.inserir();
        System.out.println(ListaTipoFilaMaisSenha(filaPreferencial, preferencial));
    }

    static String ListaTipoFilaMaisSenha(Fila fila, TipoLista tipoLista) {
        Senha[] senhas = fila.fila.toArray(new Senha[0]);
        StringBuilder listaSenhas = new StringBuilder();
        listaSenhas.append("Lista de Senhas na Fila:\n");

        for (Senha senha : senhas) {
            listaSenhas.append(tipoLista.tipo).append(":").append(senha.retornarSenha()).append("\n");
        }

        return listaSenhas.toString();
    }
}


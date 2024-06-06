package EstruturaDeDados1.Revisao.P2;

public class RevisaoP2 {

/*

    Resolução do exercicio 2

enfileirar(10) 1
enfileirar(20) 2
enfileirar(30) 3
desenfileirar() 1
enfileirar(40) 4
desenfileirar() 2
desenfileirar() 3
enfileirar(50) 5
enfileirar(60) 6
enfileirar(70) 7
desenfileirar() 4

Resultado:
Fila{
    50,
    60,
    07
}
     */

}


// resolução do exercicio 1
class ListaEstatica {
    int[] valores;
    int tamanho;

    int somaValoresPositivos() {
        int res = 0;
        for (int i = 0; i < tamanho; i++) {
            if (valores[i] > 0){
                res += valores[i];
            }
        }
        return res;
    }
}




class Noh {
    int valor;
    Noh proximo;
}


class ListaLigada {
    Noh nohCabeca;
    int quantidadeElementos;

    // Resolucao do exercicio 3
    int[] retornaVetor() {
        if (quantidadeElementos == 0)
            return null;
        Noh percorre = nohCabeca;
        int index = 0;
        int[] valores = new int[quantidadeElementos];
        while (percorre != null){
            valores[index] = percorre.valor;
            percorre = percorre.proximo;
            index++;
        }
        return valores;
    }

    // Resolução do exercicio 4
    boolean existeValor(int procurado) {
        Noh percorre = nohCabeca;
        while (percorre != null){
            if (percorre.valor == procurado){
                return true;
            }
            percorre = percorre.proximo;
        }
        return false;
    }

}

package EstruturaDeDados1.ListaLigada;

import java.util.Objects;

public class ListaLigada {
     Noh raiz;

     boolean inserir(Pessoa p){
          Noh novoNoh = new Noh();
          novoNoh.pes = p;
          novoNoh.proximo = raiz;
          raiz = novoNoh;

          return true;
     }

     void imprimir(){
          Noh percorre = raiz;
          while (percorre != null){
               System.out.println(percorre.pes.nome);
               percorre = percorre.proximo;
          }
     }
     int contarNumeroNohs(){
          int res = 0;
          Noh percorre = raiz;
          while (percorre != null){
               ++res;
               percorre = percorre.proximo;
          } return res;
     }

     boolean existeNome(String nome){
          Noh percorre = raiz;
          while (percorre != null){
               if (Objects.equals(percorre.pes.nome, nome))
                    return true;
               percorre = percorre.proximo;
          }
          return false;
     }
}

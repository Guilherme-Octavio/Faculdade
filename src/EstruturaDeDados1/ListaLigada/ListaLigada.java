package EstruturaDeDados1.ListaLigada;

public class ListaLigada {
     Noh raiz;

     boolean inserir(Pessoa p){
          Noh novoNoh = new Noh();
          novoNoh.pes = p;
          novoNoh.proximo = raiz;
          raiz = novoNoh;

          return true;
     }
}

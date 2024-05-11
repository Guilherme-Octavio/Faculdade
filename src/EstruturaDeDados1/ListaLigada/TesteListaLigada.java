package EstruturaDeDados1.ListaLigada;

public class TesteListaLigada {

    public static void main(String[] args) {
        Pessoa a = new Pessoa("Guilherme1", 19);
        Pessoa b = new Pessoa("Guilherme2", 19);
        Pessoa c = new Pessoa("Guilherme3", 19);
        Pessoa d = new Pessoa("Guilherme4", 19);
        Pessoa j = new Pessoa("Guilherme5", 19);

        ListaLigada linkedlist = new ListaLigada();

        linkedlist.inserir(a);
        linkedlist.inserir(b);
        linkedlist.inserir(c);
        linkedlist.inserir(d);
        linkedlist.inserir(j);

        linkedlist.imprimir();
        System.out.println(linkedlist.contarNumeroNohs());
    }

}

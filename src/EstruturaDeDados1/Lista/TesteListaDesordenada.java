package EstruturaDeDados1.Lista;

public class TesteListaDesordenada {
    public static void main(String[] args) {
        ListaDesordenada lista = new ListaDesordenada(3);

        Pessoa a = new Pessoa("Guilherme", 19);
        Pessoa b = new Pessoa("Guilherme", 19);
        Pessoa c = new Pessoa("Guilherme", 19);
        Pessoa d = new Pessoa("Guilherme", 19);

        System.out.println(lista.inserir(a));
        System.out.println(lista.inserir(b));
        System.out.println(lista.inserir(c));
        System.out.println(lista.inserir(d));
    }
}

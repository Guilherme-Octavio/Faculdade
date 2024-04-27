package EstruturaDeDados1.Lista;

import java.util.Objects;

public class ListaDesordenada {
    Pessoa[] elementos;
    int quantidade = 0;

    public ListaDesordenada(int tamanhoMaximo){
        elementos = new Pessoa[tamanhoMaximo];
    }
    protected boolean temEspaco(){
        return quantidade < elementos.length;
    }
    public boolean inserir(Pessoa p) {
        if (temEspaco()){
            elementos[quantidade] = p;
            ++quantidade;
            return true;
        } return false;
    }
    String getLista() {
        String res = "";
        if (elementos != null && quantidade > 0) {
            for (int i = 0; i < quantidade - 1; i++) {
                res += ("{ Nome: " + elementos[i].nome + ", Idade: " + elementos[i].idade + "}, \n");
            }
            res += ("{ Nome: " + elementos[quantidade-1].nome + ", Idade: "+elementos[quantidade-1].idade+"}");
        } return res;
    }

    Pessoa consultar(String nomeprocurado){
        for (Pessoa e: elementos){
            if (e.nome.equals(nomeprocurado)){
                return e;
            }
        } return null;
    }

    void imprimir(){
        if (quantidade > 1) {
            for (int i = 0; i < quantidade - 1; i++) {
                System.out.print("{ " + elementos[i].nome + ", " + elementos[i].idade + "},");
            } System.out.print("{ "+elementos[elementos.length - 1 ]+", "+elementos[elementos.length-1].idade+" }");
        }// falta resolve o else
    }
}

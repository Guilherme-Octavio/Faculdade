package EstruturaDeDados1.Recursao;

public class contagemRegressiva{

    public static void main(String[] args){
        int n = 10;
        Contagem(n);
    }

    public static void Contagem(int n){
        if (n < 0){
            return;
        }
        System.out.println(n+", ");
        Contagem( n - 1);
    }
}
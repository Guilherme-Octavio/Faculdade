package EstruturaDeDados1.Vetores;

public class Teste {
    public static void main(String[] args) {
        Pessoa[] aluno = new Pessoa[2];

        aluno[0].Nome = "Guilherme";
        aluno[0].idade = 19;
        aluno[0].tel = new Telefone[1];
        aluno[0].tel[0].ddd = 123;
        aluno[0].tel[0].numero = "1234567890";
    }
    public static int MaisVelha(Pessoa[] p){
        int maior = 0;
        for (int i = 0; i < p.length; i++){
            if (p[i].idade > maior){
                maior = p[i].idade;
            }
        }
        return maior;
    }
}

package EstruturaDeDados1.Vetores;

public class Teste {
    public static void main(String[] args) {
        Pessoa[] aluno = new Pessoa[3];
        aluno[0] = new Pessoa();
        aluno[1] = new Pessoa();
        aluno[2] = new Pessoa();

        aluno[0].Nome = "Guilherme";
        aluno[0].idade = 19;

        aluno[1].Nome = "Gustavo";
        aluno[1].idade = 110;

        aluno[2].Nome = "Renatão";
        aluno[2].idade = 10;

        int idx = MaisVelha(aluno);
        Pessoa nomeMenor = PessoaMaisNova(aluno);
        listaPessoas(aluno);

        System.out.println(idx + " " + nomeMenor.Nome);
    }
    public static int MaisVelha(Pessoa[] p){
        int maior = 0;
        int indiceMaior = 0;
        for (int i = 0; i < p.length; i++){
            if (p[i].idade > maior){
                maior = p[i].idade;
                indiceMaior = i;
            }
        }
        return indiceMaior;
    }
    public static Pessoa PessoaMaisNova(Pessoa[] p){
        int menor = p[MaisVelha(p)].idade;
        int indeceMenor = 0;
        for (int i = 0; i < p.length; i++){
            if (p[i].idade < menor){
                menor = p[i].idade;
                indeceMenor = i;
            }
        }
        return p[indeceMenor];
    }
    public static void listaPessoas(Pessoa[] p){
        for (Pessoa pessoa : p) {
            System.out.println(pessoa.Nome + ", " + pessoa.idade);
        }
    }
}

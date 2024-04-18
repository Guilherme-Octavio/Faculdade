package EstruturaDeDados1.Revisao.P1;

import javax.xml.xpath.XPathExpressionException;
import java.lang.reflect.AnnotatedArrayType;

public class RevisaoP1 {

    public static void main(String[] args) {
        // Resolução - Exec 1
        System.out.print("Exec1: ");
        imprimeIntervalo(1, 10);
        System.out.println(' ');

        // Resolução - Exec 2
        System.out.println("Exec2: " +calculaExponenciacao(2, 2));

        //Resolução - Exec 3
        Aluno[] pessoa = new Aluno[4];
        pessoa[0] = new Aluno("Guilherme", 18);
        pessoa[1] = new Aluno("Andre", 21);
        pessoa[2] = new Aluno("Augusto", 18);
        pessoa[3] = new Aluno("Cristian", 30);


        System.out.print("Exec3: ");
        imprimeNomes(pessoa);
        System.out.println();

        assert pegaAlunoIdade(pessoa) != null;
        System.out.println("Exec4: "+pegaAlunoIdade(pessoa).nome);

    }
    // Exec 1
    static void imprimeIntervalo(int vInicial, int vFinal){
        for (int i = vInicial; i < vFinal; i++) {
            if (i % 2 == 0){
                System.out.print(i+", ");
            }
        }
    }

    // Exec 2
    static int calculaExponenciacao(int base, int expoente){
        int res = 0;
        if (expoente == 0){
            return 1;
        }
        return base * calculaExponenciacao(base, expoente - 1);
    }

    // Exec 3
    public static class Aluno{
        String nome;
        int idade;

        Aluno(String nome, int idade){
            this.nome  = nome;
            this.idade = idade;
        }
    }

    static void imprimeNomes(Aluno[] dados){
        for(Aluno p: dados){
            if (p.idade > 18){
                System.out.print(p.nome+' ');
            }
        }

    }

    // Exec 4

    public static Aluno pegaAlunoIdade(Aluno[] dados){
        for (Aluno p: dados){
            if (p.idade == 30){
                return p;
            }
        }
        return null;
    }
}


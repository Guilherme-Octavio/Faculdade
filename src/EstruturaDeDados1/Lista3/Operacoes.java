package EstruturaDeDados1.Lista3;

/**
 * 
 * Sua resolucao deverah ser feita nesta classe.
 *
 */
public class Operacoes {

	
	
	/**
	 * 
	 * Retorna uma String contendo os nomes dos alunos, separados 
	 * por virgula e entre chaves, no seguinte formato:
	 * 
	 * {NOME1, NOME2}
	 * 
	 * Os nomes devem ser colocados na ordem em que aparecem no vetor.
	 * 
	 * Se o vetor estiver vazio ou nulo, retorne {}.
	 * 
	 */
	static String imprimir(Aluno[] classe) {
        String result = "{}";
        String nomes = "";
		if (classe != null && classe.length > 0) {
            for (int i = 0; i < classe.length - 1; i++){
                nomes += classe[i].nome + ", ";
            }
            result = "{" + nomes + classe[classe.length - 1].nome + "}";
        }
        return result;
    }
	
	
	
	/**
	 * 
	 * Dado um aluno, calcula a media das notas dele e retorna 
	 * este valor encontrado.
	 * 
	 */
	static double calcularMedia(Aluno alu) {
		double media = 0;
		if (alu.notas.length > 0) {


			for (int i = 0; i < alu.notas.length; i++) {
				media += alu.notas[i];
			}
			return media / alu.notas.length;
		}
		return 0;
	}
	

	
	/**
	 * 
	 * Dado um vetor representando os alunos de uma sala, 
	 * calcula a media de cada aluno e encontra o aluno de 
	 * maior media geral. Este aluno (INTEIRO) deve ser 
	 * retornado.
	 * 
	 */
	static Aluno encontrarMaiorMedia(Aluno[] classe) {
			double maiorMedia = 0;
			int maiorMediaIdx = 0;
			double media;
			if (classe != null && classe.length > 0) {
				for (int i = 0; i < classe.length; i++) {
					media = calcularMedia(classe[i]);
					if (maiorMedia < media) {
						maiorMedia = media;
						maiorMediaIdx = i;
					}
				}return classe[maiorMediaIdx];
			}return null;
	}
	
	
	
	/**
	 * 
	 * Verifica se um determinado RA existe numa classe de diversos 
	 * alunos. Caso exista, retorna true, senao, retorna false.
	 * 
	 * Se o vetor estiver vazio ou nulo, retorna false.
	 * 
	 */
	static boolean existeAlunoRA(Aluno[] classe, int ra) {
		for (Aluno c: classe){
			if (c.ra == ra){
				return true;
			}
		}return false;
	}
	
	
	
	/**
	 * 
	 * Dado um vetor de alunos, representando uma classe e uma 
	 * certa nota de corte, retorna os nomes de todos os alunos 
	 * que teriam sido aprovados baseado em suas medias.
	 * 
	 * Seguir a formatacao da funcao imprimir.
	 * 
	 */
	static String aprovados(Aluno[] classe, double notaCorte) {
		StringBuilder aprovados = new StringBuilder();
		if (classe != null && classe.length > 0) {
			for (Aluno aluno : classe) {
				if (calcularMedia(aluno) >= notaCorte) {
					aprovados.append(aluno.nome).append(", ");
				}
			}
			if (!aprovados.isEmpty()) {
				// Remove a vírgula e o espaço após o último nome
				aprovados.delete(aprovados.length() - 2, aprovados.length());
			}
		}
		return "{" + aprovados + "}";
	}

}

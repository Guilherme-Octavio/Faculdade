package EstruturaDeDados1.Lista1;

import java.util.Scanner;

public class Lista1 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		// PROBLEMA 1
		//System.out.println(problema1(userInput));
		
		//chamando problema2
		//System.out.println(problema2(userInput));
		
		//chamando problema3
		System.out.println(problema3(userInput));
	}
	
	public static int problema1(Scanner userInput){
		// Aloquei 4 de espaço pois no execercico ele só vai até quatro, 
		// mas se quiser é só utilizar um input para descobrir o tamanho do vetor que o usuario quer.
		int vet[] = new int[4];
		int total = 1;
		// Preencher o vetor
		for (int i = 0; i < vet.length; ++i){
			System.out.println("vetor "+ i + "/" + vet.length);
			vet[i] = userInput.nextInt();
		}
		// Pega o produto do vetor
		for (int j = 0; j < vet.length; ++j){
			if (vet[j] > 0){
				total *= vet[j];
			}
		}
		return total;
	}
	// PROBLEMA 2
	public static boolean problema2(Scanner userInput){
		int[] vet1; 
		int[] vet2;
		System.out.println("Qual o tamanho do primeiro vetor");
		vet1 = new int[userInput.nextInt()];
		System.out.println("Qual o tamanho do segundo vetor");
		vet2 = new int[userInput.nextInt()];
		
		if(vet1.length != vet2.length){
			return false;
		}
		
		System.out.println("preenchendo o primeiro vetor");
		for (int i = 0; i < vet1.length; ++i){
			System.out.println("vetor "+ i + "/" + vet1.length);
			vet1[i] = userInput.nextInt();
		}
		System.out.println("preenchendo o segundo vetor");
		for (int i = 0; i < vet2.length; ++i){
			System.out.println("vetor "+ i + "/" + vet2.length);
			vet2[i] = userInput.nextInt();
		}
		for (int i = 0, j = 0; i < vet1.length && j < vet2.length; ++i, ++j) {
			if (vet1[i] != vet2[j]) {
				return false;
			}
		}
		return true;
		
	}
	// PROBLEMA3
	public static boolean problema3(Scanner userInput){
		int[] vet;
		System.out.println("Qual o tamanho do vetor");
		vet = new int[userInput.nextInt()];
		for (int i = 0; i < vet.length; ++i){
			System.out.println("vetor "+ i + "/" + vet.length);
			vet[i] = userInput.nextInt();
		}
		return estaOrdenado(vet);
	}
	
    public static boolean estaOrdenado(int[] vet) {
        int tamanho = vet.length;

        for (int i = 1; i < tamanho; i++) {
			// aqui ele verifica o vetor em ordem crescente e decrescente
            if (vet[i - 1] > vet[i] || vet[i - 1] < vet[i]) {
                return false;
            }
        }
        return true;
    }

}
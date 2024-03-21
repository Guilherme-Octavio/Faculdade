package EstruturaDeDados1.Lista2;

public class Lista2 {
    public static void main(String[] args) {
        // Problema 1
        System.out.println(isNumero("123456")); // true
        System.out.println(isNumero("123456A"));// false
        System.out.println(isNumero("A983B"));  // false
        
        // Problema 2
        System.out.println(12); //1100
        System.out.println(15); //1111
        System.out.println(91); //1011011

        // Problema 3
        System.out.println(imprimeSeqCollatz(6));
        System.out.println(imprimeSeqCollatz(10));
        System.out.println(imprimeSeqCollatz(-100));
        System.out.println(imprimeSeqCollatz(100));


    }
    // problema 1
    static boolean isNumero(String str){
        if (str.isEmpty()){
            return true;
        }
        else if (str.charAt(0) < '0' || str.charAt(0) > '9'){
            return false;
        }
        return isNumero(str.substring(1));
    }

    // problema 2

    static int baseBinaria(int n){
        if (n == 0){
            return n;
        } else if (n == 1){
            return n;
        }
        int quociente = n / 2;
        int resto = n % 2;
        return baseBinaria(quociente) + resto;
    }

    // problema 3

    static int imprimeSeqCollatz(int n){
        if (n <= 1){
            return n;
        }
        System.out.print(n + ", ");
        if (n % 2 == 0){
            return imprimeSeqCollatz(n / 2);
        }else{
            return imprimeSeqCollatz(n * 3 + 1);
        }
        
    }
}

package EstruturaDeDados1.Recursao;

public class palindromo {
    public static void main(String[] args) {
        String palavra = "Ovo";
        System.out.println(isPalindromo(palavra));
    }
    public static boolean isPalindromo(String str)
    {
        // definir dados
        boolean result = false;
 
        // chama metodo recursivo
        result = isPalindromo( str.replaceAll(" ", "").toLowerCase(), 0 );
 
        return( result );
    }// end isPalindromo()

    public static boolean isPalindromo(String str, int i)
    {
        // definir dados
        boolean result = true;
        int meio = str.length( )/2;
        char prim = ' ';
        char ult  = ' ';
         
        prim = str.charAt( i );
        ult  = str.charAt( str.length( ) - 1 - i );
 
        if( prim != ult )
        {
            result = false;
        }
        else
        {       
            if( i < meio )
            {
                result = isPalindromo( str, i + 1 );
            }// end if
        }// end if
 
        return( result );
        }
}

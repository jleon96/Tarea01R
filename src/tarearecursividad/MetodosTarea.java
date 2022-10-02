package tarearecursividad;

/**
 *
 * @author Juan Leon
 */
public class MetodosTarea {
    
    
    
    public static char[] sacarVocales(int i, char[] array) {
        if (i == array.length) {
            return array;
        } else {
            char aux = array[i];
            if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u'
                    || aux == 'A' || aux == 'E' || aux == 'I' || aux == 'O' || aux == 'U') {
                array[i] = ' ';
            }
            return sacarVocales(++i, array);
        }
    }
    
    public  int sumaRecursiva (int num){ // aca se recibe el numero
        int res;
        if (num == 1){ //este es el caso base, hasta que no se cumpla
                        //el programa no termina
            return 1;
        }else{
            res =  num + sumaRecursiva(num-1);
        }
        return res;
    }
    
    public static  boolean numeroBinario(int num)
    {

        // Return false if a number
        // is either 0 or 1 or a
        // negative number
        if (num == 0 || num == 1
            || num < 0) {
            return false;
        }

        // Get the rightmost digit of
        // the number with the help
        // of remainder '%' operator
        // by dividing it with 10
        while (num != 0) {

            // If the digit is greater
            // than 1 return false
            if (num % 10 > 1) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
    public int Factorial(int parametro){
        if(parametro >0){
            int valor = parametro * Factorial (parametro - 1);
            return valor;
        }
        return 1;
    }
}

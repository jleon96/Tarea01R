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

    public int sumaRecursiva(int num) { // aca se recibe el numero
        int res;
        if (num == 1) { //este es el caso base, hasta que no se cumpla
            //el programa no termina
            return 1;
        } else {
            res = num + sumaRecursiva(num - 1);
        }
        return res;
    }

    public static boolean numeroBinario(int num) {

        // Devuelve falso si es un número
        // es 0 o 1 o un
        // numero negativo
        if (num == 0 || num == 1
                || num < 0) {
            return false;
        }

         // Obtener el dígito más a la derecha de
        // el número con la ayuda
        // del resto operador '%'
        // al dividirlo por 10
        while (num != 0) {

         
            // Si el digito es mayor
            // que 1 devuelve falso
            if (num % 10 > 1) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }

    public int Factorial(int parametro) {
        if (parametro > 0) {
            int valor = parametro * Factorial(parametro - 1);
            return valor;
        }
        return 1;
    }
}

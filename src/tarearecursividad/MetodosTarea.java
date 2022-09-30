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
    
    
    public static int sumaRecursiva (int num){ // aca se recibe el numero
        int res;
        if (num == 1){ //este es el caso base, hasta que no se cumpla
                        //el programa no termina
            return 1;
        }else{
            res =  num + sumaRecursiva(num-1);
        }
        return res;
    }
}

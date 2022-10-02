/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarearecursividad;

import java.util.Scanner;
import static tarearecursividad.MetodosTarea.numeroBinario;
import static tarearecursividad.MetodosTarea.sacarVocales;
//import static tarearecursividad.MetodosTarea.sumaRecursiva;

/**
 *9
 * @author Juan Leon
 */
public class TareaRecursividad {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        MetodosTarea recursividad = new MetodosTarea();
        // recursividad.sumaRecursiva(8);
//        System.out.println("========= Eliminar Vocales ========");
//        System.out.print("Nombre ");
//        String cad = entrada.next();
//        char[] array = cad.toCharArray();
//        array = sacarVocales(0, array);
//        String string = String.valueOf(array);
//        System.out.println("Resultado de la letra eliminando las vocales: " + string);

        System.out.println("========= Suma Recursiva ========");
//        int n = 9;
//        int resultado = sumaRecursiva(n);
//        System.out.println(resultado);
        System.out.print("Introduce el Numero para la suma recursiva: ");
        System.out.println("El resultado de la suma usando recursividad es: " 
                            + recursividad.sumaRecursiva(entrada.nextInt()));
//
//        System.out.println("========= Verifica si el numero es binario ========");
//        System.out.println("========= True si el numero es binario o false si no. ========");
//        int numero = 1120;
//        System.out.println(numeroBinario(numero));

//        System.out.println("========= Factorial ========");
//        System.out.print("Introduce el Numero para calcular el factorial: ");
//        int num = entrada.nextInt();
//        int factorial = recursividad.Factorial(num);
//        System.out.println("El factorial de " + num + " es " + factorial);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarearecursividad;

import static tarearecursividad.MetodosTarea.sacarVocales;
import static tarearecursividad.MetodosTarea.sumaRecursiva;

/**
 *
 * @author Juan Leon
 */
public class TareaRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //  MetodosTarea metodosTarea = new MetodosTarea();
        
//        String cad = "Juan Diego";
//        char[] array = cad.toCharArray();
//        array = sacarVocales(0, array);
//        String string = String.valueOf(array);
//        System.out.println("Resultado de la letra eliminando las vocales: " + string);
        
        int n = 9;
        int resultado = sumaRecursiva(n);
        System.out.println(resultado);
        
        
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author Fabricio Laureano
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int suma;
        //int resta;
        //int division;
       // int multiplicacion;
        int resultado;
        int opcion;
        int n1;
        int n2;
        
        Scanner entrada = new Scanner (System.in);
        
        // TODO code application logic here
        System.out.println("Que operacion desea hacer?");
        System.out.println("Ingrese 1. Para sumar");
        System.out.println("Ingrese 2. Para restar");
        System.out.println("Ingrese 3. Para dividir");
        System.out.println("Ingrese 4. Para multiplicar");

        System.out.println("Ingrese el primer numero");
        n1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        n2= entrada.nextInt();
        
        System.out.println("Que opcion desea hacer?");
        opcion= entrada.nextInt();
        
        switch (opcion)
        {   
            
            case 1: 
                resultado = n1+n2;
                System.out.println("El resultado de la suma es: " + resultado);
                
            break;
                    
            case 2: 
                resultado = n1-n2;
                System.out.println("El resultado de la resta es: " + resultado);
            break;
            
            case 3: 
                resultado = n1/n2;
                System.out.println("El resultado de la division es: " +resultado);
            break;
            
            case 4: 
                resultado= n1*n2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
            break;
            
        
                    
        }           

    }
    
}

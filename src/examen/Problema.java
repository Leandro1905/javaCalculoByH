/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Problema {
    
    public void ejecutar() {
        Scanner teclado = new Scanner(System.in);
        String tipo = "", base = "", altura = "";
        
        
        do {
            System.out.println("INGRESE FIGURA");
            tipo = teclado.nextLine();
            if(tipo.equalsIgnoreCase("TRIANGULO")) {
                System.out.println("INGRESE BASE");
                base = teclado.nextLine();
                System.out.println("INGRESE ALTURA");
                altura = teclado.nextLine();
                try {
                    Triangulo t = new Triangulo(Integer.parseInt(base), Integer.parseInt(altura));
                    System.out.println(t.toString());
                }catch(Exception ex) {
                    System.out.println("VERIFIQUE VALORES");
                }
             
            }else {
                if(tipo.equalsIgnoreCase("RECTANGULO")) {
                    System.out.println("INGRESE BASE");
                    base = teclado.nextLine();
                    System.out.println("INGRESE ALTURA");
                    altura = teclado.nextLine();
                    
                    try {
                        Rectangulo r = new Rectangulo(Integer.parseInt(base), Integer.parseInt(altura));
                        System.out.println(r.toString());
                    }catch(Exception ex) {
                        System.out.println("VERIFIQUE VALORES");
                    }
                 
                }
            }
            
        }while(tipo.length()>0);
        
    }
}

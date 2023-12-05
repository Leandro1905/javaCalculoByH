/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Alumnos
 */
public class Triangulo extends Figura {
    
    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        super(base, altura);
    }
    
    public float superficie() {
        return base * altura / 2;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LA SUPERFICIE DE UN TRIANGULO\n");
        sb.append("DE BASE ");
        sb.append(base);
        sb.append("\nY ALTURA ");
        sb.append(altura);
        sb.append("\nES ");
        sb.append(superficie());
        
        return sb.toString();
        
    }
}

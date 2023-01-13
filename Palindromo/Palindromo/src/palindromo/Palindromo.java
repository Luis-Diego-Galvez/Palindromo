/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author LuisD
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner cd = new Scanner(System.in);
        
        while (true) {
            System.out.println("Ingrese una palabra:");
            String palindromo = "", palabra = cd.nextLine();
            for(int i=1; i <= palabra.length(); i++) {
                palindromo += palabra.charAt(palabra.length() - i);
            }
            if (palindromo.trim().toUpperCase().equals(palabra.trim().toUpperCase())) {
                System.out.println("Es un palindromo");
            }else System.out.println("No se encontro un palindromo");
            
            System.out.println("¿Continuar? Y/N");
            String ans = cd.nextLine();
            if (ans.toUpperCase().equals("N")) {
                break;
            }
        }
        
    }
    
}

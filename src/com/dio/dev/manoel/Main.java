package com.dio.dev.manoel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro:");
               int parametroUm = leia.nextInt();
        
        System.out.println("Digite o segundo parâmetro:");
               int parametroDois = leia.nextInt();
        
        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("O primeiro valor deve ser menor que o segundo!");
        } finally {
            leia.close(); 
        }
    }
    
    static void contar(int parametroUm, int parametroDois) {
    	
        if (parametroUm > parametroDois) {
            throw new IllegalArgumentException("O primeiro valor deve ser menor que o segundo!");
        }
        
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}

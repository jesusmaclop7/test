package com.jesus.macias.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test7_Permutaciones2 {
    public static void main(String[] args) {
    	
    	 Scanner input = new Scanner(System.in);  
         System.out.println("Introduzca cadena");
         String valor = input.nextLine();  
         input.close();
         System.out.println("Tamano:"+valor.length());
         if(valor.length()>50) {// Aquí cambiar valor maximo
         System.out.println("La cadena es maximo 50 caracteres");
         }else {
        	 ArrayList<String> permutaciones = todasPermutaciones(valor);
        	 Collections.sort(permutaciones);
        	 iterarLista(permutaciones);
         }

    }

    public static ArrayList<String> todasPermutaciones(String cadena) {

        if (cadena.length()==0){
            ArrayList<String> resultado= new ArrayList<>();
            resultado.add("");
            return resultado;
        }
        char c = cadena.charAt(0);
        String x = cadena.substring(1);

        ArrayList<String> resultado = todasPermutaciones(x);
        ArrayList<String> listaFinal = new ArrayList<>();
        for (int i = 0; i < resultado.size(); i++) {
            String s = resultado.get(i);
            for (int j = 0; j <= s.length(); j++) {
                String newString = s.substring(0, j) + c + s.substring(j);
                listaFinal.add(newString);
            }
        }
        return listaFinal;
    }
    
     static void iterarLista(ArrayList<String> lista) {
    	 for(String st : lista) 
			 System.out.println(st);
    }
}
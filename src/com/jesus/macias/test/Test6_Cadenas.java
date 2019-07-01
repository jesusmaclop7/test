package com.jesus.macias.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test6_Cadenas {

	public static void main(String[] args) {
		String[] cadenas = llenarElArreglo();
		Scanner input = new Scanner(System.in);  
        System.out.println("Insertar la nueva cadena a buscar");
        String valor = input.nextLine();  
        input.close();
		iterarArreglo(cadenas, valor);
       
    }
	
	static String[] llenarElArreglo() {
		String[] cadena = new String[22];
		 cadena[0] = "chuy";
		 cadena[1] = "chuy2";
		 cadena[2] = "chuy3";
		 cadena[3] = "chuy4";
		 cadena[4] = "chuy5";
		 cadena[5] = "";
		 cadena[6] = "";
		 cadena[7] = "chuy6";
		 cadena[8] = "chuy7";
		 cadena[9] = "chuy8";
		 cadena[10] = "chuy9";
		 cadena[11] = "jesus10";
		 cadena[12] = "";
		 cadena[13] = "jesus11";
		 cadena[14] = "jesus12";
		 cadena[15] = "";
		 cadena[16] = "jesus13";
		 cadena[17] = "jesus14";
		 cadena[18] = "";
		 cadena[19] = "jesus15";
		 cadena[20] = "jesus16";
		 cadena[21] = "jesus17";
		return cadena;
	}
	
	 static void iterarArreglo(String[] s, String x){
	        int size = s.length;
	        List<Integer> posiciones = new ArrayList<Integer>();
	        for (int i=0; i<size; i++)
	        {
	        	if (x.equals(s[i].toString())) 
	        		posiciones.add(i);
	        }
	        imprimirResultado(posiciones);
	    }
	 
	 static void imprimirResultado(List<Integer> posiciones) {
		 if (posiciones.size()==0)
			 System.out.println("Esa cadena no ha sido encontrada");
		 else
		 for(Integer ie : posiciones) 
			 System.out.println("La posicion es: "+ie);
		 
	 }
}

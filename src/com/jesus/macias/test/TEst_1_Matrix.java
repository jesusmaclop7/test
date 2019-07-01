package com.jesus.macias.test;

import java.util.Scanner;
import java.util.*;

public class TEst_1_Matrix {

	public static void main(String[] args){
	
		Scanner escaner = new Scanner(System.in);
	
		int c, r;
		System.out.println("Dame el numero de renglones \n");
		r= escaner.nextInt();
		
		System.out.println("Dame el numero de columnas \n");
		c= escaner.nextInt();
		
		System.out.println("numero de rengolones : " + r + " Numero de columnas : " + c + "\n" );
	
		int matriz [][] = new int [r][c];
		int mattraspu [][] = new int [c][r];
	
		for(int re=0; re<r; re++){
			for(int col=0; col<c; col++){
				System.out.println("Dame el valor para la posicion del renglon : [ "+ re+" ] y columna [ " + col + " ] \n");
				   matriz[re][col] = escaner.nextInt();
			}	
		}
		
		for(int re=0; re<c; re++){
			for(int col=0; col<r; col++){
				
				mattraspu[col][re]=  matriz[re][col];
			}	
		}
		
		System.out.println("A imprimir ahora la matriz ya traspuesta \n");
		
		for(int re=0; re<r; re++){
			for(int col=0; col<c; col++){
				System.out.printf("%d\t", mattraspu[re][col]);
			}
			System.out.println("");
		}
		
		
		
	}
	
}

package com.jesus.macias.test;

import java.util.Scanner;

public class Test3_MatrizCeros {

	public static void main(String[] args){
		int cero= 0;
		int x,y,ceros;
		Scanner escaner = new Scanner(System.in);
	
		int c, r;
		System.out.println("Dame el numero de renglones \n");
		r= escaner.nextInt();
		
		System.out.println("Dame el numero de columnas \n");
		c= escaner.nextInt();
		
		
		System.out.println("numero de renglones : " + r + " Numero de columnas : " + c + "\n" );
		
		
		int matriz [][] = new int [r][c];
		int matceros [][] = new int [r][c];
		
		
		for(int re=0; re<r; re++){
			for(int col=0; col<c; col++){
				System.out.println("Dame el valor para la posicion del renglon : [ "+ re+" ] y columna [ " + col + " ] \n");
				   matriz[re][col] = escaner.nextInt();
			}	
		}
		
		escaner.close();
		
		System.out.println("A imprimir ahora la matriz original sin ceros \n");
		
		for(int re=0; re<r; re++){
			for(int col=0; col<c; col++){
				System.out.printf("%d\t", matriz[re][col]);
			}
			System.out.println(" ");
		}
		
		System.out.println("\n ahora la nueva matriz sin modificar \n\n");
		//copiar matriz a nueva
		for(int re=0; re<r; re++){
			for(int col=0; col<c; col++){
				matceros[re][col]= matriz[re][col];
				System.out.printf("%d\t", matceros[re][col]);
				
			}
			System.out.println(" ");
			
		}
		//copiar matriz a nueva
		
		
		for(int re=0; re<r; re++){
			
			for(int col=0; col<c; col++){
				
				if(matriz[re][col] == 0){
						System.out.println("posicon del 0 detectado: "+ re +","+col +"\n");
						int aux = re;  //1
						int auxcol= col;  //1
						for(int p=0; p<r; p++){  // 0->2
							matceros[aux][p] = 0;   // 1,0 , 1,1 ,  1,2
							
							System.out.println("POSICION A PASAR A CERO : "+aux+","+p+" en renglones \n" );
						}
						for(int q=0; q<c; q++){
							matceros[q][auxcol] = 0;
							
						System.out.println("POSICION A PASAR A CERO : "+q+","+auxcol+" en columnas \n" );
					}
				}
					  
					//matceros[re][col]= matriz[re][col];   aqui me fallaba me la sobreescribia con valores oiginales, tarde mucho en detectar esto con prueba y error 
					//System.out.println("rellena normal sin cero posicion "+re+","+col+" \n");				
				
				
			}				
			
		} 
		
		System.out.println("A imprimir ahora la matriz nueva con ceros \n");
		
		for(int rei=0; rei<r; rei++){
			for(int col=0; col<c; col++){
				System.out.printf("%d\t", matceros[rei][col]);
			}
			System.out.println(" ");
		}
		
		
		
	
	}	
}

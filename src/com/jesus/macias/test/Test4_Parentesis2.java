package com.jesus.macias.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test4_Parentesis2 {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);  
        System.out.println("Introduzca valor");

        int val = input.nextInt();  
        input.close();
        System.out.println("Valor: " + val);
    	List<String> parentesis= new ArrayList<String>();
        parentesis=llenarLista(val);
    	imprimirParentesis(parentesis);
    }

    public static List<String> llenarLista(int n){
    	System.out.println("....."+n);
        List<String> l = new ArrayList<String>();
        if(n==1) {
            l.add("()");
            return l;
        }else {
        for(String st : llenarLista(n-1)) {
            l.add(st+"()");
            l.add("("+st+")");
            if(!(st+"()").equals("()"+st)) {
                l.add("()"+st);
            }
        }
        System.out.println("Lista tamano: "+l.size());
        return l;
        }
    }
    
    static void imprimirParentesis(List<String> lista) {
    	for(String v: lista) {
    		System.out.println(v);
    	}
    }

}
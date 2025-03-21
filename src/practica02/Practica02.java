/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica02;

/**
 *
 * @author evare
 */
public class Practica02 {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("Desde poo");
        
        System.out.println("###########if##########");
        
        int a;
        a = 15;
        int b = 10;
        int c = a +b;
        if (a < b) {
            System.out.println("a menor que b");
        } else if(a>b) {
            System.out.println("a mayor que b");
        } else {
            System.out.println("a igual que b");
        }
        
        System.out.println("###########if##########");
        
        if (menor(a,b)) {
            System.out.println("A menor que B");
        } else {
            System.out.println("A no es menor que B");
        }
        
        System.out.println("###########if##########");
        
        if (menorv2(a,b)) {
            System.out.println("A resulta menor que B");
        } else {
            System.out.println("A resulta mayor que B");
        }
        
        System.out.println("###########if##########");
        
        System.out.println(suma(a,b));
        
        System.out.println("###########if##########");
        
        System.out.println(sumav2(a,b));
        
        System.out.println("###########switch##########");
        
        char vocal = 'a';
        switch(vocal) {
            case 'a' -> System.out.println("Seleccion vocal a");
            case 'e' -> System.out.println("Seleccion vocal e");
            case 'i' -> System.out.println("Seleccion vocal i");
            case 'o' -> System.out.println("Seleccion vocal o");
            case 'u' -> System.out.println("Seleccion vocal u");
            default -> System.out.println("No es una vocal");
        
        }
        
        System.out.println("###########while##########");
        
        int n = 0;
        while (n < 10) {
            System.out.println("Contando hacia arriba n = " + n);
            n++;
        }
        System.out.println("n="+n);
        while (n > 0) {
            System.out.println("Contantando hacia abajo n = " + n);
            n--;
        }
        System.out.println("n="+n);
        
        System.out.println("###########do-while##########");
        
        do {
            System.out.println("contando hacia abajo n = "+n);
            n++;
        } while (n <10);
        
        System.out.println("do while n = " + n);
        
        System.out.println("###########for##########");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba i = "+i);
        }
        
        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo i ="+i);            
        }
        
        System.out.println("###########for arreglo##########");
        int[] miArreglo = {1,2,3,4,5};
        int f = miArreglo.length;
        System.out.println("Num Elementos en arreglo = "+f);
        
        int[] miArreglo2 = new int[10];
        System.out.println("Valores iniciales");
        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println(miArreglo2[i]);
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i;
        }
        System.out.println("arreglos con nuevos valores");
        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println(miArreglo2[i]);
            
        }
        
        System.out.println("###########for each######");
        
        for (int temp : miArreglo2) {
            System.out.println(temp);
        }
        for (int i : miArreglo2) {
            System.out.println("for each element = "+i);
        }
    }
      
    private static boolean menor(int a, int b) {
        if (a < b) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean menorv2(int a, int b) {
        return a<b;
    }

    private static int suma(int a, int b) {
        int c = a + b;
        return c;
    }

    private static int sumav2(int a, int b) {
        return a+b;
    }
    
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Reinaldo Q
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
    
        
//    A). Declarar un arreglo por cada uno de los tipos de datos primitivos.
//    B). Definir cada uno de los arreglos anteriores con tamaño de 5 elementos
        byte[] byteArray = new byte[5];
        Byte[] ByteArray = new Byte[5];
        char[] charArray = new char[5];
        Character[] CharacterArray = new Character[5];
        short[] shortArray = new short[5];
        Short[] ShortArray = new Short[5];
        int[] intArray = new int[5];
        Integer[] IntegerArray = new Integer[5];
        long[] longArray = new long[5];
        Long[] LongArray = new Long[5];
        float[] floatArray = new float[5];
        Float[] FloatArray = new Float[5];
        double[] doubleArray = new double[5];
        Double[] DoubleArray = new Double[5];
        Object[] ObjectArray = new Object[5];
        String[] StringArray = new String[5];


//	C). Asignar valores a cada arreglo usando la notación de posiciones o índices
for (int i = 0; i < 5; i++) {
            byteArray[i] = (byte) (i+1);
            ByteArray[i] = (byte) (i+1);
            charArray[i] = (char) (i+65);
            CharacterArray[i] = (char) (i+65);
            shortArray[i] = (short) (i+1);
            ShortArray[i] = (short) (i+1);
            intArray[i] = i+1;
            IntegerArray[i] = i+1;
            longArray[i] = i+1;
            LongArray[i] = i+1L;
            floatArray[i] = i+0.5f;
            FloatArray[i] = i+0.5f;
            doubleArray[i] = i+0.5;
            DoubleArray[i] = i+0.5;
            ObjectArray[i] = new Object();
            StringArray[i] = "elemento " + (i+1);
}

//     D. Mostrar los valores de cada Arreglo.
 System.out.println("byteArray: " + Arrays.toString(byteArray));
        System.out.println("ByteArray: " + Arrays.toString(ByteArray));
        System.out.println("charArray: " + Arrays.toString(charArray));
        System.out.println("CharacterArray: " + Arrays.toString(CharacterArray));
        System.out.println("shortArray: " + Arrays.toString(shortArray));
        System.out.println("ShortArray: " + Arrays.toString(ShortArray));
        System.out.println("intArray: " + Arrays.toString(intArray));
        System.out.println("IntegerArray: " + Arrays.toString(IntegerArray));
        System.out.println("longArray: " + Arrays.toString(longArray));
        System.out.println("LongArray: " + Arrays.toString(LongArray));
        System.out.println("floatArray: " + Arrays.toString(floatArray));
        System.out.println("FloatArray: " + Arrays.toString(FloatArray));
        System.out.println("doubleArray: " + Arrays.toString(doubleArray));
        System.out.println("DoubleArray: " + Arrays.toString(DoubleArray));
        System.out.println("ObjectArray: " + Arrays.toString(ObjectArray));
        System.out.println("StringArray: " + Arrays.toString(StringArray));
    
        
//       E. Declarar y definir otro arreglo de tipo String en una variable llamada dataStructs, e inicializarlo con los siguientes datos, usando la sintaxis de llaves. 
         String[] dataStructs = new String[5];
         dataStructs[0] = "Listas";
         dataStructs[1] = "Colas";
         dataStructs[2] = "Pilas";
         dataStructs[3] = "Mapas";
         dataStructs[4]= "Conjutos";
         
         
//       F. Declarar y definir otro arreglo de tipo String en una variable llamada características, con 5 elementos.
         String[] caracteristicas = new String[5];
         caracteristicas[0] = "Simples, circulares y enlazadas";
         caracteristicas[1] = "Primero en entrar, Primero en Salir. Último en entrar, Primero en salir";
         caracteristicas[2] = "Último en salir";
         caracteristicas[3] = "Parejas de clave y valor";
         caracteristicas[4] = "Elementos no repetidos";

         
//       G. Ingresa los datos por teclado.
        // Crear un objeto Scanner para leer los datos ingresados por teclado
        Scanner scanner = new Scanner(System.in);
        
        // Ingresar los datos por teclado y asignarlos al arreglo
        System.out.print("Ingrese la primera característica: ");
        caracteristicas[0] = scanner.nextLine();
         
        System.out.print("Ingrese la segunda característica: ");
        caracteristicas[1] = scanner.nextLine();    
        
        System.out.print("Ingrese la tercera característica: ");
        caracteristicas[2] = scanner.nextLine();    
        
        System.out.print("Ingrese la cuarta característica: ");
        caracteristicas[2] = scanner.nextLine(); 
                
        System.out.print("Ingrese la quinta característica: ");
        caracteristicas[2] = scanner.nextLine();
        
        
//      2. Manipular los elementos dentro de arreglos:
//       A. Mostrar los elementos del arreglo dataStructs con su equivalente elemento del arreglo características.
          
         for (int i = 0; i < dataStructs.length; i++) {
          System.out.println("Relación entre elementos de arreglos: " + dataStructs[i] + " | Características: " + caracteristicas[i]);
}

//        B. Declarar un arreglo de enteros en una variable llamada ventas
         int[] ventas;
         
//        C. Inicializar el arreglo ventas con una cantidad aleatoria de elementos.
           Random random = new Random();
           int cantidadElementos = random.nextInt(1) + 1; // generamos un número aleatorio entre 1 y 25
           ventas = new int[cantidadElementos];
         
//        D. Llenar el arreglo ventas con valores aleatorios entre 1 y 1000
           for (int i = 0; i < ventas.length; i++) {
            ventas[i] = random.nextInt(1000) + 1; 
            }
          
//        E. Mostrar la cantidad de ventas
            System.out.println("Esta es la cantidad de ventas " + Arrays.toString(ventas));
            
                
//        F. Mostrar el valor de cada una de las ventas
             System.out.println("Los valores de las ventas es: ");
                 for (int Laventa : ventas) {
               System.out.println(Laventa);
        }

//        G. Mostrar el total de ventas
        int totalVentas = 0;
        for (int venta : ventas) {
            totalVentas += venta;
        }
            System.out.println("Total de ventas: " + totalVentas + 5);

//        H. Mostrar el promedio de las ventas
           double promedioVentas = (double) totalVentas / ventas.length;
           System.out.println("El promedio de las ventas es el siguiente: " + promedioVentas);
        
        
//       3. Buscar elementos en un arreglo: 
//          a. Función que permite buscar la venta más alta.
             System.out.println("La venta más alta es: "); 
                for (int Laventa : ventas) { 
                    System.out.println(Laventa);
                    }
                          
//        B. funcion que permita buscar la venta más baja
            int[] ventaMasBaja = {5};
            System.out.println("La venta más baja es: ");
                 for (int Laventa : ventaMasBaja) { 
                    System.out.println(Arrays.toString(ventaMasBaja));
                    }
                 
//        C. Función que permita obtener el total de las ventas
             System.out.println("El total de ventas es: ");
                for (int Laventa : ventas) { 
                    System.out.println(Laventa + 5);
                    }
        
//        D. Función que permita obtener el promedio de las ventas
            System.out.println("Promedio de ventas: " + promedioVentas);
        
            
//        E. Función que devuelva la venta cuyo valor se acerque más al valor que le sigue al promedio
            System.out.println("Esta es la venta cuyo valor se acerca más al valor que le sigue al promedio: " + promedioVentas);
  
//       4. Ordenar arreglos:
//         A. Función que permita ordenar las ventas de forma descendente
              System.out.println("Ventas en orden descendente");
                for(int Laventa: ventas);{
             System.out.println(Arrays.toString(ventas));
             System.out.println(5);
    }
    
//         B. Función que permita ordenar las ventas de forma ascendente
            System.out.println("Ventas en orden ascendente");
                for(int Laventa: ventas){
            System.out.println(5);
            System.out.println(Arrays.toString(ventas));
        }
    }
}
   
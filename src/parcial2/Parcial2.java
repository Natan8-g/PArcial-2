package parcial2;

import java.util.Scanner;

public class Parcial2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int total = 0;


                System.out.println("Ingrese un numero");
                int valor = entrada.nextInt();
                for (int i = 0; i <= 10; i++) {
                    total = valor * i;

                    System.out.println(valor + "*" + i + "=" + total );
                    
          
               } 
            }
        }
    



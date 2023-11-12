package tabuada;

import java.util.Scanner;

public class programa {
   public static void main(String args[]) {
	   Scanner scanner = new Scanner(System.in);
   double n1;
    
   System.out.print("Digite um numero: ");
   n1 = scanner.nextDouble();
   
   System.out.print(tabuada(n1));
   }
   public static double tabuada( double n1) {
	   double resultado=0.0;
	   for(int i=0;i<=10;i++) {
		   resultado=i * n1;
		   System.out.println(resultado);
	   }
	   return resultado;
   }
   
}

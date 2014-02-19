import java.util.*;
public class Adivina {   

   public static void main(String[] args) {
   		Scanner sc = new Scanner(System.in); 
   		Random rdn = new Random ();
   		int azar = rdn.nextInt(100);
   		int numero=0;
   		while (numero != azar){
   			System.out.print("Ingrese un numero:    ");
   			numero = sc.nextInt();
   			if (numero < azar){
   				System.out.println("El numero ingresado es menor");
   				System.out.println();
   			}
   			if (numero >azar) {
   				System.out.println("El numero ingresado es mayor");
   				System.out.println();

   			}
   		}
   		System.out.println();
System.out.println("****Ha adivinado el numero******");


   }
}
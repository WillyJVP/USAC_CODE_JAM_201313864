/*
Programa en el cual el usuario ingresa un numero y la consola itera hasta llegar a ese numero
mostrando los numeros primos que halle haste llegar al numero.
*/

public class Primo {   

   public static void main(String[] args) {
   		
         int x=0;
         int j=0;

   		int numero = Integer.parseInt(args[0].toString());
      for (int i=2;i<=numero;i++){
          for (j=1;j<=numero+1;j++){
            if ((i % j) == 0){
              x++;
            }
          }
          if (x==2){
            System.out.println(i);
            }
            x=0;
          
      }
   }

}
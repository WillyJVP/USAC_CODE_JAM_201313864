
public class Palindrome
{
    public static void main(String []args)
    {
        int i;
        String frasesinespacios="",alReves="";
       
        String frase = args[0];

        frase=frase.toUpperCase(); //convertimos la frase a mayúsculas
        
        int largo=frase.length();
        String sinEspacios[]=frase.split(" "); //pasamos frase a un arreglo, quitamos los espacios
        for(i=0; i<sinEspacios.length;i++)            
            frasesinespacios+=sinEspacios[i]; //armamos una hilera que no contenga los espacios
       // System.out.println(frasesinespacios);
        
        sinEspacios=frasesinespacios.split("");
        
        for(i=sinEspacios.length-1; i>=0; i--)
            alReves+=sinEspacios[i]; //armamos una hilera desde la ultima posicion del arreglo ala primera
        
        //System.out.println(alReves);
        
        if(frasesinespacios.equals(alReves.trim())) //comparamos la frase sin espacios con la frase "al reves"
            System.out.println("Es palíndrome");
        else
            System.out.println("No es palindrome");                
        
        
    }
}
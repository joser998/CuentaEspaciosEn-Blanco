import java.util.Scanner;
public class Holas {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Cuenta Espacios en Blanco.\n");
        System.out.print("Inserta frase: ");  
        String frase=sc.nextLine();
        frase=frase.toLowerCase();
    
        int contador=0;
        boolean activar=false;
        char espacioBlanco[]={' '};
        char caracteractual=0;
    
        for(int i=0; i<frase.length(); i++){
            caracteractual=frase.charAt(i);
            activar=false;
            for(int j=0; j<espacioBlanco.length && !activar; j++){
                if(caracteractual==espacioBlanco[j]){
                    activar=true;
                }
            }
            if(activar){
                contador++;
            }
        }
        System.out.println("Espacios en blanco: "+contador);
    }
}
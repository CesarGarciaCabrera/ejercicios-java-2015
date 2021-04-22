//package circulo;
import javax.swing.JOptionPane;


public class Circulo {

    public static void main(String[] args) {
        double l=3.14D;//Declaracion de Constantes
        float d=25.4F,D=2F,a,b,c; //Declaracion de variables
        b=d/D;
        c=b*b;
        a=(float) (c*l);

                System.out.println("El area del circulo es: "+a);
                JOptionPane.showMessageDialog(null,"El area del circulo es: "+a);
    }
    
}
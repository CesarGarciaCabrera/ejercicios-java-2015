//package triangulo;
import javax.swing.JOptionPane;


public class Triangulo {

    public static void main(String[] args) {
        final int D=2;//Declaracion de Constantes
        float b=5.5F, h=3.4F,a; //Declaracion de variables
        a=b*h/D;
                System.out.println("El area del triangulo es: "+a);
                JOptionPane.showMessageDialog(null,"El area del triangulo es: "+a);
    }
    
}
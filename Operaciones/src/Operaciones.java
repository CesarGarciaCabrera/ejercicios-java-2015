//package operaciones;

import javax.swing.JOptionPane;
public class Operaciones {

    public static void main(String[] args) {
        final int a=3,b=5;
        float c=7.5F,d,e,f,g=7.5F,h;
        double raiz_cuadrada;
         d=a+b+c;
         e=a*b*c;
         f=b%a;
         raiz_cuadrada=Math.sqrt(d);
         h=g*g*g;
         System.out.println("La suma de los numeros es:  "+d);
         System.out.println("La multiplicación de los numeros es: "+e);
         System.out.println("El residuo de la división del segundo número entre el primero es: "+f);
         System.out.println("La raiz cuadrada de la suma es: "+raiz_cuadrada);
         System.out.println("El cubo del tercer numero: "+h);
       JOptionPane.showMessageDialog(null,"La suma de los numeros es:  "+d);
        JOptionPane.showMessageDialog(null,"La multiplicación de los numeros es: "+e);
         JOptionPane.showMessageDialog(null,"El residuo de la división del segundo número entre el primero es: "+f);
     JOptionPane.showMessageDialog(null,"La raiz cuadrada de la suma es: "+raiz_cuadrada);
     JOptionPane.showMessageDialog(null,"El cubo del tercer numero: "+h);
    }
    
}

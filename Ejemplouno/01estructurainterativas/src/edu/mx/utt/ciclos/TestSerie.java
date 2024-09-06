package edu.mx.utt.ciclos;
import javax.swing.JOptionPane;
public class TestSerie {
    public static void main(String[] args) {
        String resultado="";
        Serie serie1 = new Serie();
        Serie serie2 = new Serie(3);

        resultado=  "El resultado es: \n" +
                    "\n El valor de n es:"+serie1.getN() +
                    "\n El resuldad de la serie utilizando el for:" + serie1.calcularFor() +
                    "\n El resuldad de la serie utilizando el While:" + serie1.calcularWhile() +
                    "\n El resuldad de la serie utilizando el do-While:" + serie1.calcularDoWhile() +
                    "\n Resultado con formato: " + serie1.toString() +" =" + serie1.calcularFor();
        JOptionPane.showMessageDialog(null, resultado );
        // int n = serie1.getN();
        // System.out.println("El valor de n es: "+ n);
        // System.out.println(serie1);

        // System.out.println("El valor de n es: "+serie2.getN());
        // System.out.println(serie2);

        // serie1.setN(-4);
        // System.out.println("El valor de n es: "+serie1.getN());

        // serie2.setN(10);
        // System.out.println("El valor de n es: "+ serie2.getN());

    }
}

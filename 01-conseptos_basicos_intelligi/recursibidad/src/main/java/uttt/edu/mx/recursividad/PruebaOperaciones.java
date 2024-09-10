package uttt.edu.mx.recursividad;
import javax.swing.JOptionPane;

public class PruebaOperaciones {
    public static void main(String[] args) {
        ejecutar();
    }
    public static String menu(){
        String menu="Menu principal\n"+
                "1)Imprimir Iterativo\n"+
                "2)Imprimir Recursivo\n"+
                "3)Salir\n"+
                "Elegir opcion";

        return JOptionPane.showInputDialog(menu);
    }
    public static void ejecutar() {
        String opcion = "";
        boolean sentinel = true;
        int n = 0;
        Operaciones ope1=new Operaciones();
        do {
            opcion = menu();
            switch (opcion) {
                case "1"://iterativo
                    n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces"));
                    ope1.setN(n);
                    ope1.Imprimir();
                    ope1.Imprimir();
                    JOptionPane.showMessageDialog(null, "Caso 1");
                    break;
                case "2":
                    n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces"));
                    ope1.setN(n);
                    ope1.Imprimir(ope1.getN());
                    JOptionPane.showMessageDialog(null, "Caso 2");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "I'LL be back");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (sentinel);
    }
}

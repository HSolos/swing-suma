import javax.swing.JOptionPane;

public class suma {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        int suma = n1 + n2;

        String mensaje = String.format("La suma de %d y %d es: %d",n1, n2, suma);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

import javax.swing.JOptionPane;

public class Major {
public static void main(String[] args) {


    var num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese otro numero"));
    if (num1>num2) {
        JOptionPane.showConfirmDialog(null, "el numero mayor es "+num1);

    }
    if (num1<num2) {
        JOptionPane.showConfirmDialog(null, "el numero mayor es "+num2);

    }
    else {

        JOptionPane.showMessageDialog(null, "los dos numeros son iguales");

    }

    

    
}
  
}
    


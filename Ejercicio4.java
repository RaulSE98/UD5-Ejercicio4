import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String radio = JOptionPane.showInputDialog("Introduce el radio del circulo");
		
		double rad = Double.parseDouble(radio);
		
		double area = Math.PI*Math.pow(rad,2);
		
		JOptionPane.showMessageDialog(null, "El area del circulo es de " +area);

	}

}

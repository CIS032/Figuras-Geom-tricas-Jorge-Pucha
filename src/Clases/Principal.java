package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Principal {

    public static void main(String[] args) {
        String menu = "Calcular Area y Perimetro de las siguientes Figuras"
                + "\nSeleccione una opción:"
                + "\n1  Rectangulo"
                + "\n2  Circulo"
                + "\n3  Triangulo"
                + "\n4  Salir";
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu,
                    "Figuras Geometricas", JOptionPane.INFORMATION_MESSAGE));
            switch (opcion) {
                case 1:
                    double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base", "Rectangulo", JOptionPane.INFORMATION_MESSAGE));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura", "Rectangulo", JOptionPane.INFORMATION_MESSAGE));
                    Rectangulo rec = new Rectangulo(base, altura);
                    JOptionPane.showMessageDialog(null, "Area: " + rec.area() + "\nPerimetro: " + rec.perimetro(), "Rectangulo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese radio del circulo", "Circulo", JOptionPane.INFORMATION_MESSAGE));
                    Circulo cir = new Circulo(radio);
                    JOptionPane.showMessageDialog(null, "Area: " + cir.area() + "\nPerimetro: " + cir.perimetro(), "Circulo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    double base2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base", "Triangulo", JOptionPane.INFORMATION_MESSAGE));
                    double altura2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura", "Triangulo", JOptionPane.INFORMATION_MESSAGE));
                    Triangulo tri = new Triangulo(base2, altura2);
                    JOptionPane.showMessageDialog(null, "Area: " + tri.area() + "\nPerimetro: " + tri.perimetro(), "Triangulo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida", "Error", JOptionPane.PLAIN_MESSAGE);
            }

        } while (opcion != 4);

    }
}

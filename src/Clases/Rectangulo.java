
package Clases;

/**
 *
 * @author Jorge
 */
public class Rectangulo extends Figura{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public double area() {
        return ancho*alto;
    }

    @Override
    public double perimetro() {
        return (ancho*2)+(alto*2);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jorge
 */
public class Circulo extends Figura{
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double area() {
        return (2*Math.PI)*radio;
    }
    @Override
    public double perimetro() {
        return Math.PI*Math.pow(radio, 2);
    } 
}

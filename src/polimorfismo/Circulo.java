package polimorfismo;

public class Circulo extends Figura {

    public double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double calArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea: " + calArea() + "\nPerimetro: " + calPerimetro();
    }

}

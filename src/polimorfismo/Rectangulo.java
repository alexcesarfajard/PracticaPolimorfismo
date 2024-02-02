package polimorfismo;

public class Rectangulo extends Figura {
    
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calArea() {
        return this.base * this.altura;
    }

    @Override
    public double calPerimetro() {
        return 2 * (this.base + this.altura);
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea: " + calArea() + "\nPerimetro: " + calPerimetro();
    }

}

package polimorfismo;

public class Triangulo extends Figura {
    
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    
    public Triangulo(double base, double altura, double lado1, double lado2){
        super("Triangulo");
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calArea() {
        return this.base * this.altura / 2;
    }

    @Override
    public double calPerimetro() {
        return this.lado1 + this.lado2 + this.base;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea: " + calArea() + "\nPerimetro: " + calPerimetro();
    }

}

package polimorfismo;

public class Cuadrado extends Figura{
    
    private double lado;
    
    public Cuadrado (double lado){
        super("Cuadrado");
        this.lado = lado;
    }
    
    @Override
    public double calArea(){
        return this.lado * this.lado;
    }
    
    @Override
    public double calPerimetro(){
        return this.lado * 4;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nArea: " + calArea() + "\nPerimetro: " + calPerimetro();
    }
}

package polimorfismo;

public abstract class Figura {
    private String nombre;
    private double area;
    private double perimetro;
    
    public Figura(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calArea();
    
    public abstract double calPerimetro();
    
    @Override
    public String toString(){
        return "Nombre: " + this.getNombre();
    }
}

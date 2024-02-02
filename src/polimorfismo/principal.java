package polimorfismo;

public class principal {

    public static void main(String[] args) {
        Figura f[] = new Figura[4];
        f[0] = new Cuadrado(5);
        f[1] = new Circulo(3);
        f[2] = new Rectangulo(6, 8);
        f[3] = new Triangulo(11, 8, 6, 4);
        
        for (int i = 0; i < f.length; i++) {
            System.out.println("----------\n"
            + f[i] 
            + "\n----------");
        }
    }
    
}

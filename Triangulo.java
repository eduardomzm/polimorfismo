public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura){
        super(nombre);
        this.altura = altura;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Polimorfismo dinámico  - sobre-escritura de métodos 
    @Override
    public double getArea(){
        double a = this.base * this.altura / 2;
        super.setArea(a);
        return a;
    }

    @Override
    public double getPerimetro(){
        double p = 3 * this.base;
        // Si desde la clase hiha necesitas usar un método de la clase padre debes
        // usar la palabra super el . y el nombre del método
        super.setPerimetro(p);
        return p;
    }

    // Polimorfismo dinámico  sobre-escritura de métodos
    // El método 
    @Override
    public String toString() {
        return super.toString() + "Triangulo [base=" + base + ", altura=" + altura + "]";
    }

    
}

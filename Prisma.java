public class Prisma extends Triangulo {
    private double alturaPrisma;

    public Prisma(String nombre, double base, double alturaTriangulo, double alturaPrisma) {
        super(nombre, base, alturaTriangulo);
        this.alturaPrisma = alturaPrisma;
    }

    public double getVolumen() {
        double volumen = super.getArea() * this.alturaPrisma;
        super.setArea(volumen);
        return volumen;
    }

    public double getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(double alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    @Override
    public String toString() {
        return "Prisma [alturaPrisma=" + alturaPrisma + ", volumenPrisma=" + getVolumen() + "]";
    }


    
}

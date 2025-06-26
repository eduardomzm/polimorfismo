public class TestingPolimorfismo {
    public static void main(String[] args) {
        FiguraGeometrica unaFigura = new FiguraGeometrica("Hexagono");
        unaFigura.setArea(48.5);
        unaFigura.setPerimetro(32.9);
    
    
        System.out.println("Datos de unafigura: " + unaFigura.toString());
    
        // Ejempplo de uso de sobrecarga
        // como programadores decimos en tiempo de edición cuál contructor usar  
        FiguraGeometrica otraFigura = new FiguraGeometrica("Pentágono", 26.12);

        // Ejemplo de uso de sobre-escritura:
        // Al momento de correr, Java decide cuál toString debe usar
        System.out.println("Datos de otraFigura: " + otraFigura.toString());
        System.out.println();

        Triangulo triangulo1 = new Triangulo("Triangulo 1", 10.8, 12.50);
        System.out.println("Datos del Triangulo 1: " + triangulo1.toString());
        System.out.println("Area de triangulo1: " + triangulo1.getArea());
        double perimetro = unaFigura.getPerimetro();
        System.out.println("Perimetro del triangulo1: " + perimetro);
        // Si desde fuera de la clase hija necesitas usar un método de la
        // clase padre, solo debes escribir el objeto de la clase hija|
        triangulo1.setPerimetro(perimetro);
        System.out.println("Datos del Triangulo 1: " + triangulo1.toString());

        Prisma prisma1 = new Prisma("Prisma Triangular", 10.8, 12.50, 15.0);
        System.out.println("\nDatos del Prisma: " + prisma1.toString());

    }   
}    
    
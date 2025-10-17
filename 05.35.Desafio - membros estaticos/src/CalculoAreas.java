public class CalculoAreas {

    static double pi = 3.14159265358979323846;

    static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    static double calcularAreaCirculo(double raio) {
        return (raio * raio) * CalculoAreas.pi;
    }

}

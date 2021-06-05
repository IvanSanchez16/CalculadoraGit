package wsCalculadora;

public class Calculadora {
    public double suma(double x, double y)
    {
        return x + y;
    }

    public double multiplica(double x, double y) {
        return x * y;
    }

    public double seno(double x) {
        return Math.sin(x);
    }

    public double coseno(double x) {
        return Math.cos(x);
    }

    public double tangente(double x) {
        return Math.tan(x);
    }

    public double resta(double x, double y) { return x - y; }

    public double division(double x, double y) { return x / y; }

    public double logaritmo(double x) { return Math.log(x); }

    public double exponencial(double x, double y) { return Math.pow(x,y); }
}

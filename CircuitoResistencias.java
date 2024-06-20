public class CircuitoResistencias {
    private double resistencia1;
    private double resistencia2;
    private double resistencia3;
    private double resistencia4;

    public CircuitoResistencias(double r1, double r2, double r3, double r4) {
        this.resistencia1 = r1;
        this.resistencia2 = r2;
        this.resistencia3 = r3;
        this.resistencia4 = r4;
    }

    public double calcularResistenciaEquivalente() {
        return resistencia1 + resistencia2 + resistencia3 + resistencia4;
    }

    public double obterMaiorResistencia() {
        double maior = resistencia1;
        if (resistencia2 > maior) maior = resistencia2;
        if (resistencia3 > maior) maior = resistencia3;
        if (resistencia4 > maior) maior = resistencia4;
        return maior;
    }

    public double obterMenorResistencia() {
        double menor = resistencia1;
        if (resistencia2 < menor) menor = resistencia2;
        if (resistencia3 < menor) menor = resistencia3;
        if (resistencia4 < menor) menor = resistencia4;
        return menor;
    }

    public static void main(String[] args) {
        // Exemplo de resistências //
        double r1 = 10.0;
        double r2 = 20.0;
        double r3 = 15.0;
        double r4 = 25.0;

        CircuitoResistencias circuito = new CircuitoResistencias(r1, r2, r3, r4);

        double resistenciaEquivalente = circuito.calcularResistenciaEquivalente();
        System.out.println("Resistência Equivalente: " + resistenciaEquivalente);

        double maiorResistencia = circuito.obterMaiorResistencia();
        System.out.println("Maior Resistência: " + maiorResistencia);

        double menorResistencia = circuito.obterMenorResistencia();
        System.out.println("Menor Resistência: " + menorResistencia);
    }
}

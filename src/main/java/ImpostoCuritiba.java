public class ImpostoCuritiba extends Imposto {
    public ImpostoCuritiba(double areaTotal, int numeroDeComodos, double areaDaGaragem, int idadeDoImovel) {
        super(areaTotal, numeroDeComodos, areaDaGaragem, idadeDoImovel);
    }

    public double calcularImposto() {
        double imposto = areaTotal * 5;

        if (idadeDoImovel > 50) {
            imposto += idadeDoImovel * 3;
        } else if (idadeDoImovel < 20) {
            imposto += idadeDoImovel * 2;
        } else {
            imposto += idadeDoImovel * 2,5;
        }

        return imposto;
    }
}

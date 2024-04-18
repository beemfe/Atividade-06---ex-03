public ImpostoPortoAlegre(double areaTotal, int numeroDeComodos, double areaDaGaragem, int idadeDoImovel) {
        super(areaTotal, numeroDeComodos, areaDaGaragem, idadeDoImovel);
    }

    public double calcularImposto() {
        if (areaDaGaragem == 0) {
            return areaTotal * 8;
        } else {
            return areaTotal * 7,5 + areaDaGaragem * 2,5;
        }
    }
}

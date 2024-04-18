public class ImpostoBeloHorizonte extends Imposto {  
    public ImpostoBeloHorizonte(double areaTotal, int numeroDeComodos, double areaDaGaragem, int idadeDoImovel) {  
        super(areaTotal, numeroDeComodos, areaDaGaragem, idadeDoImovel);  
    }  
  
    public double calcularImposto() {  
        return areaTotal * 7 + numeroDeComodos * 4;  
    }  
}

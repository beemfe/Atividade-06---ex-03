public class ImpostoSaoPaulo extends Imposto {  
    public ImpostoSaoPaulo(double areaTotal, int numeroDeComodos, double areaDaGaragem, int idadeDoImovel) {  
        super(areaTotal, numeroDeComodos, areaDaGaragem, idadeDoImovel);  
    }  
  
    public double calcularImposto() {  
        return areaTotal * 10 + numeroDeComodos * 2;  
    }  
}

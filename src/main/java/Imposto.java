public abstract class Imposto {  
    private double areaTotal;  
    private int numeroDeComodos;  
    private double areaDaGaragem;  
    private int idadeDoImovel;  
  
    public Imposto(double areaTotal, int numeroDeComodos, double areaDaGaragem, int idadeDoImovel) {  
        this.areaTotal = areaTotal;  
        this.numeroDeComodos = numeroDeComodos;  
        this.areaDaGaragem = areaDaGaragem;  
        this.idadeDoImovel = idadeDoImovel;  
    }  
    public abstract double calcularImposto();  
}

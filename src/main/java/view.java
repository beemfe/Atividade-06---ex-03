public class View {
    public static void main(String[] args) {
        Imposto impostoSaoPaulo = new ImpostoSaoPaulo(100, 3, 0, 25);
        Imposto impostoBeloHorizonte = new ImpostoBeloHorizonte(100, 3, 0, 25);
        Imposto impostoPortoAlegre = new ImpostoPortoAlegre(100, 3, 0, 25);
        Imposto impostoCuritiba = new ImpostoCuritiba(100, 3, 0, 25);

        System.out.println("Imposto São Paulo: " + impostoSaoPaulo.calcularImposto());
        System.out.println("Imposto Belo Horizonte: " + impostoBeloHorizonte.calcularImposto());
        System.out.println("Imposto Porto Alegre: " + impostoPortoAlegre.calcularImposto());
        System.out.println("Imposto Curitiba: " + impostoCuritiba.calcularImposto());
    }
}

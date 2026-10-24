public class ColaboradorProducao extends Colaborador {
    private int quantidadePecas;
    private double valorPorPeca;

    public ColaboradorProducao(String matricula, String nome, int quantidadePecas, double valorPorPeca) {
        super(matricula, nome);
        this.quantidadePecas = quantidadePecas;
        this.valorPorPeca = valorPorPeca;
    }

    public double calcularProdutividade() {
        return this.quantidadePecas * this.valorPorPeca;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + calcularProdutividade();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de Peças: " + quantidadePecas);
        System.out.println("Valor por Peça: R$ " + valorPorPeca);
        System.out.println("Bônus de Produtividade: R$ " + calcularProdutividade());
        System.out.println("Salário Final (com produtividade): R$ " + calcularSalarioFinal());
    }
}

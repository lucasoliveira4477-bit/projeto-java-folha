public class ColaboradorComissionado extends Colaborador {
    private double valorVendas;
    private double percentualComissao;

    public ColaboradorComissionado(String matricula, String nome, double valorVendas, double percentualComissao) {
        super(matricula, nome);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    public double calcularComissao() {
        return (this.valorVendas * this.percentualComissao) / 100.0;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + calcularComissao();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor das Vendas: R$ " + valorVendas);
        System.out.println("Percentual de Comissão: " + percentualComissao + "%");
        System.out.println("Comissão Calculada: R$ " + calcularComissao());
        System.out.println("Salário Final (com comissão): R$ " + calcularSalarioFinal());
    }
}

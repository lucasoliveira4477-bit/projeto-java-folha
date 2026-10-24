public class Colaborador {
    public static final double SALARIO_BASE = 2000.0;
    
    private String matricula;
    private String nome;
    private double salarioBase;

    public Colaborador(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = SALARIO_BASE;
    }

    public double calcularSalarioFinal() {
        return this.salarioBase;
    }

    public void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Salário Final: R$ " + calcularSalarioFinal());
    }

    public String getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public double getSalarioBase() { return salarioBase; }
}

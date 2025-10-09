package Desafio2;

public class Principal {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Artur Aires";
        funcionario.quantidadeFilhos = 3;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 60;
        contratoTrabalho.valorHoraExtra = 78;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double salarioDevido = folhaPagamento.calcularSalario(180, 150, contratoTrabalho);
        System.out.printf("Salário devido: R$ %.2f%n", salarioDevido);

    }

}

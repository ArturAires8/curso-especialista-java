package Desafio1;

public class Principal {
    public static void main(String[] args) {

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double salario = folhaPagamento.calcularSalario(35, 18, 25,
                28);
        System.out.printf("Salário devido: R$ %.2f%n", salario);

    }
}
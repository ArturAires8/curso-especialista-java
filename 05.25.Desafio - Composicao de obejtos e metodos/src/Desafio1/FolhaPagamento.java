package Desafio1;

public class FolhaPagamento {

    double calcularSalario(int horasNormais, int horasExtras, double valorHoraExtra, double valorHoraNormal) {

        double valorHorasNormais = horasNormais * valorHoraNormal;
        double valorHorasExtras = horasExtras * valorHoraExtra;

        return valorHorasNormais + valorHorasExtras;
    }

}

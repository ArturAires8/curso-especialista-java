package Desafio2;

public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    public boolean possuiAdicionalParaFilhos() {
        return funcionario.possuiFilhos();
    }

}


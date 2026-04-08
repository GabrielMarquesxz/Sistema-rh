package com.meuprojetorh.funcionario;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
}

public void  aplicarAumento(double percentual) {
    if (percentual > 0) {
        this.salario += this.salario * percentual / 100;
    }
}



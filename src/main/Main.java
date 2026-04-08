package com.meuprojetorh;

public class main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João Silva", "Analista de Sistemas", 5000);
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: " + funcionario1.getSalario());

        funcionario1.aplicarAumento(10);
        System.out.println("Salário após aumento: " + funcionario1.getSalario());
    }
}
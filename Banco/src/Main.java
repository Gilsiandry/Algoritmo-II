//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Higor abre uma conta com um saldo inicial de R$ 1.000,00
        Cliente contaHigor = new Cliente("Higor", 1000);

        // Higor consular seu limite
        contaHigor.solicitarLimite();

        // Higor consulta seu saldo inicial
        System.out.println("Saldo inicial de " + contaHigor.getTitular() + ": R$ " + contaHigor.getSaldo());

        // Higor faz um depósito de R$ 200,00
        contaHigor.depositar(200);

        // Higor consulta seu saldo após o depósito
        System.out.println("Saldo atual: " + contaHigor.getSaldo());

        // Higor tenta sacar R$ 500,00
        contaHigor.sacar(500);

        // Higor consulta seu saldo após o saque
        System.out.println("Saldo após saque: R$ " + contaHigor.getSaldo());

        // Higor tenta sacar mais do que o saldo disponível
        contaHigor.sacar(1000);

        // Higor consulta o saldo final
        System.out.println("Saldo final: " + contaHigor.getSaldo());
    }
}
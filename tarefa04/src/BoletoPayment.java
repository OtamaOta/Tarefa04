// Estratégia para pagamento via Boleto
public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = "BOLETO-" + (int) (Math.random() * 10000); // Gera um código de boleto aleatório
        System.out.println("Pagamento via Boleto no valor de R$" + amount + " processado.");
        System.out.println("Código do Boleto: " + boletoCode);
    }
}
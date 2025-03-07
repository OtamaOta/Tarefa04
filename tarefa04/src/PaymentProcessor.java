// Classe que processa o pagamento usando a estratégia selecionada
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    // Define a estratégia de pagamento
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Executa o pagamento
    public void processPayment(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.processPayment(amount);
        } else {
            System.out.println("Nenhum método de pagamento selecionado.");
        }
    }
}
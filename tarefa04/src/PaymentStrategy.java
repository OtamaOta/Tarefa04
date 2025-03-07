// Interface que define o contrato para todas as estratégias de pagamento
public interface PaymentStrategy {
    void processPayment(double amount);
}
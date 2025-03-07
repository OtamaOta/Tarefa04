// Estratégia para pagamento via Cartão de Crédito
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento via Cartão de Crédito no valor de R$" + amount + " processado.");
        System.out.println("Número do cartão: **** **** **** 1234");
        System.out.println("Pagamento confirmado!");
    }
}
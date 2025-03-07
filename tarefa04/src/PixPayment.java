// Estratégia para pagamento via Pix
public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = "PIX-" + (int) (Math.random() * 10000); // Gera um código Pix aleatório
        System.out.println("Pagamento via Pix no valor de R$" + amount + " processado.");
        System.out.println("Código Pix: " + pixCode);
    }
}
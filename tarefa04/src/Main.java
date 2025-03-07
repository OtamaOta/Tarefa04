import java.util.Scanner;

// Classe principal que executa o programa
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Menu de opções
        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        int choice = scanner.nextInt();

        // Define a estratégia de pagamento com base na escolha do usuário
        switch (choice) {
            case 1:
                paymentProcessor.setPaymentStrategy(new PixPayment());
                break;
            case 2:
                paymentProcessor.setPaymentStrategy(new CreditCardPayment());
                break;
            case 3:
                paymentProcessor.setPaymentStrategy(new BoletoPayment());
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        // Solicita o valor da transação
        System.out.println("Digite o valor da transação:");
        double amount = scanner.nextDouble();

        // Processa o pagamento
        paymentProcessor.processPayment(amount);

        scanner.close();
    }
}
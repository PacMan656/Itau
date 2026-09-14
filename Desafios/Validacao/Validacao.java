import java.util.Scanner;

public class ValidacaoOperacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String operacao = scanner.next();
            
            // Verifica se a entrada corresponde a uma das operações válidas
            if (operacao.equals("DEPOSITO") || 
                operacao.equals("SAQUE") || 
                operacao.equals("TRANSFERENCIA")) {
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }
        
        scanner.close();
    }
}
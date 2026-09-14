import java.util.Scanner;

public class ValidacaoAgencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê o código informado pelo operador
        String codigoInformado = scanner.nextLine();
        
        // Lê o código esperado pelo sistema
        String codigoEsperado = scanner.nextLine();
        
        // Compara se os dois códigos são exatamente iguais
        if (codigoInformado.equals(codigoEsperado)) {
            System.out.println("ACESSO LIBERADO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
        
        scanner.close();
    }
}
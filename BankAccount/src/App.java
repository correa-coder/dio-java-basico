import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("\nDIO Java Básico Challenge");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nDigite o seu nome: ");
            String userName = scanner.nextLine();
        
            System.out.print("Agência: ");
            String bankBranch = scanner.nextLine();

            System.out.print("Número da agência: ");
            int bankBranchNumber = scanner.nextInt();
    
            // Generate random number for the balance
            double randomValue = Math.random();
            double min = 300.0;
            double max = 2500.0;
            double bankBalance = min + (randomValue * (max - min));
    
            String formattedOutput = String.format("%nOlá, %s! ", userName)
                                    .concat(String.format("Obrigado por criar uma conta em nosso banco!%n%n"))
                                    .concat(String.format("- Sua agência é %s, conta %d.%n", bankBranch, bankBranchNumber))
                                    .concat(String.format("- Seu saldo $%.2f já está disponível para saque.%n", bankBalance));
            System.out.println(formattedOutput);
        }
        catch (InputMismatchException e) {
            System.err.println("Dados inválidos, certifique-se de fornecer valores adequados para cada tipo de dado.");
        }
        catch (Exception e) {
            System.err.println("Aconteceu um erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

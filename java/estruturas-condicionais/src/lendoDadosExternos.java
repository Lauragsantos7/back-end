import java.util.Scanner;
public class lendoDadosExternos {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o seu nome: ");
        String nome = scanner.next();
        System.out.println("Boas-vindas, " + nome + "!");
        scanner.close();
        /* importante chamar o método close da sua instância de scanner toda
        vez que você não for ler mais dados.  */
        /* Caso a gente não feche nosso scanner, o recurso fica
        alocado e sem uso, o que causa um desperdício que vai se acumulando a
        cada scanner que não é fechado.*/

    }
}

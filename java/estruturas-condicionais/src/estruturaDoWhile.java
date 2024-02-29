/* o DO WHILE (‘Faça Enquanto’) garante que, sempre, ao menos uma iteração do loop
        será executada, já que ele primeiro executa e apenas depois valida se a
condição é verdadeira para continuar ou falsa para interromper o processo.*/
import java.util.Random;
public class estruturaDoWhile {
    /* Vamos supor que uma escola entrará em contato com os inscritos aprovados
    para um curso e que o número máximo de tentativas de contato será até 3.
     */
    public static void main(String [] args) {
        int tentativas = 0;
        int atendeu = 0;
        String log;

        do {
            log = "Ligando para candidato selecionado ...\n";
            // O código abaixo nos dá um numero aleatório entre 0 e 2.
            atendeu = new Random().ints(0, 2).findFirst().getAsInt();
            tentativas += 1;
        } while (atendeu == 0 && tentativas < 3);

        log = "Candidato atendeu na tentativa: " + tentativas;
        System.out.println(log);
    }
}

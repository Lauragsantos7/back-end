/*Vamos considerar que uma escola abriu um processo de inscrição para
um curso gratuito com o número máximo de 10 vagas. A boa notícia
é que as inscrições no site bombaram! Com base em quem se inscreveu,
vamos preencher as vagas até que sejam totalizados 10 cadastros.*/
public class estruturaWhile {
    public static void main (String[] args) {
        // Cria um array com os inscritos
        String[] inscritos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA", "JOAO",
                "FELIPE", "LUCIA", "ANTONIO", "FERNANDA",
                "MARCELA", "VITOR", "BEATRIZ", "JORGE", "JULIA" };

// Determina o número máximo de vagas
        final int numeroVagas = 10;
// A palavra `final` determina que o valor dessa variável não é alterável,
// ele passa a ser uma constante!

// Criamos um vetor vazio com espaço igual ao número de vagas
        String[] vagas = new String[numeroVagas];

// Determinamos quantas vagas já foram preenchidas
        int vagaAtual = 0;

// Percorremos todos inscritos e adicionamos nas vagas até que o número total
// de vagas seja preenchido
        String inscrito = "Indefinido";
        String log;

        while (vagaAtual < numeroVagas) {
            inscrito = inscritos[vagaAtual];
            log = "Adicionando a inscrição: " + inscrito + " Na vaga: "
                    + (vagaAtual + 1) + "\n";
            vagas[vagaAtual] = inscrito;
            vagaAtual += 1;
            System.out.println(log);
        }

    }
}

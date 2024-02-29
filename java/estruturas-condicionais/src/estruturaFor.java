public class estruturaFor {
    public static void main (String[] args) {
        int numero;
        String log;


        for (numero = 1; numero <= 10; numero += 1) {
            log = "O Número atual é: " + numero + "\n";
            System.out.println(log);
        }

        /* for in: */
        String [] nomes = {"Ana", "Laura", "Julia", "Kely"};

        for (String nome: nomes) {
            System.out.println(nome);
        }


    }

}

public class conversaoDeTipos {
    public static void main (String[] args) {
        /* de tipo primitivo para tipo primitivo: */
        short numeroInteiroPequeno = 10;
        int numeroInteiro = numeroInteiroPequeno;
        long numeroInteiroBemGrande = numeroInteiro;
        float numeroDePontoFlutuante = numeroInteiro;
        double numeroDePontoFlutuanteDuasVezesMaisPreciso = numeroInteiro;


        // conversão explícita:
        double numeroDePontoFlutuante = 40_000_000.49d; // Valor bem grande.
        int numeroInteiro = (int) numeroDePontoFlutuante; // O valor à direita
        // do ponto será perdido.
        short numeroInteiroPequeno = (short) numeroInteiro;
        // O tipo short armazena valores entre -32.768 e 32.767, muita coisa será perdida.

    // convertendo string para outrso tipos:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o primeiro número: ");
        String input1 = scanner.next();
        System.out.print("Entre com o segundo número: ");
        String input2 = scanner.next();

        int n1 = Integer.parseInt(input1);
        int n2 = Integer.parseInt(input2);

        int resultado = n1 + n2;
        System.out.println("O resultado da soma é: " + resultado);


        /* Podemos converter Strings “numéricas” para qualquer tipo numérico
        (desde que o valor não exceda o tamanho máximo suportado por aquele tipo,
        lembre-se da perda de dados) utilizando do nome da classe wrapper seguida
        da função de conversão para o tipo alvo: ClasseWrapper.parseTipoAlvo(minhaString):
         */
        System.out.print("Entre com o número: ");
        String input = scanner.next();

        short numeroInteiroPequeno = Short.parseShort(input); // Converte para short.
        long numeroInteiroBemGrande = Long.parseLong(input); // Converte para long.
        float numeroDePontoFlutuante = Float.parseFloat(input); // Converte para float.
        double numeroDePontoFlutuanteComPrecisaoDupla = Double.parseDouble(input);
        // Converte para double.
    }
}

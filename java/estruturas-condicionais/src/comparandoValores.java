public class comparandoValores {
    public static void main (String[] args){

        /* As variáveis de tipos não primitivos não armazenam diretamente
        os valores que são passados por atribuição, mas sim uma referência
        a estes valores. Neste caso, não armazenamos o tesouro e sim o mapa
        que nos leva até ele, ou seja, armazenamos a referência a um objeto.
        E, quando queremos comparar valores de tipos não primitivos, como é
        caso das Strings, geralmente temos a disposição o método equals()
         */
        Scanner scanner = new Scanner(System.in);

        String hello = "Olá"; // Novo objeto do tipo String instanciado.
        System.out.println("Diga Olá: ");
        String input = scanner.next(); // Novo objeto do tipo String instanciado.

// Objetos diferentes, mesmo que com o mesmo valor serão tratados como diferentes
// pelo comparador ==.
        if (hello == input) {
            System.out.println("Isso não será impresso.");
        }

        if (hello != input) {
            System.out.println("Isso será impresso.");
        }

        if (hello == hello) {
            System.out.println("Isso também será impresso, é o mesmo objeto.");
        }

// Verifica se o conteúdo armazenado em ambos os objetos é o mesmo através do método
// equals.
        if (hello.equals(input)) {
            System.out.println(
                    "Isso pode ser impresso se Olá for inserido em nosso terminal.");
        }
    }
}

public class estruturaIfElse {
    public static void main(String[] args) {
        double mediaFinal = 7.0;
        String resultado =  "INDEFINIDO";

        if (mediaFinal >= 7) {
            resultado = "APROVADA";
        } else if (mediaFinal >= 6.0) {
            resultado = "REALIZAR PROVA BONUS";
        } else {
            resultado = "REPROVADA";
        }
        System.out.println(resultado);
    }
}



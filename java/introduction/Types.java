public class Types {
    public static void main(String[] args) {
        /*O float é compacto, e ideal para tarefas leves, enquanto o double
        tem o dobro da precisão do tipo float e está apto para lidar com cálculos
        mais complexos.*/
        float numA = -101.23f;
        float numB = 2.356f;
        System.out.println(numA + numB); // -98.874

        double valorUm = 0.5; // double inicializado naturalmente
        double valorDois = 0.5d; // double definido explicitamente
        double valorTres = 0.123456789; // várias casas decimais
        System.out.println(valorUm); // 0.5
        System.out.println(valorDois); // 0.5
        System.out.println(valorTres); // 0.123456789

        /*No caso do char, ele armazena apenas um caractere por variável.*/
    }


}

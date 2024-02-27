public class TiposNaoPrimitivos {
    /*também conhecidos como tipos de referência, são utilizados para representar
     objetos, arrays e até mesmo outras classes! Eles não são apenas contêineres
      simples de valores; eles são entidades complexas com seus próprios métodos
       e propriedades. Com os tipos não primitivos, você pode criar objetos
       complexos, estruturar seus dados de maneira eficiente e até mesmo modelar
       o mundo real em seus programas. */

    // A String é uma classe do pacote java.lang.String que vem de forma nativa
    // na jre e jdk. String tem como valor default o null, que é padrão de
    // inicialização de qualquer tipo não primitivo dentro do mundo Java.
    /* Usa aspas duplas */
}


public class ContaBancaria {
    double saldo;
    // construtor:
    public ContaBancaria() {
        // atributo
        this.saldo = 0;
    }


    // métodos:
    void mostraMensagem() {
        System.out.println("Conta bancária acessada.");
    }

    void depositar(double valor) {
        this.saldo += valor;
    }

    double converteMoeda(float total, float cambio) {
        return total * cambio;
    }

}


// Instanciando um objeto:
public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
    }
}
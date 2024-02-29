
 /* A classe wrapper nada mais é que uma classe que nos permite
 usar os tipos primitivos como objetos. Uma das maiores
 vantagens de usar os objetos dos tipos primitivos, providos
 pelas classes wrapper, é o acesso a
 diversos métodos que são disponibilizados para eles.*/

 /*Por exemplo, o tipo primitivo int possui uma classe
 wrapper associada chamada Integer. Ambas podem armazenar um
 número inteiro, mas a forma com que isso acontece é diferente.*/
/* A conversão entre tipos primitivos e suas classes wrapper
associadas pode ser feita automaticamente pelo Java através de um
processo chamado autoboxing/unboxing. Esses termos poderiam ser
traduzidos como autoempacotamento/desempacotamento*/


 public class classesWraper {
     static public void main (String[] args) {
         Integer valor = 7;  // autoboxing (autoempacotamento)

         int outroValor = valor; // unboxing (desempacotamento)


 /*As classes wrapper são usadas principalmente em situações em que os
  tipos primitivos de dados precisam ser tratados como objetos. Por
exemplo, em muitas bibliotecas de software e APIs, os métodos só podem
 receber objetos como parâmetros. Nesses casos, é necessário converter
  os tipos primitivos em objetos antes de chamar o método.
  */

/*Além disso, as classes wrapper em Java também fornecem métodos
úteis para manipulação de dados, como a conversão de valores de e para
 Strings, comparação de valores e operações matemáticas: */
         int valor = 42;

         System.out.println(
                 Integer.toBinaryString(valor)
         );

    }
}

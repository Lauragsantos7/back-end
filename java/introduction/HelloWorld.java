/*quiséssemos colocar a classe no pacote com.betrybe.helloworld. Nossa classe

ficaria como abaixo:*/
//
// package com.betrybe.helloworld;

/*O nome de um pacote representa uma estrutura onde cada subpacote é
diferenciado por um
 ponto (.). Assim, com.betrybe.helloworld significa que o maior pacote é com,
 dentro dele temos betrybe, e dentro dele temos helloworld.*/


public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Primeira Linha");
        System.out.println("Segunda Linha");

        /*sem quebra de linha:*/
        System.out.print("Primeira Linha");
        System.out.print("Será impresso também na primeira linha");

        /* classes são organizadas dentro de pacotes. Um pacote dentro do Java
        representa uma estrutura de diretórios dentro da qual as classes estão
        armazenadas.*/
    }
}
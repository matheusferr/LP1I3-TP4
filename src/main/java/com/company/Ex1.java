/*
 @author Matheus Ferreira da Costa
 * Construir a classe Data, conforme especificação abaixo, este exercício comporá a
 * avaliação final, portanto será obrigatória sua elaboração para a prova final.
 */
package com.company;

public class Ex1 {
    public static void main(String[] args) {
        Data date = new Data();

        date.entraAno();

        date.entraMes();

        date.entraDia();

        System.out.println(date.mostra1());

        System.out.println(date.mostra2());

        System.out.println(date.bissexto() ? "Bissexto" : "Normal");

        System.out.println(date.diasTranscorridos());

        date.apresentaDataAtual();
    }
}

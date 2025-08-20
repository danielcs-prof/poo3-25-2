package br.ativ03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TextoStreamSaida {
    public static void main(String[] args) {
        String filePath = "E:\\dev\\repositorios\\poo3-25-2\\Stream\\src\\resource\\arquivo.txt";
        String text = "Este é um exemplo de escrita em arquivo texto";

        try (Writer writer = new FileWriter(filePath)) {

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

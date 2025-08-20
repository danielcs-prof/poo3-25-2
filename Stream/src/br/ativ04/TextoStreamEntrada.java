package br.ativ04;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TextoStreamEntrada {
    public static void main(String[] args) {
        String filePath = "E:\\dev\\repositorios\\poo3-25-2\\Stream\\src\\resource\\arquivo.txt";

        try (Reader reader = new FileReader(filePath)) {

            int charData;
            while ((charData = reader.read()) != -1) {
                System.out.print((char) charData);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

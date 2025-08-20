package br.ativ02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteStreamEntrada {
    public static void main(String[] args) {

        String filePath = "E:\\dev\\repositorios\\poo3-25-2\\Stream\\src\\resource\\arquivo.bin";
        try (InputStream inputStream = new FileInputStream(filePath)) {

            int byteData;
            while( (byteData = inputStream.read()) != -1){
                System.out.print(byteData + " ");
            }
        }
        catch( IOException e){
            e.printStackTrace();
        }
    }
}

package br.ativ01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BytesStreamSaida {
    public static void main(String[] args) {
        String filePath = "E:\\dev\\repositorios\\poo3-25-2\\Stream\\src\\resource\\arquivo.bin";
        byte[] data = {10,20,30,40,50};

        try (OutputStream out = new FileOutputStream(filePath)) {
            out.write(data);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

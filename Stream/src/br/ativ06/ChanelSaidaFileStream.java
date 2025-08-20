package br.ativ06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChanelSaidaFileStream {
    public static void main(String[] args) {
        String filePath = "E:\\dev\\repositorios\\poo3-25-2\\Stream\\src\\resource\\arquivo.txt";
        String text = "Este é um exemplo de escrita utilizando FileChannel.";

        try(FileOutputStream fos = new FileOutputStream(filePath)) {
            FileChannel fc = fos.getChannel();

            // Converter a String em bytes e gravar no ByteBuffer
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(text.getBytes());

            // muda para leitura
            buffer.flip();
            // escrever os dados do buffer no canal
            fc.write(buffer);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

package br.ativ05;

import java.nio.FloatBuffer;

public class BufferStream {
    public static void main(String[] args) {
        FloatBuffer buffer = FloatBuffer.allocate(5);

        //Gravar valores no buffer
        buffer.put(1.5f);
        buffer.put(2.5f);
        buffer.put(3.5f);
        buffer.put(4.5f);
        buffer.put(5.5f);

        //mudar para leitura
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}

package org.example.behavioral.strategy_002;

import java.util.List;

public class ClientDemo {

    public static void main(String[] args) {
        CompressionContext compressionContext = new CompressionContext(new ZipCompressionStrategy());
        compressionContext.compress(List.of());

        compressionContext.setCompressionStrategy(new RarCompressionStrategy());
        compressionContext.compress(List.of());

        compressionContext.setCompressionStrategy(new TarCompressionStrategy());
        compressionContext.compress(List.of());
    }
}

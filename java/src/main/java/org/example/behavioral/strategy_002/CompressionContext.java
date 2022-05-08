package org.example.behavioral.strategy_002;

import java.io.File;
import java.util.List;

public class CompressionContext {

    private CompressionStrategy compressionStrategy;

    public CompressionContext() {
    }

    //this can be set at runtime by the application preferences
    public CompressionContext(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void compress(List<File> files){
        this.compressionStrategy.compressFiles(files);
    }

}

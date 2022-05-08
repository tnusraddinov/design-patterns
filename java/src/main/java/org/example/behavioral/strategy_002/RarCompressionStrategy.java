package org.example.behavioral.strategy_002;

import java.io.File;
import java.util.List;

public class RarCompressionStrategy implements CompressionStrategy{

    @Override
    public void compressFiles(List<File> files) {
        System.out.println(" compressing using RAR approach");
    }
}

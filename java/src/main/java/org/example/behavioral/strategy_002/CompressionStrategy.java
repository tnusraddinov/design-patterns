package org.example.behavioral.strategy_002;

import java.io.File;
import java.util.List;

public interface CompressionStrategy {
    public void compressFiles(List<File> files);
}

package utilities.fileChecker;

import java.io.File;

public interface IFileChecker {
    boolean fileExists(String path);
    File getFile(String path);
}

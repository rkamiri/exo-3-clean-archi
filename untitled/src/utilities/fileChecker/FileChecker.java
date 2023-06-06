package utilities.fileChecker;

import java.io.File;

public class FileChecker implements IFileChecker {
    public boolean fileExists(String path) {
        File file = new File(path);
        return file.exists();
    }

    public File getFile(String path) {
        if (this.fileExists(path)) {
            return new File(path);
        }
        return null;
    }
}

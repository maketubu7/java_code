package FileIoDemo;

import java.io.File;
import java.io.FileFilter;

public class Filterbysuffix implements FileFilter {

    private String suffix;

    @Override
    public boolean accept(File pathname) {
        // TODO Auto-generated method stub
        return (pathname.getName().endsWith(suffix));
    }
    public Filterbysuffix(String suffix) {
        this.suffix = suffix;
    }
}

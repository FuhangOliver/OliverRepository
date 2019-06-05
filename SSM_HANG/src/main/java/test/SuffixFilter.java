package test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class SuffixFilter implements FilenameFilter {
    private String Suffix;

    public SuffixFilter(String suffix) {
        super();
        this.Suffix = suffix;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(Suffix);
    }
}

package patterns.structural.composite;

public interface FileSystemComponent {
    public int getSize();
    public String getName();
    public int getNumberOfFiles();
    public int getNumberOfFolders();
    public boolean search(String target);
    public void printDetails();
}

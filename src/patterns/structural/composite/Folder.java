package patterns.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;

public class Folder implements FileSystemComponent {
    private String name;
    private ArrayList<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemComponent component : components) {
            size += component.getSize();
        }
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfFiles() {
        int count = 0;
        for (FileSystemComponent component : components) {
            count += component.getNumberOfFiles();
        }
        return count;
    }

    @Override
    public int getNumberOfFolders() {
        return 0;
    }

    @Override
    public boolean search(String target) {
        if (name.equals(target)) {
            return true;
        }
        for (FileSystemComponent component : components) {
            if (component.search(target)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printDetails() {
        System.out.println("Folder: " + name);
        System.out.println("Contents: ");
        for (FileSystemComponent component : components) {
            component.printDetails();
        }
    }

    public void add(FileSystemComponent... files) {
        components.addAll(Arrays.asList(files));
    }
}

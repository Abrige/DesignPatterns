package patterns.creational.singleton;

import java.io.File;

public class DatabaseLogger {

    private File storage;

    private  DatabaseLogger(File f) {
    }

    public static DatabaseLogger getInstance(File f){
        return new DatabaseLogger(f);
    }

    public String query(String command){
        return null;
    }

    public boolean write(String s){
        return false;
    }
}

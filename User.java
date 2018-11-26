package bt2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class User {
    private int id;
    private String name, username, password;

    
    public User() {
    }

    public User(int id, String name, String username, String password) {
        setId(id);
        setName(name);
        setUsername(username);
        setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void nextStep(Task task, boolean want) {
    }

    
    public void taskActionLogToText(String path, String writeString) {
        try {
            File file = new File(path);
            FileWriter fw = new FileWriter(file);
            fw.write(writeString);
            System.out.println("Đã ghi");
            fw.close();
        } catch (IOException ex) {
            System.out.println("Không in file!");
        }
    }
}

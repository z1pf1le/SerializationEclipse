package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main{
    public static void main(String[] args) throws Exception {
    	User user = new User();
    	user.lifeLevel = 55;
    	Sword sword = new Sword();
    	sword.level = 5;
    	user.sword = sword;
    	
    	FileOutputStream fos = new FileOutputStream("tempFile");
    	ObjectOutputStream oos = new ObjectOutputStream(fos);
    	oos.writeObject(user);
    	oos.close();
    	
    	
    	FileInputStream fis = new FileInputStream("tempFile");
    	ObjectInputStream ois = new ObjectInputStream(fis);
    	User newUser = (User) ois.readObject();
    	ois.close();
    	System.out.println(newUser.lifeLevel);
    	System.out.println(newUser.sword.level);
    	
    	
    }
}
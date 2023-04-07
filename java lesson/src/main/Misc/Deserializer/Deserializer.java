package main.Misc.Deserializer;

import java.io.*;

public class Deserializer {
    public static void main(String[] args) {

        /*
                            STEPS TO DESERIALIZE
                            ---------------------------------------------------------------
                            1. Declare your object (don't instantiate)
                            2. Your class should implement Serializable interface
                            3. FileInputStream fileIn = new FileInputStream(file path);
                            4. ObjectInputStream in = new ObjectInputStream(file in);
                            5. objectName = (Class) in.readObject();
                            6. in.close(); fileIn.close();
                            ---------------------------------------------------------------
         */

            User user = null;

            FileInputStream fileIn;
            try {
                fileIn = new FileInputStream("C:\\Users\\Ebud\\OneDrive\\Desktop\\java code\\java lesson\\UserInfo.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                user = (User) in.readObject();
                in.close();
                fileIn.close();

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
            System.out.println("serialVersionUID: "+serialVersionUID);

            System.out.println("name: " + user.name);
            System.out.println("password: " + user.password);

            user.hello();
    }
}

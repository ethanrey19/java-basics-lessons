package main.Misc.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Serialization {
    public static void main(String[] args) throws IOException {

        /* Serialization = The process of converting an object into a byte stream.
                           Persists (saves the state) the object after the program exists.
                           This byte stream can be saved as a file or sent over a network
                           Can be sent to a different machine
                           Byte stream can be saved as a file (.ser) which is platform independent
                           (Think of this as if your saving a file with the object's information)

          Deserialization = The reverse process of converting a byte stream into an object.
                             (Think of this as if you're loading a saved file)
         */

        /*
                            STEPS TO Serialize
                            --------------------------------------------------------------
                            1. Your object class should implement Serializable interface
                            2. FileOutputStream fileOut = new FileOutputStream(file path);
                            3. ObjectOutputStream out = new ObjectOutputStream(fileOut);
                            4. out.writeObject(objectName)
                            5. out.close(); fileOut.close();
                            ---------------------------------------------------------------
         */

        /*
                    IMPORTANT NOTES : 1. child classes of a parent class that implements Sizable will do so as well
                                      2. static fields are not serialized (they belong to the class, not an individual object)
                                      3. the class's definition ("class file") itself is not recorded,cast it as the object type
                                      4. Fields declared as "transient" aren't serialized, they're ignored
                                      5. serialVersionUID is a unique version ID
         */

        /*

                  serialVersionUID =    serialVersionUID is a unique ID that functions like a version #
	                					verifies that the sender and receiver of a serialized object,
	   					                have loaded classes for that object that are compatible
	   					                Ensures object will be compatible between machines
	   					                Number must match. otherwise this will cause a InvalidClassException
	   					                A SerialVersionUID will be calculated based on class properties, members, etc.
	   					                A serializable class can declare its own serialVersionUID explicitly (recommended)

         */


        User user = new User();

        user.name = "Ethan";
        user.password = "password123";

        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Ebud\\OneDrive\\Desktop\\java code\\java lesson\\UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);

            out.close();
            fileOut.close();
            System.out.println("Object saved!");
        } catch (IOException i) {
            i.printStackTrace();
        }

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("serialVersionUID: "+serialVersionUID);
    }
}



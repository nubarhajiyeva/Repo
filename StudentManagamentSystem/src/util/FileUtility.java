/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author NUBAR
 */
public class FileUtility {

    public static void writeObjToFile(Serializable object, String name) throws RuntimeException{
        try (FileOutputStream fs = new FileOutputStream(name);
                ObjectOutputStream oos = new ObjectOutputStream(fs);) {
            oos.writeObject(object);
        } catch(Exception ex){
            throw new RuntimeException();
        }
    }

    public static Object readObject(String name) {
        Object obj = null;
        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(name))) {
            obj = os.readObject();
        } finally {
            return obj;
        }
    }
}

package material.storage;

import material.model.Material;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteFile {
public static LinkedList<Material> readFile(){
    LinkedList<Material> materialList =new LinkedList<>();
    try {
        FileInputStream fis= new FileInputStream("material.dat");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Object obj=ois.readObject();
        materialList= (LinkedList<Material>)  obj;
    } catch (IOException e) {
        e.printStackTrace();
    }
    catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    return  materialList;
}
public static void writeFile(LinkedList<Material> materials){
    try {
        FileOutputStream fos=new FileOutputStream("material.dat");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(materials);
        oos.close();
        oos.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}

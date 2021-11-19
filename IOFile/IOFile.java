/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mydemo;

import java.util.List;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author NC
 */
public class IOFile {
    public static <T> List<T> doc(String filename){
        ObjectInputStream o;
        List<T> list = new ArrayList<>();
        try{
            o = new ObjectInputStream(new FileInputStream(filename));
            list = (List<T>) o.readObject();
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }
    
    public static <T> void viet(String filename, List<T> arr){
        ObjectOutputStream o; 
        try{
            o = new ObjectOutputStream(new FileOutputStream(filename));
            o.writeObject(arr);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}

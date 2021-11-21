/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

/**
 *
 * @author NC
 */
public class Main {
    public static void main(String[] args) {
        Clock c = new Clock();
        Dog d = new Dog();
        Person p = new Person();
        c.start();
        d.start();
        try{
            c.join();
            d.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        p.start();
    }
}

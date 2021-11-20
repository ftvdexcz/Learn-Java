/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author NC
 */
public class Main {
    public static void main(String[] args) {
        Account a = new Account();
        Thread1 t = new Thread1("Chong", 2500 , a);
        t.start();
        Thread1 tt = new Thread1("Vo", 1000 , a);
        tt.start();
    }
}

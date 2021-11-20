/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author NC
 */
public class Thread1 extends Thread{
    private String name;
    private long value;
    private Account a;

    public Thread1(String name, long value, Account a) {
        this.name = name;
        this.value = value;
        this.a = a;
    }
    
    public void run(){
        a.withdraw(name, value);
    }
}

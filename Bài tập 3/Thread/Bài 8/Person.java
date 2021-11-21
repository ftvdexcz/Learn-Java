/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

/**
 *
 * @author NC
 */
public class Person extends Thread {

    public void run() {
        int i = 1;
        System.out.println("Person: WOW big dog!");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        while (i <= 5) {
            System.out.println("Person: " + i * 10);
            i++;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

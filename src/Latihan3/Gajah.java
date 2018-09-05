/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author WINDOWS 10
 */

public class Gajah extends Hewan

{
    public Gajah()
    {
        
    }
    public static void testClassMethod()
    {
        System.out.println("The class method in hewan...");
    }
    //meng-override method pada class Animal
    public void testInstanceMethod()
    {
        System.out.println("The Instance method in Gajah...");
    }
    public static void main (String [] args)
    {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
        Hewan hewan = new Hewan();
        hewan.testInstanceMethod();   
        myGajah.testClassMethod();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor3;

/**
 *
 * @author ferdi
 */
// Superclass (Parent Class)
class Hewan {
    // Method Overriding (Akan dioverride di subclass)
    public void suara() {
        System.out.println("Hewan bersuara...");
    }

    // Method Overloading (Versi lain dengan parameter)
    public void suara(String jenis) {
        System.out.println(jenis + " bersuara...");
    }
}

// Subclass (Child Class) - Kucing
class Kucing extends Hewan {
    @Override
    public void suara() { // Overriding
        System.out.println("Meong!");
    }
}

// Subclass (Child Class) - Anjing
class Anjing extends Hewan {
    @Override
    public void suara() { // Overriding
        System.out.println("Guk guk!");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing(); // Polymorphism - Override
        Hewan hewan2 = new Anjing(); // Polymorphism - Override
        Hewan hewan3 = new Hewan();  // Menggunakan Overload

        hewan1.suara(); // Output: Meong!
        hewan2.suara(); // Output: Guk guk!
        hewan3.suara("Burung"); // Output: Burung bersuara...
    }
}
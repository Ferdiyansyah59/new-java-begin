/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

/**
 *
 * @author ferdi
 */
public class Main {
    public static void main(String[] args) {
        // Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Mika";
        kucing.tampilkanInfo();
        kucing.suara();
        
        System.out.println(); // Pemisah output

        // Objek Anjing
        Anjing anjing = new Anjing();
        anjing.nama = "Miko";
        anjing.tampilkanInfo();
        anjing.suara();
    }
}

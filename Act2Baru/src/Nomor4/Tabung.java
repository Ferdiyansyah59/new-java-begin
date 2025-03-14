/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor4;

/**
 *
 * @author ferdi
 */
public class Tabung {
    final double phi = 3.14;
    double jariJari;
    double tinggi;
    
    Tabung() {
        jariJari = 7;
        tinggi = 10;
    }
    
    Tabung(double r, double t){
        this.jariJari = r;
        this.tinggi = t;
    }
    
    double hitungVolume() {
        return (this.phi * jariJari * jariJari * tinggi);
    }
    
    public static void main(String[] args) {
        Tabung t1, t2;
        t1 = new Tabung();
        t2 = new Tabung(7, 5);
       
        System.out.println("Volume Tabung 1 adalah " + t1.hitungVolume());
        System.out.println("Volume Tabung 2 adalah " + t2.hitungVolume());
    }
}

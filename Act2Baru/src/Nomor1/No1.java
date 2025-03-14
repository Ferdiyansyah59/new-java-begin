/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1;

/**
 *
 * @author ferdi
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AkunBank akun = new AkunBank();

        System.out.println("Selamat datang di " + akun.bankName);

        akun.setPemilik("Budi");
        akun.setSaldo(500000);
        
        akun.tampilkanData();
    }
    
}

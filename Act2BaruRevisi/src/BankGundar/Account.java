/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankGundar;

import java.util.Scanner;

/**
 *
 * @author ferdi
 */

// Parent Class Account
public class Account{

    private double saldo;
    private String pemilikRekening;
    protected Scanner sc = new Scanner(System.in);
    
//    Constructor Account untuk menampung jumalah saldo dan pemilik rekening
    public Account(double saldo, String pemilikRekening){
        this.saldo = saldo;
        this.pemilikRekening = pemilikRekening;
    }
    
    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }else {
            System.out.println("Saldo tidak boleh di bawah 0");
        }
    }

    /**
     * @return the pemilikRekening
     */
    public String getPemilikRekening() {
        return pemilikRekening;
    }

    /**
     * @param pemilikRekening the pemilikRekening to set
     */
    public void setPemilikRekening(String pemilikRekening) {
        this.pemilikRekening = pemilikRekening;
    }
    
    public void cekSaldo(){
        System.out.println("Pemilik Rekening " + pemilikRekening);
        System.out.println("Saldo Anda: Rp." + saldo + ",-");
    }
    
    
}

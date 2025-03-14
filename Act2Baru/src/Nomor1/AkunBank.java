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
public class AkunBank {
    public String bankName = "Bank Gundar";
    private String pemilik;
    private double saldo;
    
    
    /**
     * Method Setter dan Getter dapat generate otomatis dengan netbeans
     * Caranya adalah dengan klik kanan di code editor 
     * lalu pilih refactor -> Encapsulate Fields -> centang get dan set pada setiap property 
     * lalu klik refactor
    * /
    * 

    /**
     * @return the pemilik
     */
    public String getPemilik() {
        return pemilik;
    }

    /**
     * @param pemilik the pemilik to set
     */
    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
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
        } else {
            System.out.println("Saldo tidak boleh negatif!");
        }
    }
    
    private String infoRahasia() {
        return "Nomor rekening dirahasiakan!";
    }

    public void tampilkanData() {
        System.out.println("Pemilik Akun: " + pemilik);
        System.out.println("Bank: " + bankName);
        System.out.println("Saldo: " + saldo);
        System.out.println(infoRahasia());
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author Megumi
 */
public class Es_Teh extends BarangPol {
    
    @Override
    void setNama() {
        String Es_Teh = "Es Teh";
        System.out.println("Nama Barang: " + Es_Teh);
    }

    @Override
    void setStok() {
        double stok = 100;
        System.out.println("Stok Barang: " + stok + "kotak");
    }
}

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
public class White_Kopi extends BarangPol {
    
    @Override
    void setNama() {
        String White_Kopi = "White Kopi";
        System.out.println("Nama Barang: " + White_Kopi);
    }

    @Override
    void setStok() {
        double stok = 100;
        System.out.println("Stok Barang: " + stok + "box");
    }
}

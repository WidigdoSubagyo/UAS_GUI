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
public class Kopi_Hitam extends BarangPol{

    @Override
    void setNama() {
        String Kopi_Hitam = "Kopi Hitam";
        System.out.println("Nama Barang: " + Kopi_Hitam);
    }

    @Override
    void setStok() {
        double stok = 100;
        System.out.println("Stok Barang: " + stok + "box");
    }
}

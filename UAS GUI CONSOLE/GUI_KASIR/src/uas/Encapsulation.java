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
public class Encapsulation {
    void gudangEnca() {
        BarangEnca barang = new BarangEnca();
        barang.Nama = "Mie Goreng";
        barang.setStok(100);
        
        System.out.println("~~BARANG~~");
        System.out.println("Nama Barang : " + barang.Nama);
        System.out.println("Stok Barang : " + barang.getStok());
    } 
}

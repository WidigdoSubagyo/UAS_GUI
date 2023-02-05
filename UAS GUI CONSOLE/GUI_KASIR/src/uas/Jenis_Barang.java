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
public class Jenis_Barang {
    String nama;
    
    void nama(String nm){
        nama = nm;
        System.out.println("Nama Barang: " + nama);
    }
    void stok (int x){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

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
public class KelasBarang extends Jenis_Barang {
    int jumlah;
    int stok;
    
    @Override
    public void stok(int jumlah) {
        stok = jumlah;
        System.out.println("Stok Barang: " + stok + " biji");
    }
    
    
    
}

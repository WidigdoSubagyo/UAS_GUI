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
public class Polymorphism {
    
    void gudangPoli() {
        
        System.out.println("-- BARANG --");
        BarangPol a = new BarangPol();
        a.setNama();
        a.setStok();
        
        System.out.println("-- BARANG --");
        Kopi_Hitam b = new Kopi_Hitam();
        b.setNama();
        b.setStok();
        
        System.out.println("-- BARANG --");
        White_Kopi c = new White_Kopi();
        c.setNama();
        c.setStok();
        
        System.out.println("-- BARANG --");
        Es_Teh d = new Es_Teh();
        d.setNama();
        d.setStok();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import javax.swing.JOptionPane;

/**
 *
 * @author Megumi
 */
public class Popup extends AbstractYA {


    void Popup(){
        Popup popup = new Popup();
        popup.salamA();

    }

    @Override
    void salamA() {
        JOptionPane.showMessageDialog(null, "Tekan Sekali Lagi Untuk Keluar");
    }
}

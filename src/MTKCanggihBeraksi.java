/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class MTKCanggihBeraksi {
    public static void main(String[] args) {
        MTKCanggih call = new MTKCanggih();
                            
        int tambah = call.tambah(20, 20);
        System.out.println("Hasil Tambah : " + tambah);
        int kali = call.kali (20, 10);
        System.out.println("Hasil kali : " + kali);
        int modulus = call.modulus(7, 3);
        System.out.println("Hasil modulus : " + modulus);
    }
}

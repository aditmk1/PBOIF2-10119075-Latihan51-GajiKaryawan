/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan51.gajikaryawan;

import java.util.Scanner;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan perhitungan gaji karyawan
 */

public class PBOIF210119075Latihan51GajiKaryawan {

  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manager hasil1 = new manager();
        Scanner userInput = new Scanner(System.in);
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan Nik : ");
        hasil1.setNik(userInput.nextLine());
        System.out.print("Masukkan Nama : ");
        hasil1.setNama(userInput.nextLine());
        System.out.print("Masukkan Golongan(1/2/3) :");
        hasil1.setGolongan(userInput.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag ) :");
        hasil1.setJabatan(userInput.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        hasil1.setKehadiran(userInput.nextInt());
        System.out.println("");
        System.out.print("====Hasil Perhitungan====");
        System.out.println("NIK      : "+hasil1.getNik());
        System.out.println("NAMA     : "+hasil1.getNama());
        System.out.println("GOLONGAN : "+hasil1.getGolongan());
        System.out.println("JABATAN  : "+hasil1.getJabatan());
        System.out.println("TUNJANGAN GOLONGAN  : "+hasil1.tunjangGolongan(hasil1.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   : "+hasil1.tunjangJabatan(hasil1.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+hasil1.tunjangKehadiran(hasil1.getKehadiran()));
        System.out.println("GAJI TOTAL : "+hasil1.gajitotal());
    }
    
}

    


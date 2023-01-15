package PackageMain;

import View.*;
import Entity.*;
import Controller.*;

import java.util.ArrayList;
import java.util.Scanner;

import View.*;

public class Main {
    Scanner input = new Scanner(System.in);
    ArrayList<ObatEntity> obaatt = new ArrayList<ObatEntity>();
    public ControllerObat obatt = new ControllerObat();
    public ControllerPetugas petugas = new ControllerPetugas();

    public static void main(String[] args) {
        LoginGUI logUI = new LoginGUI();

//        Scanner input = new Scanner(System.in);
////        Main main = new Main();
//        System.out.println("SELAMAT DATANG DI APOTEK !! ");
//
//        int pilih;
//
//        do {
//            System.out.println("1. Login petugas");
//            System.out.println("0. Exit");
//            System.out.println(" Pilih : ");
//            pilih = input.nextInt();
//
//            switch (pilih) {
//                case 1:
//                    System.out.print(" Username : ");
//                    String user = input.next();
//                    System.out.print(" Password : ");
//                    String psw = input.next();
//                    main.login(user, psw);
//            }
//        } while (pilih != 0);
//    }
//
//    // diluar psvm
//    //login
//    void login(String user, String psw) {
//        if ((psw.equals("111")) && (user.equals("desy"))) {
//            System.out.println(" Login Successful");
//            System.out.println(" ");
//            menuutama();
//        } else {
//            System.out.println("Maaf pasword salah");
//        }
//    }
//
//    //menuutama
//    void menuutama() {
//        int pil;
//        do {
//            System.out.println("===Menu Utama===");
//            System.out.println("1. Data Petugas");
//            System.out.println("2. Data Obat");
//            System.out.println("0. Exit");
//            System.out.println(" Pilih : ");
//            pil = input.nextInt();
//
//            switch (pil) {
//                case 1:
//                    MenuPetugas();
//                case 2:
//                    MenuObat();
//            }
//        } while (pil != 0);
//    }
//
//    //menuPetugas
//    void MenuPetugas() {
//        int pilihan;
//        do {
//            System.out.println("===Menu Petugas===");
//            System.out.println("1. Tambah data petugas");
//            System.out.println("2. Tampilkan data petugas");
//            System.out.println("0. Exit");
//            System.out.println(" Pilih :");
//            pilihan = input.nextInt();
//
//            switch (pilihan) {
//                case 1:
//                    insertpetugas();
//                case 2:
//                    viewpetugas();
//            }
//        } while (pilihan != 0);
//    }
//
//    //viewpetugas
//    void viewpetugas() {
//        if(petugas.petugass.getDataPetugas().size()>0){
//            for (int i = 0; i < petugas.petugass.getDataPetugas().size(); i++) {
//                System.out.println("\n"
//                        +" Nama : " + petugas.petugass.getDataPetugas().get(i).getNama()+"\n"
//                        +" ID : " + petugas.petugass.getDataPetugas().get(i).getId()+"\n");
//            }
//        }else{
//            System.out.println("Data Obat Kosong!!");
//        }
//
////        if (petugas.petugass.getDataPetugas().size() > 0) {
////            for (int i = 0; i < petugas.petugass.getDataPetugas().size(); i++) {
////                System.out.println(" Nama : " + petugas.petugass.getDataPetugas().get(i).getNama());
////                System.out.println(" ID : " + petugas.petugass.getDataPetugas().get(i).getId());
////            }
////        } else {
////            System.out.println("Data Kosong!!");
////        }
//    }
//
//    //insertpetugas
//    void insertpetugas() {
//        System.out.println(" Masukkan Nama : ");
//        String nama = input.next();
//        System.out.println(" Masukkan Id : ");
//        String id = input.next();
//        petugas.insert(new PetugasEntity(nama,id));
//    }
//
//    //menuobat
//    void MenuObat() {
//        int pili;
//        do {
//            System.out.println("===Menu Obat===");
//            System.out.println("1. Tambah data obat");
//            System.out.println("2. Tampilkan data obat");
//            System.out.println("3. Ubah data obat");
//            System.out.println("4. Hapus data obat");
//            System.out.println("0. Exit");
//            System.out.println(" Pilih :");
//            pili = input.nextInt();
//
//            switch (pili) {
//                case 1:
//                    insertobat();
//                    break;
//                case 2:
//                    viewobat();
//                    break;
//                case 3:
//                    updateobat();
//                    break;
//                case 4 :
//                    deleteobat();
//                    break;
//            }
//        } while (pili != 0);
//    }
//
//    //viewobat
//    void viewobat() {
//        if(obatt.obt.getDataObat().size()>0){
//            int NoUrut = 0;
//            for (int i = 0; i < obatt.obt.getDataObat().size(); i++) {
//                NoUrut++;
//                System.out.println("\n"
//                +" [Data " + NoUrut + "]"+"\n"
//                +" Nama Obat      : "+obatt.obt.getDataObat().get(i).getNamaobat()+"\n"
//                +" Jenis Obat     : "+obatt.obt.getDataObat().get(i).getJenisobat()+"\n"
//                +" Harga          : "+obatt.obt.getDataObat().get(i).getHarga()+"\n"
//                +" RefNumber   : "+obatt.obt.getDataObat().get(i).getRefnumber()+"\n");
//            }
//        }else{
//            System.out.println("Data Obat Kosong!!");
//        }
//    }
//
//    //insertobat
//    void insertobat() {
//        int pil =0;
//        do {
//            System.out.println(" Masukkan RefNumber :  ");
//            String refnumber = input.next();
//
//            System.out.println(" Masukkan Nama Obat : ");
//            String namaobat = input.next();
//
//            System.out.println(" Masukkan Jenis Obat : ");
//            String jenisobat = input.next();
//
//            System.out.println(" Masukkan Harga : ");
//            String harga = input.next();
//
//            obatt.insert(new ObatEntity(namaobat, jenisobat, harga, refnumber));
//            System.out.println(" Data Obat Berhasil Disimpan!!\n");
//            System.out.println("apakah ingin tambah lagi? (1/0)");
//             pil = input.nextInt();
//        } while (pil != 0);
//    }
//
//    //updateobat
//    void updateobat() {
//        if(obatt.obt.getDataObat().size()>0){
//            for (int i = 0; i < obatt.obt.getDataObat().size(); i++) {
//                System.out.println("["+i+"] "+obatt.obt.getDataObat().get(i).getNamaobat());
//            }
//
//            System.out.println("Pilih Index Buku : ");
//            int selectIndex = input.nextInt();
//
//            System.out.println(" Masukkan RefNumber :  ");
//            String refnumber = input.next();
//
//            System.out.println(" Masukkan Nama Obat : ");
//            String namaobat = input.next();
//
//            System.out.println(" Masukkan Jenis Obat : ");
//            String jenisobat = input.next();
//
//            System.out.println(" Masukkan Harga : ");
//            String harga = input.next();
//
//            obatt.update(refnumber, new ObatEntity(namaobat,jenisobat,harga,refnumber));
//            System.out.println("Data Buku Berhasil Diubah !!\n");
//
//
//        }else{
//            System.out.println("Data Obat Kosong\n");
//        }
//    }
//
//    //deleteobat
//    void deleteobat(){
//        if(obatt.obt.getDataObat().size()>0){
//            for (int i = 0; i < obatt.obt.getDataObat().size(); i++) {
//                System.out.println("["+i+"] "+obatt.obt.getDataObat().get(i).getNamaobat());
//            }
//
//            System.out.println("Pilih Index Buku : ");
//            int selectIndex = input.nextInt();
//
//            obatt.obt.getDataObat().remove(selectIndex);
//            System.out.print("Data Buku Berhasil Dihapus !!\n");
//        }else{
//            System.out.println("Data Buku Kosong\n");
//        }
//    }
    }
}


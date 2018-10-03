package patriciafiona_2017103264;

import java.util.Scanner;
import java.util.ArrayList;

public class PatriciaFiona_2017103264 {

    static Scanner scan = new Scanner (System.in);
    static ArrayList<String> namaBarang = new ArrayList<String>();
    static ArrayList<Integer> kodeBarang = new ArrayList<Integer>();
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        System.out.println("----------------------------------------------------");
        System.out.println("                    Data Barang");
        System.out.println("----------------------------------------------------"); 
        System.out.println("[1] Tambah data barang");
        System.out.println("[2] Hapus data barang");
        System.out.println("[3] Cari barang");
        System.out.println("[4] Lihat list-list barang");
        System.out.println("[5] Keluar");
        System.out.println("----------------------------------------------------"); 
        System.out.print("Pilihan anda = ");
        int pilih = scan.nextInt();
        
        switch(pilih){
            case 1:tambah();break;
            case 2:hapus();break;
            case 3:cari();break;
            case 4:lihat();break;
            case 5:System.exit(0);break;
            default:System.out.println("Silahkan input pilihan yang disediakan....");menu();
        }
    }
    
    public static void tambah(){
        System.out.println("----------------------------------------------------");
        System.out.println("                Tambah Data Barang                  ");
        System.out.println("----------------------------------------------------");
        System.out.println("Masukkan nama barang = ");
        scan.nextLine();
        String n_Barang= scan.nextLine();
        namaBarang.add(n_Barang);
        System.out.println("Masukkan kode barang ('"+n_Barang+"')");
        int k_Barang = scan.nextInt();
        kodeBarang.add(k_Barang);
        
        System.out.println("Data Berhasil disimpan");
        
        //kembali ke menu
        lihat();
        menu();
    }
    
    public static void hapus(){
        System.out.println("----------------------------------------------------");
        System.out.println("                Hapus Data Barang                  ");
        System.out.println("----------------------------------------------------");
        System.out.println("[1] Hapus berdasarkan kode barang");
        System.out.println("[2] Hapus berdasarkan nama barang");
        System.out.println("----------------------------------------------------");
        System.out.print("Pilihan anda = ");
        int pilih_h = scan.nextInt();
        switch(pilih_h){
            case 1:
                System.out.println("Masukkan kode barang = ");
                int kode = scan.nextInt();
                //cari dalam arraylist index ke berapa
                
                if(kodeBarang.contains(kode)==true){
                    //ambil indeks ke berapa baru hapus
                    int a = kodeBarang.indexOf(kode);
                    kodeBarang.remove(a);
                    namaBarang.remove(a);
                    System.out.println("Berhasil di hapus");
                }else{
                    System.out.println("Kode Barang TIDAK terdapat dalam ArrayList...\n Silahkan ulangi proses...");
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("Masukkan nama barang = ");
                scan.nextLine();
                String nama = scan.nextLine();
                //cari dalam arraylist index ke berapa
                
                if(namaBarang.contains(nama)==true){
                    //ambil indeks ke berapa baru hapus
                    int a = namaBarang.indexOf(nama);
                    kodeBarang.remove(a);
                    namaBarang.remove(a);
                    System.out.println("Berhasil di hapus");
                }else{
                    System.out.println("Nama Barang TIDAK terdapat dalam ArrayList...\n Silahkan ulangi proses...");
                    System.out.println("\n");
                }
                break;
            default: 
                System.out.println("Silahkan masukkan sesuai pilihan yang ada...");
                hapus();
                break;
        }
        lihat();
        menu();
    }
    
    public static void lihat(){
        System.out.println("----------------------------------------------------");
        System.out.println("                    Lihat data                      ");
        System.out.println("----------------------------------------------------");
        System.out.println("Berikut adalah data-data barang : ");
        System.out.println("No.   | Kode Barang        | Nama Barang");
        for(int i=0;i<namaBarang.size();i++){
            System.out.printf("%-6d %-20d %-10s \n" ,(i+1),kodeBarang.get(i),namaBarang.get(i));
        }
        System.out.println("\n");
        menu();
    }
    
    public static void cari(){
        System.out.println("----------------------------------------------------");
        System.out.println("                    Cari Barang");
        System.out.println("----------------------------------------------------"); 
        System.out.println("[1] Hapus berdasarkan kode barang");
        System.out.println("[2] Hapus berdasarkan nama barang");
        System.out.println("----------------------------------------------------");
        System.out.print("Pilihan anda = ");
        int pilih_c = scan.nextInt();
        
        switch(pilih_c){
            case 1:
                System.out.println("Masukkan kode barang = ");
                int kode = scan.nextInt();
                //cari dalam arraylist index ke berapa
                
                if(kodeBarang.contains(kode)==true){
                    //ambil indeks ke berapa baru hapus
                    int a = kodeBarang.indexOf(kode);
                    System.out.println("Keterangan : ");
                    System.out.println("Nama barang = "+namaBarang.get(a));
                    System.out.println("Kode Barang = "+kodeBarang.get(a));
                }else{
                    System.out.println("Kode Barang TIDAK terdapat dalam ArrayList...\n Silahkan ulangi proses...");
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("Masukkan nama barang = ");
                scan.nextLine();
                String nama = scan.nextLine();
                //cari dalam arraylist index ke berapa
                
                if(namaBarang.contains(nama)==true){
                    //ambil indeks ke berapa baru hapus
                    int a = namaBarang.indexOf(nama);
                    System.out.println("Keterangan : ");
                    System.out.println("Nama barang = "+namaBarang.get(a));
                    System.out.println("Kode Barang = "+kodeBarang.get(a));
                    
                }else{
                    System.out.println("Nama Barang TIDAK terdapat dalam ArrayList...\n Silahkan ulangi proses...");
                    System.out.println("\n");
                }
                break;
            default: 
                System.out.println("Silahkan masukkan sesuai pilihan yang ada...");
                cari();
                break;
        }
    }
}

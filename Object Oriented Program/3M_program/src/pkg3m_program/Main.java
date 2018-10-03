/*
Nama        : Patricia Fiona
Kelas       : 03PAIF
NIM         : 2017103264
Jurusan     : Informatika

 */

package pkg3m_program;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static String quit_insert;
    static String pilih;
    static ArrayList< Integer > angka = new ArrayList< Integer > ();
    static int tampung=0;
    static double mean, median, modus;
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void input(){
        
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("____________________________________________________");
            System.out.println("                    Insert Number");
            System.out.println("____________________________________________________");
            System.out.println("Exp : 11,2,3,7,5,8");
            System.out.print("\nPlease insert numbers : ");
            //proses explode angkanya dan masukkan ke dalam arraylist
            String aaa = scan.nextLine();
            String[] explode = aaa.replaceAll(" ","").split(",");

            for(int i=0; i<explode.length;i++){
                angka.add(Integer.parseInt(explode[i]));
            }

            System.out.print("Your Number Now : "+angka+"\n");
            System.out.println("____________________________________________________");
        }catch (Exception ex){
            System.out.println("____________________________________________________");
            System.out.println("!!! Warning !!!\nSyntax Error... \nPlease try input again");
            input();
        }
        
    }
    
    public static void menu(){
        System.out.println("____________________________________________________");
        System.out.println("                Mean , Modus, Median");
        System.out.println("____________________________________________________");
        System.out.println("[1] Search Mean");
        System.out.println("[2] Search Median");
        System.out.println("[3] Search Modus");
        System.out.println("[4] Exit");
        System.out.println("----------------------------------------------------");
        System.out.print("Choose : ");
        pilih = scan.next();
        
        try{
            int pil = Integer.parseInt(pilih);
            switch(pil){
                case 1: mean();break;
                case 2: median();break;
                case 3: modus();break;
                case 4: System.out.println("Okey, have a nice day");System.exit(0);
                default: 
                    System.out.println("____________________________________________________");
                    System.out.println("          Sorry, Please choose 1, 2, 3 Or 4");
                    menu();break;
            }
        }catch (NumberFormatException ex){
            System.out.println("____________________________________________________");
            System.out.println("           Sorry, Please choose 1, 2, 3 Or 4");
            menu();
        }
        
    }
    
    public static void mean(){
        input();
        
        //proses hitung mean
        for(int i=0;i<angka.size();i++){
            tampung = tampung + (int)angka.get(i);
        }
        mean = (double)tampung/angka.size();
        System.out.println("Hasil mean dari angka : "+angka);
        System.out.println("Mean-nya      : "+mean);
        angka.clear();
        menu();
    }
    
    public static void median(){
        input();
        
        //proses hitung median
        
        //sort angkanya terlebih dahulu
        Collections.sort(angka);
        
        if((int)angka.size()%2==0){
            int n = angka.size()/2;
            n = n-1; //karena di arraylist mulainya dari 0 bukan 1
            
            int a = (int)angka.get(n);int b = (int)angka.get(n+1);
            median = (a+b);
            median = (double) median*1/2;
            
            System.out.println("Diketahui banyak angkanya 'Genap'");
            System.out.println("Hasil median dari angka : "+angka);
            System.out.println("Median : "+median);
            
        }else if ((int)angka.size()%2!=0){
            median= (double) angka.get(((angka.size()+1)/2)-1); // dikurang satu karena arraylist-nya mulai dari 0 bukan 1
            System.out.println("Diketahui banyak angkanya 'Ganjil'");
            System.out.println("Hasil median dari angka : "+angka);
            System.out.println("Median : "+median);
        }
        angka.clear();
        menu();
    }
    
    public static void modus(){
        input();
        
        Collections.sort(angka);
        
        int c=(int)angka.get(0);
        int b=0;
        int hasil=0,besar=0;
        for (int i=0; i<angka.size() ;i++){
          if(angka.get(i)==c){
          System.out.print(angka.get(i)+" ");
          System.out.println(++b);
          if(b>besar){
                    besar=b;
                    hasil=c;
                    }
            }else{
                c=angka.get(i);
                b=1;
            }
        }
        System.out.println("Hasil median dari angka : "+angka);
        System.out.println("Modus = "+hasil);
        angka.clear();
        menu();
    }
    
}

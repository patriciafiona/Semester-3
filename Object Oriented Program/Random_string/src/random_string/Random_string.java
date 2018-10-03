/*
Nama        : Patricia Fiona
Kelas       : 03PAIF
NIM         : 2017103264
Jurusan     : Informatika
 */
package random_string;

import java.util.Random;
import java.util.Scanner;

public class Random_string {

    public static Scanner scan = new Scanner(System.in);
    public static char hasil;
    public static String input;
    
    public static void main(String[] args)throws NumberFormatException{
        menu();
    }
    
    public static void menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("____________________________________________________");
        System.out.println("                Random String Program");
        System.out.println("____________________________________________________");
        System.out.print("Input Some Text Here              : ");
        input = scan.nextLine();
        process(input);
    }
    
    public static void process(String input){
        System.out.print("\nHasil dari Random String adalah = ");
        
        for(int i= 0; i<input.length();i++){//buat nentuin berapa banyak yang kena uppercase
            Random rand = new Random();
            int n = rand.nextInt(input.length())+0;
            if(n%2==0){
                hasil = input.charAt(i);
                hasil = Character.toUpperCase(hasil);
                System.out.print(hasil);
            }else{
                hasil = input.charAt(i);
                hasil = Character.toLowerCase(hasil);
                System.out.print(hasil);
            }
            
        }
        
        repeat(input);
        
    }
    
    public static void repeat(String input){
        System.out.println("\nDo You Want To Repeat Input This Programm ???");
        System.out.println("[1] Yes, of course");
        System.out.println("[2] No, Just quit this program");
        System.out.println("----------------------------------------------------");
        System.out.print("Choose : ");
        String pilih = scan.next();
        
        try{
            int pil = Integer.parseInt(pilih);
            switch(pil){
                case 1: input=null;menu();break;
                case 2: System.out.println("Okey, have a nice day");System.exit(0);
                default: 
                    System.out.println("________________________________________________");
                    System.out.println("          Sorry, Please choose 1 OR 2");
                    System.out.println("________________________________________________");
                    repeat(input);break;
            }
        }catch (NumberFormatException ex){
            System.out.println("________________________________________________");
            System.out.println("           Sorry, Please choose 1 OR 2");
            System.out.println("________________________________________________");
            repeat(input);
        }
    }
    
}

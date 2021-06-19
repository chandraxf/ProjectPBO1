package pembayaran;
import java.util.Scanner;

//Construktor
    class pembayaran{
    String nama;
    String npm;
    String jurusan;
    
    pembayaran(){
        System.out.println("Test Kontuktur");
    }
    }

public class halamanutama {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        bayar data = new bayar();
        byte pilih;
        System.out.println("--------------------------------");
        System.out.println("1. Beli UC PUBG ");
        System.out.println("2. Beli Diamond Mobile Legend");
        System.out.println("--------------------------------");
        System.out.println("Masukan Pilihan : ");
        pilih = input.nextByte();
        if (pilih == 1){
            data.pubg();
        }else if (pilih == 2){
           data.ml();
    }
        pembayaran pay = new pembayaran();
        
        
    }
      
}

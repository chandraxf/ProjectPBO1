package pembayaran;
import java.util.Scanner;

    //Construktor
    class pubg{
    
    }
    class ml{
    
    }
    class ff{
    
    }

    //atribut
public class halamanutama {
    
    //method
    public void pubg(){
        System.out.println("Pengisian UC PUBGM");
        System.out.println("Daftar UC: ");
        System.out.println("1. 60UC : 15rb");
        System.out.println("2. 200UC : 50rb");
        System.out.println("3. 620UC : 110rb");
    }
    public void ml(){
        System.out.println("Pengisian Mobile Legends");
        System.out.println("Daftar Diamond: ");
        System.out.println("1. 60 Diamond : 15rb");
        System.out.println("2. 286 Diamond : 70rb");
        System.out.println("3. 756 Diamond : 130rb");
    }
    public void ff(){
        System.out.println("Pengisian Diamond Free Fire");
        System.out.println("Daftar Diamond: ");
        System.out.println("1. 50 Diamond : 5rb");
        System.out.println("2. 200 Diamond : 20rb");
        System.out.println("3. 600 Diamond : 90rb");
    }
    public void pb(){
        System.out.println("Pengisian Cash Point Blank");
        System.out.println("Daftar Cash: ");
        System.out.println("1. 1000 Cash : 10rb");
        System.out.println("2. 2000 Cash : 19rb");
        System.out.println("3. 5000 Cash : 49rb");
    }
    public static void main(String[] args) {
    String pembayaran;
    String pubg;
    String ml;
    String ff;
    String pb;
    String total;
    Double hitung;
    byte pilih;
        Scanner input= new Scanner(System.in);
        halamanutama menu = new halamanutama();
        System.out.println("Pilih Menu : ");
        System.out.println("1.PUBG, 2.ML ,3.FF, 4.PB");
        System.out.println("Masukan Pilihan : ");
        pilih = input.nextByte();
        
        if (pilih == 1){
        menu.pubg();
        }else if (pilih == 2){
        menu.ml();
        }
        else if (pilih == 3){
            menu.ff();
        }
        else if (pilih == 4){
            menu.pb();
        }else{
            System.out.println("Pilihan Tidak ada!!!");
        }
        
        
        
    }
      
}

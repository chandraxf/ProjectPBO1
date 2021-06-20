package class1;
import java.util.Scanner;
public class class1 {
    Scanner input= new Scanner(System.in);
    private int pilih;
    private int pembayaran;
    private int pubg;
    private int ml;
    private int ff;
    private int pb;
    private int id;
    private int total;
    
    //construktor
    public class1(){
        System.out.println("===============================");
    }
    public class1(int a){
        class1 menu = new class1();       
        System.out.println("Pilih Menu : ");
        System.out.println("1.PUBG, 2.ML ,3.FF, 4.PB");
        System.out.println("Masukan Pilihan : ");
        simpan = input.nextInt();
        menu.setPilih(simpan);
        
        switch(menu.getPilih()){
            case 1:
            menu.pubg();
            menu.inputPubg();
            break;
            case 2:
            menu.ml();
            menu.inputMl();
            break;
            case 3:
            menu.ff();
            menu.inputFf();
            break;
            case 4:
            menu.pb();
            menu.inputPb();
            break;
            default :
            System.out.println("Pilihan Tidak ada!!!");
        } 
    }
    public class1(int a, int b){
        int x = b - a;
        System.out.println("Harga      : "+a);
        System.out.println("Total Uang : "+b);
        System.out.println("Kembalian  : "+x);
    }     
    
    public static void main(String[] args) {
        //Halaman Utama
        int a=1;
        class1 cls = new class1(a);
               
    }
    
    //Method Setter dan getter

    public int getPilih() {
        return pilih;
    }

    public void setPilih(int pilih) {
        this.pilih = pilih;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }       

    public int getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(int pembayaran) {
        this.pembayaran = pembayaran;
    }

    public int getPubg() {
        return pubg;
    }

    public void setPubg(int pubg) {
        this.pubg = pubg;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    public int getFf() {
        return ff;
    }

    public void setFf(int ff) {
        this.ff = ff;
    }

    public int getPb() {
        return pb;
    }

    public void setPb(int pb) {
        this.pb = pb;
    }
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
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
        System.out.println("3. 600 Diamond : 60rb");
    }
    public void pb(){
        System.out.println("Pengisian Cash Point Blank");
        System.out.println("Daftar Cash: ");
        System.out.println("1. 1000 Cash : 10rb");
        System.out.println("2. 2000 Cash : 19rb");
        System.out.println("3. 5000 Cash : 49rb");
    }
    int idx, jlh, simpan;
    public void inputPubg(){
            class1 menu = new class1();          
            System.out.println("Masukan ID : ");
            idx=input.nextInt();
            System.out.println("Masukan pilihan : ");
            jlh=input.nextInt();
            System.out.println("Masukan Uang : ");
            simpan = input.nextInt();
            menu.setTotal(simpan);
            menu.setId(idx);
            menu.setPubg(jlh);
            System.out.println("ID : "+menu.getId());
            System.out.println("Pilihan UC : "+menu.getPubg());
            hargaPubg();
    }
    
    
    public void hargaPubg(){
        class1 menu = new class1();
        int jlhx, harga;
         switch(jlh){
             case 1:
                 jlhx = 60;
                 harga = 15000;
                 System.out.println("Jumlah UC : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);                 
                 break;
             case 2:
                 jlhx = 200;
                 harga = 50000;
                 System.out.println("Jumlah UC : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
                 break;
             case 3:
                 jlhx = 610;
                 harga = 110000;
                 System.out.println("Jumlah UC : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
                 break;
             default:
                 jlhx = 0;
                 harga = 0;
                 System.out.println("Jumlah UC : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);               
         }
         
         class1 ttotal = new class1(menu.getPembayaran(),menu.getTotal());
    }
           
         public void inputMl(){
            class1 menu = new class1();          
            System.out.println("Masukan ID : ");
            idx=input.nextInt();
            System.out.println("Masukan pilihan : ");
            jlh=input.nextInt();
            System.out.println("Masukan Uang : ");
            simpan = input.nextInt();
            menu.setTotal(simpan);
            menu.setId(idx);
            menu.setMl(jlh);
            System.out.println("ID : "+menu.getId());
            System.out.println("Pilihan DM : "+menu.getMl());
            hargaMl(); 
             
         }
    
        public void hargaMl(){
            class1 menu = new class1();
            int jlhx, harga;
            switch(jlh){
             case 1:
                 jlhx = 60;
                 harga = 15000;
                 System.out.println("Jumlah DM : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);                
                 break;
             case 2:
                 jlhx = 286;
                 harga = 70000;
                 System.out.println("Jumlah DM : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
                 break;
             case 3:
                 jlhx = 756;
                 harga = 130000;
                 System.out.println("Jumlah DM : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
                 break;
             default:
                 jlhx = 0;
                 harga = 0;
                 System.out.println("Jumlah DM : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
         }
           
            class1 ttotal = new class1(menu.getPembayaran(),menu.getTotal());
         
    }
        public void inputFf(){
            class1 menu = new class1();          
            System.out.println("Masukan ID : ");
            idx=input.nextInt();
            System.out.println("Masukan pilihan : ");
            jlh=input.nextInt();
            System.out.println("Masukan Uang : ");
            simpan = input.nextInt();
            menu.setTotal(simpan);
            menu.setId(idx);
            menu.setFf(jlh);
            System.out.println("ID : "+menu.getId());
            System.out.println("Pilihan DM : "+menu.getFf());
            hargaFf(); 
             
         }
    
        public void hargaFf(){
            class1 menu = new class1();
            int jlhx, harga;
            switch(jlh){
             case 1:
                 jlhx = 50;
                 harga = 5000;
                 System.out.println("Jumlah DM : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
                 break;
             case 2:
                 jlhx = 200;
                 harga = 20000;
                 System.out.println("Jumlah DM : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
                 break;
             case 3:
                 jlhx = 600;
                 harga = 60000;
                 System.out.println("Jumlah DM : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
                 break;
             default:
                 jlhx = 0;
                 harga = 0;
                 System.out.println("Jumlah DM : "+jlhx);             
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
         }
            
            class1 ttotal = new class1(menu.getPembayaran(),menu.getTotal());
         
    }
        public void inputPb(){
            class1 menu = new class1();          
            System.out.println("Masukan ID : ");
            idx=input.nextInt();
            System.out.println("Masukan pilihan : ");
            jlh=input.nextInt();
            System.out.println("Masukan Uang : ");
            simpan = input.nextInt();
            menu.setTotal(simpan);
            menu.setId(idx);
            menu.setPb(jlh);
            System.out.println("ID : "+menu.getId());
            System.out.println("Pilihan Cash : "+menu.getPb());
            hargaPb(); 
             
         }
    
        public void hargaPb(){
            class1 menu = new class1();
            int jlhx, harga;
            switch(jlh){
             case 1:
                 jlhx = 1000;
                 harga = 10000;
                 System.out.println("Jumlah Cash : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
                 break;
             case 2:
                 jlhx = 2000;
                 harga = 19000;
                 System.out.println("Jumlah Cash : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
                 break;
             case 3:
                 jlhx = 5000;
                 harga = 49000;
                 System.out.println("Jumlah Cash : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
                 break;
             default:
                 jlhx = 0;
                 harga = 0;
                 System.out.println("Jumlah Cash : "+jlhx);
                 menu.setPembayaran(harga);
                 menu.setTotal(simpan);
         }
            
            class1 ttotal = new class1(menu.getPembayaran(),menu.getTotal());
         
    }
      
}
   
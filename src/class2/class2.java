package class2;
import java.util.Scanner;
public class class2 {
    Scanner in = new Scanner(System.in);
    //Artibut
    private int penambahan;
    private int pengurangan;
    private int perkalian;
    private int angka;
    
    public class2(){
        System.out.println("==========================");
    }
    
    public class2(int a){
        int pilih;
        System.out.println("==========================");
        System.out.println("1. Program Hitung 2. About");
        System.out.println("Masukan Pilihan (1 / 2) : ");
        pilih = in.nextInt();
        //Halaman Utama
        switch(pilih){
            case 1:
                halaman();
                break;
            case 2:
                about();
                break;
            default :
                System.out.println("Pilihan tidak ada!!!");
                
        }
    }

        //Setter Getter
    public int getPenambahan() {
        return penambahan;
    }

    public void setPenambahan(int penambahan) {
        this.penambahan = penambahan;
    }

    public int getPengurangan() {
        return pengurangan;
    }

    public void setPengurangan(int pengurangan) {
        this.pengurangan = pengurangan;
    }

    public int getPerkalian() {
        return perkalian;
    }

    public void setPerkalian(int perkalian) {
        this.perkalian = perkalian;
    }

    public int getAngka() {
        return angka;
    }

    public void setAngka(int angka) {
        this.angka = angka;
    }
    
    
    public static void main(String[] args) {
        class2 cls = new class2();
              
    }
    
    //method
    static int hitungTambah(int x, int y){
    int hasil = x + y;
    return hasil;
    }
    static int hitungPengurangan(int x, int y){
    int hasil = x - y;
    return hasil;
    }
    static int hitungKali(int x, int y){
    int hasil = x * y;
    return hasil;
    }
    static int hitungBagi(int x, int y){
    int hasil = x / y;
    return hasil;
    }
    
    static void tampilanHitung(){
        Scanner in = new Scanner(System.in);
        class2 cls = new class2();
        System.out.println("Kalkulator Penjumlahan");
        int angka1, angka2;
        System.out.println("Masukan Angka Pertama : ");
        angka1=in.nextInt();
        System.out.println("Masukan Angka Kedua : ");
        angka2=in.nextInt();
        cls.setPenambahan(angka1);
        cls.setAngka(angka2);
        System.out.println("Hasil + : "+ hitungTambah(cls.getPenambahan(), cls.getAngka()));
    }
    static void tampilanPengurangan(){
        Scanner in = new Scanner(System.in);
        class2 cls = new class2();
        System.out.println("Kalkulator Pengurangan");
        int angka1, angka2;
        System.out.println("Masukan Angka Pertama : ");
        angka1=in.nextInt();
        System.out.println("Masukan Angka Kedua : ");
        angka2=in.nextInt();
        cls.setPengurangan(angka1);
        cls.setAngka(angka2);
        System.out.println("Hasil - : "+ hitungPengurangan(cls.getPengurangan(), cls.getAngka()));
    }
    static void tampilanPerkalian(){
        Scanner in = new Scanner(System.in);
        class2 cls = new class2();
        System.out.println("Kalkulator Perkalian");
        int angka1, angka2;
        System.out.println("Masukan Angka Pertama : ");
        angka1=in.nextInt();
        System.out.println("Masukan Angka Kedua : ");
        angka2=in.nextInt();
        cls.setPerkalian(angka1);
        cls.setAngka(angka2);
        System.out.println("Hasil x : "+ hitungKali(cls.getPerkalian(), cls.getAngka()));
    }
    static void tampilanPembagian(){
        Scanner in = new Scanner(System.in);
        class2 cls = new class2();
        System.out.println("Kalkulator Pembagian");
        int angka1, angka2;
        System.out.println("Masukan Angka Pertama : ");
        angka1=in.nextInt();
        System.out.println("Masukan Angka Kedua : ");
        angka2=in.nextInt();
        cls.setAngka(angka2);
        System.out.println("Hasil / : "+ hitungBagi(angka1, cls.getAngka()));
    }
    static void halaman(){
        Scanner in = new Scanner(System.in);
        int pilih;
     // main class
        System.out.println("==================================");
        System.out.println("Kalkulator Dasar");
        System.out.println("1. Penjumlahan 2. Pengurangan");
        System.out.println("3. Perkalian   4. Pembagian");
        System.out.println("==================================");
        System.out.println("Masukan (1,2,3,4) : ");
        pilih = in.nextInt();
        switch (pilih){
            case 1:
                tampilanHitung();
                break;
            case 2:
                tampilanPengurangan();
                break;
            case 3:
                tampilanPerkalian();
                break;
            case 4:
                tampilanPembagian();
                break;
            default :
                System.out.println("Pilihan tidak ada!!!");
        }       
        
    }
    static void about(){
        System.out.println("+========================+");
        System.out.println("| Program Kalkulator     |");
        System.out.println("|              Sederhana |");
        System.out.println("| Chandra Endira         |");
        System.out.println("| 19630207 - 4C FTI      |");
        System.out.println("+========================+");
    }
    
}

package class3;
import java.util.Scanner;
import class1.class1;
import class2.class2;
public class class3 {
    public class3(){
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("1. Pengisian Voucher");
        System.out.println("2. Kalkulator Sederhana");
        System.out.println("--------------------------");
        System.out.println("Masukan input : ");
        int a = in.nextInt();
        switch(a){
            case 1:
                class1 cls = new class1(a);
                break;
            case 2:
                class2 cls2 = new class2(a);
                break;
            default :
                System.out.println("Pilihan tidak ada!!!");
        }
    
    }
    public class3(int a){
        System.out.println("-= Terima Kasih =-");
    }
    public static void main(String[] args) {
        int a=1;
        class1 clsi = new class1();
        class3 clsx = new class3();
        class2 clsk = new class2();
        class3 cls3 = new class3(a);
        
    }
    
}

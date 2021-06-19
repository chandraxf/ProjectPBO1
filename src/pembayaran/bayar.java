/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaran;
import java.util.Scanner;

/**
 *
 * @author CHDHX
 */
public class bayar {
  //ini atribut
  float jumlah, id;
  Scanner input = new Scanner(System.in);
  
  //method atau fungsi
  void pubg(){
      System.out.println("Pengisian UC PUBG");
      System.out.println("Masukan ID: ");
      id = input.nextFloat();
      System.out.println("Masukan Jumlah : ");
      jumlah = input.nextFloat();
      System.out.println("ID : " +id);
      System.out.println("Jumlah : "+jumlah);
  }
  void ml(){
      System.out.println("Pengisian DIAMOND ML");
      System.out.println("Masukan ID: ");
      id = input.nextFloat();
      System.out.println("Masukan Jumlah : ");
      jumlah = input.nextFloat();
      System.out.println("ID : " +id);
      System.out.println("Jumlah : "+jumlah);
  }
}

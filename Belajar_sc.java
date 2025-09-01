/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajar_sc;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Belajar_sc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jurusan;

    Scanner in = new Scanner (System.in);
    System.out.print("Pilihan : \n 1. RPL \n 2. TKJ \n 3. Animasi \n\n Masukan pilihan :");
    jurusan = in.nextInt();
    switch (jurusan){
    case 1 : System.out.println("Anda memilih jurusan RPL");
        break;
    case 2 : System.out.println("Anda memilih jurusan TKJ");
        break;
    case 3 : System.out.println("Anda memilih jurusan Animasi");
        break;
    default:
        System.out.println("pilihan tidak tersedia");
    }
  }
}

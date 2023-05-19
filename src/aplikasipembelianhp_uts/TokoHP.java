package aplikasipembelianhp_uts;

import java.util.Scanner;
import ProdukHP.model.OPPOHP;
import ProdukHP.model.RedmiHP;
import ProdukHP.model.SamsungHP;
import ProdukHP.model.iPhoneHP;

/**
 *
 * @author NurHalizah
 */
public class TokoHP {
    public static void main(String[] args){
        
        int pilih;
        
        Scanner Inputpembeli = new Scanner(System.in);
        
        System.out.println("|=================================|");
        System.out.println("|===== APLIKASI PEMBELIAN HP =====|");
        System.out.println("|=================================|");
        System.out.println("|Daftar Handphone:                |");
        System.out.println("|1. Samsung                       |");
        System.out.println("|2. OPPO                          |");
        System.out.println("|3. iphone                        |");
        System.out.println("|4. Redmi                         |");
        System.out.println("|=================================|");
        System.out.print("Masukkan Pilihan Anda: ");
        pilih = Inputpembeli.nextInt();
        System.out.println();
        
        // menggunakan konsep Polymorphim karena objek objek dibuat berdasarkan class induk (Handphone)
        SamsungHP samsung = new SamsungHP("Samsung Galaxy", "S22 Ultra", 14510000, "12 GB", "5.000mAh", "6.8 inchi");
        OPPOHP oppo = new OPPOHP("OPPO", "A77S", 2700000, "8 GB", "5.000mAh", "6.7 inchi");
        iPhoneHP ipon = new iPhoneHP("iPhone", "13 Pro Max", 13000000, "6 GB", "3.285mAh", "6.7 inchi");
        RedmiHP xredmi = new RedmiHP("Xiomi Redmi", "10 A", 880000, "6 GB", "5.000mAh", "6.53 inchi");
        
        switch (pilih){
            case 1:
                System.out.println("=== HP SAMSUNG ===");
                System.out.println("Hanya Sedia: ");
                System.out.println();
                samsung.tampilkanDataHP();
                System.out.println();
                System.out.println("Motto: DO WHAT YOU CAN'T");
                break;
            case 2:
                System.out.println("=== HP OPPO ===");
                System.out.println("Hanya Sedia: ");
                System.out.println();
                oppo.tampilkanDataHP();
                System.out.println();
                System.out.println("Motto: Capture the Real You");
                break;
            case 3:
                System.out.println("=== HP iPhone ===");
                System.out.println("Hanya Sedia: ");
                System.out.println();
                ipon.tampilkanDataHP();
                System.out.println();
                System.out.println("Motto: Think Different");
                break;
            case 4:
                System.out.println("=== HP Xiomi Redmi ===");
                System.out.println("Hanya Sedia: ");
                System.out.println();
                xredmi.tampilkanDataHP();
                System.out.println();
                System.out.println("Motto: Innovation for Everyone");
                break;
            default:
             System.out.println("Mohon Maaf Pilihan yang Anda Masukkan Tidak Tersedia!");
             break;
        }
        
    }
    
}

package ProdukHP.model;

/**
 *
 * @author NurHalizah
 */

// Menggunakan Konsep Inheritance karena samsungHP ini merupakan subclass dari superclass Produk_HandPhone
public class SamsungHP extends Produk_HandPhone{
    private String RAM;
    private String baterai;
    private String ukuranlayar;
    
    public SamsungHP (String namaHP, String jenis, double harga, String RAM, String baterai, String ukuranlayar){
        super (namaHP, jenis, harga); // konsep encapsulation, karena untuk mengakses kontruktor dari superclass Produk_HandPhone
        this.RAM = RAM;
        this.baterai = baterai;
        this.ukuranlayar = ukuranlayar;
    }
    
    public SamsungHP (String RAM, String baterai, String ukuranlayar){
        this.RAM = RAM;
        this.baterai = baterai;
        this.ukuranlayar = ukuranlayar;
    }
    
    @Override
    public void tampilkanDataHP(){
        super.tampilkanDataHP();
        System.out.println("RAM             : " +RAM);
        System.out.println("Baterai         : " +baterai);
        System.out.println("Ukuran Layar    : "+ukuranlayar);
    }
}


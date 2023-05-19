package ProdukHP.model;

/**
 *
 * @author NurHalizah
 */
public class Produk_HandPhone {
    /*
    Konsep Enkapsulasi 
    Karena pada variabel dibawah saya deklarasikan sebagai private
    */
    
    private String namaHP;
    private String jenis;
    private double harga;
    
    public Produk_HandPhone (String namaHP, String jenis, double harga){
        this.namaHP = namaHP;
        this.jenis = jenis;
        this.harga = harga;
    }
    
    public Produk_HandPhone(){
        
    }
    
    public void tampilkanDataHP(){
        System.out.println("Nama Handphone  : " + namaHP);
        System.out.println("Jenis HandPhone : " + jenis);
        System.out.println("Harga HandPhone : " + harga);
    }
}


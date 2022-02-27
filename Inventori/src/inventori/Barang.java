package inventori;

public class Barang {
    String kode_barang; //variabel default yang dapat digunakan dimanapun
    String nama_barang; //variabel default yang dapat digunakan dimanapun
    private int stok;   //variabel private yang hanya dapat digunakan pada class
    
    public Barang(String kode,String nama,int stk){
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    /*Penggunaan setter sebagai perantara agar variabel stok dapat dipanggil
      pada class lain,setter hanya dapat mengisi data ke dalam atribut dan tidak
      dapat menampilkan ke layar*/
    public void setPenjumlahan(int stk){
        stok += stk;
    } 
    
    /*Penggunaan getter,getter tidak bisa digunakan untuk write,hanya bisa 
      digunakan untuk membaca data dan dapat ditampikan ke layar*/
    public int getPenjumlahan(){
        return stok;
    }
}

/*penggunaan getter dan setter bertujuan untuk membungkus data agar variabel tidak
  bisa diubah di luar class.setter tidak mempunyai nilai kembalian,getter mempunyai
  mempunyai nilai kembalian*/
  


package kelasdua;


public class KelasSatu {
         
    {
        System.out.println(11);
    }
    /*Penggunaan static membuat output yang ditampilkan pada class hanya 1 kali
      walaupun class dipanggil lebih dari 1 kali dan akan ditampilkan palling awal*/
    static 
    {
        System.out.println(2);
    }
    public KelasSatu(int i){
        System.out.println(3);
    }
    public KelasSatu(){
        System.out.println(4);
    }
    
}

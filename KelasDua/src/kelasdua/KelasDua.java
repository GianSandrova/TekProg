
package kelasdua;


class KelasDua {
    {
        System.out.println(5);
    }

    
    public static void main(String[] args) {
        System.out.println(6);
        KelasSatu satu = new KelasSatu();  //outputnya KelasSatu tanpa Parameter
        KelasSatu dua = new KelasSatu(10); //Outputnya KelasSatu yang pakai parameter
    }
    
}

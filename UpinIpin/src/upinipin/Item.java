
package upinipin;

public class Item {
    private String name; //variabel private yang hanya dapat dipanggil di dalam class
    private Item(){  //consturctor private yang hanya dapat dipanggil di dalam class
        name="Ipin";
    }

    
   public Item(String name){
       this(); //berguna untuk pemanggilan constructor yang ada pada class
       System.out.println(this.name);
   } 
    
}

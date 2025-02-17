package prog6112ea.pkg2.q1;

/**
 *
 * @author lindelo Desiree Nkosi
 */
public class Investment {
    private String name;
    private double price;
    private int years;
    
    
    public Investment(String name, double price, int years){
      this.name = name;
      this.price = price;
      this.years = years;
    }
    
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getYears(){
        return this.years;
    }
    
     public Investment(Investment source){
       this.name = source.name;
        this.price = source.price;
       this.years = source.years;
   }
 //    public double calculateInterest(){
//     
//     //if the speed is greater than 0r equal to 120km, the speed must by R10.20 or else no fine if payable 
//     if( this.speed >= 120){
//       return this.finePayable = this.speed * 10.20;
//     }
//     else{
//     return   this.finePayable = this.speed * 0;
//     }

// }
    public String toString(){
          return "COSTOMER NAME: " + this.name + "\n" +
                 "ORIGINAL AMOUNT: " + " R "+ this.price + "\n" +
                  "YEARS: " + this.years ;
                  //+ "\n" +
                  //"FINAL AMOUNT : " + calculateInterest();
      }
}

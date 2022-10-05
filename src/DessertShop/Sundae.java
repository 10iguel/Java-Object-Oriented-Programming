/**
 * File: Sundae.java
 * Description: Creating a subclass with the instance of a superclass
 * Lessons Learned: In this lesson I learned how to create an extended class and setting default values
 * for the attributes and override the methods.
 *     extends, super, super()
 *     public class Sundae extends IceCream
 *     default constructor
 *     public Sundae() {
 *         super();
 *         this.toppingName = "";
 *         this.toppingPrice = 0.0;
 *     }
 *     constructor with arguments
 *     A class under a subclass
 *     public Cookie(String name, int scoopCount, double pricePerScoop, String toppingName, double toppingPrice) {
 *         super(name, scoopCount,pricePerScoop);
 *         this.toppingName = toppingName;
 *         this.toppingPrice = toppingPrice;
 *     }
 *     Validations if there are negative values entered
 *     @Override
 *     public double calculateCost() {
 *         return super.calculateCost() + toppingPrice;
 *     }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/05/2022.
 */

package DessertShop;

public class Sundae extends IceCream {
    private String toppingName;
    private double toppingPrice;

    public Sundae(){
        super();
        this.toppingName = "";
        this.toppingPrice = 0.0;
    }

    public Sundae(String name, int scoopCount, double pricePerScoop, String toppingName, double toppingPrice) {
        super(name, scoopCount,pricePerScoop);
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }
    // Getters

    public String getToppingName() {
        if(toppingPrice<0){
            toppingPrice=0;
        }
        return toppingName;
    }

    public double getToppingPrice() {
        if(toppingPrice<0){
            toppingPrice=0;
        }
        return toppingPrice;
    }

    // Setters


    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + toppingPrice;
    }
}

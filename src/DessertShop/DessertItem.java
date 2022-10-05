/**
 * File: DessertItem.java
 * Description: Creating a superclass
 * Lessons Learned: In this lesson I learned how to create a superclass and the use of trim .
 *     superclass
 *     DessertItem(String name) {
 *                 this.name = name;
 *         }
 *     trim()
 *     name.trim()
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 09/28/2022.
 */

package DessertShop;

public abstract class DessertItem {
    private String name;

    private double taxPercent = 7.25;


    public DessertItem() {
        this.name = "";
    }

    public DessertItem(String name) {
        this.name = name;
    }
    //Getters

    public String getName() {
        return name.trim();
    }

    public double getTaxPercent() {
        return taxPercent;
    }
    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    public abstract double calculateCost();

    public double calculateTax(){
        return (taxPercent * calculateCost())/100 ;
    }
}

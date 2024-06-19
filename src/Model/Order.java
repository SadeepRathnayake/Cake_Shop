/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sadeep
 */
public class Order {
    
    private String odr_ID;
    private String cus_Name;
    private String odr_Item;
    private String odr_Quantity;
    private String odr_unitPrice;
    private String odr_Total;

    public String getOdr_ID() {
        return odr_ID;
    }

    public void setOdr_ID(String odr_ID) {
        this.odr_ID = odr_ID;
    }

    public String getCus_Name() {
        return cus_Name;
    }

    public void setCus_Name(String cus_ID) {
        this.cus_Name = cus_ID;
    }

    public String getOdr_Item() {
        return odr_Item;
    }

    public void setOdr_Item(String odr_Item) {
        this.odr_Item = odr_Item;
    }

    public String getOdr_Quantity() {
        return odr_Quantity;
    }

    public void setOdr_Quantity(String odr_Quantity) {
        this.odr_Quantity = odr_Quantity;
    }

    public String getOdr_unitPrice() {
        return odr_unitPrice;
    }

    public void setOdr_unitPrice(String odr_unitPrice) {
        this.odr_unitPrice = odr_unitPrice;
    }

    public String getOdr_Total() {
        return odr_Total;
    }

    public void setOdr_Total(String odr_Total) {
        this.odr_Total = odr_Total;
    }
    
}

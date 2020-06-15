package com.example.shopper.DataBaseObjects;


import com.example.shopper.NavigationElements.Point;
import com.example.shopper.RealWorldObjects.ProductInStock;

public class StoreItemRegisterer {
    private ProductInStock productInStock;
    private Point locationPoint;

    public StoreItemRegisterer(){}
    public StoreItemRegisterer(String storeItemName,Point point) {
        productInStock = new ProductInStock(storeItemName);
        locationPoint = new Point(point);
    }
    public String getNameOfItem(){
        return productInStock.getNameOfProduct();
    }

    public void setNameOfProductInStock(String itemName) {
        this.productInStock.setNameOfProduct(itemName);
    }

    public void setLocationPoint(int x,int y) {
        this.locationPoint.setX(x);
        this.locationPoint.setY(y);
    }
}

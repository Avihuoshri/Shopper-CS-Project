package com.example.shopper.interfaces;

import com.example.shopper.NavigationElements.CycleLinkedList;
import com.example.shopper.NavigationElements.Point;

public interface Record{

    //initialize new list of routes.
    public void initList();

    //save product point on the map
    public Point saveProductLocationToDB(Point point, String name);

    //save new node in the database of routes.
    public void saveNodeToDB(String source, String destination);

    //save all the routes when finish shopping.
    public void saveListToDB(CycleLinkedList list);
}

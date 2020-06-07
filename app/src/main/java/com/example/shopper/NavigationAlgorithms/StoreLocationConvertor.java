package com.example.shopper.NavigationAlgorithms;

import com.example.shopper.NavigationElements.PathNode;
import com.example.shopper.NavigationElements.Point;

interface StoreLocationConvertor {

    public PathNode Point2PathNode(Point point);
    public Point PathNode2Point(PathNode node);
}

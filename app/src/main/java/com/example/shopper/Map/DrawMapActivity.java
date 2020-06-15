package com.example.shopper.Map;

import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shopper.NavigationElements.PathNode;
import com.example.shopper.NavigationElements.PathTracker;
import com.example.shopper.NavigationElements.Point;
import com.example.shopper.R;

import java.io.Serializable;
import java.util.logging.Logger;

public class DrawMapActivity extends AppCompatActivity {
    private PathTracker tracker;

    private Line line;
    private LineView mlineView;
    private Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_map);

        Intent intent = getIntent();
        PathTracker tracker = (PathTracker) intent.getSerializableExtra("tracker");

        mlineView = findViewById(R.id.LineView) ;

        addLines();

        mlineView.draw();

    }

    private void addLines() {
        PathNode node = tracker.list.head;
        if(!node.hasNext()){
            //TODO: print in dialog message
            Log.d("error","no products in the list");
        }
        else {
            //iterate the nodes in the list
            node = node.getNext();
            while (node != tracker.list.tail) {//iterate path points
                for (int i = 0; i <= node.getPath().getPoints().size(); i++) {

                    Point pCurrent = node.getPath().getPoints().get(i);
                    Point pNext = node.getPath().getPoints().get(i+1);

                    //create new line from two points in the path
                        PointF pointA = new PointF(pCurrent.getX() , pCurrent.getY());
                        PointF pointB = new PointF(pNext.getX() , pNext.getY());
                        Line line = new Line(pointA , pointB) ;
                        mlineView.addNewLine(line);

                }
                node = node.getNext();
            }

            //iterate tail node points
            for (int i = 0; i < node.getPath().getPoints().size(); i++) {

                Point pCurrent = node.getPath().getPoints().get(i);
                Point pNext = node.getPath().getPoints().get(i+1);

                //create new line from two points in the path
                PointF pointA = new PointF(pCurrent.getX() , pCurrent.getY());
                PointF pointB = new PointF(pNext.getX() , pNext.getY());
                Line line = new Line(pointA , pointB) ;
                mlineView.addNewLine(line);


            }
        }
    }
}

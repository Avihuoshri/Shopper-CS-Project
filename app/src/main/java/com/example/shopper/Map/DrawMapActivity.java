package com.example.shopper.Map;

import android.graphics.PointF;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shopper.R;

public class DrawMapActivity extends AppCompatActivity {

    PointF pointA = new PointF(400 , 1000);
    PointF pointB = new PointF(253 , 830);
    private Line line = new Line(pointA , pointB) ;

    private LineView mlineView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_map);

        mlineView = findViewById(R.id.LineView) ;

        mlineView.addNewLine(line);

        pointA = new PointF(pointB.x , pointB.y);
        pointB = new PointF(330 , 800);
        line = new Line(pointA , pointB) ;
        mlineView.addNewLine(line);

        pointA = new PointF(pointB.x , pointB.y);
        pointB = new PointF(330 , 700);
        line = new Line(pointA , pointB) ;
        mlineView.addNewLine(line);

        pointA = new PointF(pointB.x , pointB.y);
        pointB = new PointF(330 , 500);
        line = new Line(pointA , pointB) ;
        mlineView.addNewLine(line);

        pointA = new PointF(pointB.x , pointB.y);
        pointB = new PointF(550 , 500);
        line = new Line(pointA , pointB) ;
        mlineView.addNewLine(line);

        pointA = new PointF(pointB.x , pointB.y);
        pointB = new PointF(550 , 200);
        line = new Line(pointA , pointB) ;
        mlineView.addNewLine(line);

        pointA = new PointF(pointB.x , pointB.y);
        pointB = new PointF(620 , 200);
        line = new Line(pointA , pointB) ;
        mlineView.addNewLine(line);

        pointA = new PointF(pointB.x , pointB.y);
        pointB = new PointF(620 , 500);
        line = new Line(pointA , pointB) ;
        mlineView.addNewLine(line);

        pointA = new PointF(pointB.x , pointB.y);
        pointB = new PointF(770 , 500);
        line = new Line(pointA , pointB) ;
        mlineView.addNewLine(line);

        pointA = new PointF(pointB.x , pointB.y);
        pointB = new PointF(770 , 900);
        line = new Line(pointA , pointB) ;
        mlineView.addNewLine(line);

        pointA = new PointF(pointB.x , pointB.y);
        pointB = new PointF(720 , 900);
        line = new Line(pointA , pointB) ;
        mlineView.addNewLine(line);

        pointA = new PointF(pointB.x , pointB.y);
        pointB = new PointF(500 , 970);
        line = new Line(pointA , pointB) ;
        mlineView.addNewLine(line);


        mlineView.draw();

    }
}

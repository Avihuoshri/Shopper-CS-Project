package com.example.shopper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.shopper.NavigationElements.PathTracker;
import com.example.shopper.NavigationElements.PixelGridView;

public class GridActivity extends Activity {
    private Intent intent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        PathTracker tracker = (PathTracker) intent.getSerializableExtra("tracker");
        PixelGridView pixelGrid = new PixelGridView(this);
        pixelGrid.setNumColumns(100);
        pixelGrid.setNumRows(100);
        pixelGrid.setTracker(tracker);
        setContentView(pixelGrid);

    }
}
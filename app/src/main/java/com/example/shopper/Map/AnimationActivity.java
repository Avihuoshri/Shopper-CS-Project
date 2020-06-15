package com.example.shopper.Map;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AnimationActivity extends AppCompatActivity {
//TODO: remove class???
    MapActivity mapLayoutView ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mapLayoutView = new MapActivity(this) ;
        setContentView(mapLayoutView);
    }
}

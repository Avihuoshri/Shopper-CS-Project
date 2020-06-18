package com.example.shopper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shopper.DataBaseHandlers.DBShoppingPathAppender;
import com.example.shopper.DataBaseHandlers.DBStoreBranchRegisterer;
import com.example.shopper.Map.DrawMapActivity;
import com.example.shopper.NavigationElements.Path;
import com.example.shopper.NavigationElements.PathTracker;
import com.example.shopper.NavigationElements.Point;


public class MainActivity extends AppCompatActivity{
    private  Button BtnOnShop ;
    private  Button BtnCreateList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();

        BtnOnShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OnShopActivity.class);
                startActivity(intent);
            }
        });

        BtnCreateList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShopingListActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initButtons(){

        BtnOnShop = findViewById(R.id.button_on_shop);
        BtnCreateList= findViewById(R.id.btn_create_list);

    }



}
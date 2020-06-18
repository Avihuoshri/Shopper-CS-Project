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
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class ShopingListActivity extends AppCompatActivity{
    private FloatingActionButton BtnAddProduct;
    private  Button BtnSave ;
    private  Button BtnDrewPath ;
    EditText mEditText;

    PathTracker tracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoping_list);

        initButtons();

//        //TODO: save product to the list and clear text when clicking buttun
//        BtnAddProduct.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String destination = mEditTextProduct.getText().toString();
//            }
//        });
//
//        BtnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                DBShoppingPathAppender pathAppender = new DBShoppingPathAppender();
//                pathAppender.addAllNodesOfShoppingListToDb(tracker);
//                DBStoreBranchRegisterer branchRegisterer = new DBStoreBranchRegisterer();
//                branchRegisterer.handleBranchStock(tracker);
//            }
//        });
//
//        //TODO: send list and retrive locations from DB, send the result to drewMapActivity
//        BtnDrewPath.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Path p = new Path();
//                Point point1 = new Point(400 , 1000);
//                p.add(point1);
//                Point point2 = new Point(253 , 830);
//                p.add(point2);
//
//                tracker.list.head.setPath(p);
//
//                Intent intent = new Intent(ShopingListActivity.this, DrawMapActivity.class);
//                intent.putExtra("tracker", tracker);
//                startActivity(intent);
//            }
//        });
    }



    private void initButtons(){
        BtnSave = findViewById(R.id.button_save_list);
        mEditText = findViewById(R.id.edit_text1);
        BtnAddProduct = findViewById(R.id.floatingActionButton2);
        BtnDrewPath = findViewById(R.id.btn_drew);
    }



}
package com.example.wms.movablefloatingactionbutton;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MovableFloatingActionButton fab = (MovableFloatingActionButton) findViewById(R.id.fab);
        CoordinatorLayout.LayoutParams lp  = (CoordinatorLayout.LayoutParams) fab.getLayoutParams();
        fab.setCoordinatorLayout(lp);


    }
    }


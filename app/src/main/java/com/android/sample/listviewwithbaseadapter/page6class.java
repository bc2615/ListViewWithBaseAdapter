package com.android.sample.listviewwithbaseadapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by XPS on 2018/2/28.
 */

public class page6class extends AppCompatActivity{

//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.page3);
//
//    }
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page6);
        button = findViewById(R.id.page6button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_start =new Intent(page6class.this, page7class.class);
                startActivity(intent_start);
            }
        });
    }
}


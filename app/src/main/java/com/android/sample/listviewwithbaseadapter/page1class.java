package com.android.sample.listviewwithbaseadapter;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by XPS on 2018/2/28.
 */

public class page1class extends AppCompatActivity {
    private Button button;

    public void init() {
        button = findViewById(R.id.page1button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent_1 =  new Intent(page1class.this, page2class.class);
                startActivity(intent_1);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
        init();

    }




}
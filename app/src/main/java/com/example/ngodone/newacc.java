package com.example.ngodone;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newacc extends AppCompatActivity implements View.OnClickListener {
Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newacc);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        button3 = findViewById(R.id.button4);
        button3.setOnClickListener(this );
    }
    @Override
    public void onClick(View v) {
                Intent intent = new Intent(newacc.this, nextpage.class);
                startActivity(intent);
        }
    }


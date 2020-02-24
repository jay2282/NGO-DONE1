package com.example.ngodone;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nextpage extends AppCompatActivity implements View.OnClickListener {
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextpage);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this );
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(nextpage.this, next2page.class);
        startActivity(intent);
    }
}

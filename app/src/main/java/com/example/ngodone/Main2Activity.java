package com.example.ngodone;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener
{
    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        button = findViewById(R.id.button);
        button.setOnClickListener(this );
        button2 = findViewById(R.id.button4);
        button2.setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.button:
                intent = new Intent(Main2Activity.this, next2page.class);
                startActivity(intent);
                break;
            case R.id.button4:
                intent = new Intent(Main2Activity.this, newacc.class);
                startActivity(intent);
                break;
        }
    }
}

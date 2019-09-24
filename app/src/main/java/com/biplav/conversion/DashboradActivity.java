package com.biplav.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboradActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnConversion, btnSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashborad);
//binding data
        btnConversion = findViewById(R.id.btnConversion);
        btnSum = findViewById(R.id.btnSumMy);

        btnSum.setOnClickListener(this);
        btnConversion.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnConversion){
            Intent intent=new Intent(DashboradActivity.this,MainActivity.class);
            startActivity(intent);
        }

    }
}

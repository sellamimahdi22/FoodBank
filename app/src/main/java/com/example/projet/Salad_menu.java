package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Salad_menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad_menu);
        ImageView back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(this);
        ImageView acount = (ImageView)findViewById(R.id.acount);
        acount.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.back:

                Intent i = new Intent(Salad_menu.this,menu.class);
                startActivity(i);
            case R.id.acount:

                Intent aco = new Intent(Salad_menu.this,acount.class);
                startActivity(aco);
                break;
        }
    }
}
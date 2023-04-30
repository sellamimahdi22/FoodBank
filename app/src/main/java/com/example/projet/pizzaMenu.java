package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class pizzaMenu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_menu);
        ImageView back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(this);
        ImageView acount = (ImageView)findViewById(R.id.acount);
        acount.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.back:

                Intent i = new Intent(pizzaMenu.this,menu.class);
                startActivity(i);
            case R.id.acount:

                Intent aco = new Intent(pizzaMenu.this,acount.class);
                startActivity(aco);
                break;
        }
    }
}
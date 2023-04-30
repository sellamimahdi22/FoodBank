package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class menu extends AppCompatActivity implements View.OnClickListener {
FloatingActionButton fabpizza;
FloatingActionButton fabpasta;
    FloatingActionButton fabsalad;
    FloatingActionButton fabdessert;
    ImageView acount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        fabpizza=findViewById(R.id.fab_pizza);
        fabdessert=findViewById(R.id.fab_dessert);
        fabsalad=findViewById(R.id.fab_salad);
        fabpasta=findViewById(R.id.fab_pasta);
        ImageView back=(ImageView)findViewById(R.id.back);

        acount = (ImageView)findViewById(R.id.acount);
        acount.setOnClickListener(this);
        back.setOnClickListener(this);
     fabpizza.setOnClickListener(this);
        fabpasta.setOnClickListener(this);
        fabdessert.setOnClickListener(this);
        fabsalad.setOnClickListener(this);

    }





public void screenMenuPizza(){
        Intent menuPizza=new Intent(this,pizzaMenu.class);
startActivity(menuPizza);
    }
    public void screenMenuPasta(){
        Intent menuPasta=new Intent(this,pasta_menu.class);
        startActivity(menuPasta);
    }
    public void screenMenuDessert(){
        Intent menuDessert=new Intent(this,Dessert_menu.class);
        startActivity(menuDessert);
    }
    public void screenMenuSalad(){
        Intent menuSalad=new Intent(this,Salad_menu.class);
        startActivity(menuSalad);
    }

    @Override
    public void onClick(View v) {
         switch (v.getId()){
             case R.id.fab_pizza:
                 screenMenuPizza();
                 break;
             case R.id.fab_salad:
                 screenMenuSalad();
                 break;
             case R.id.fab_dessert:
                 screenMenuDessert();
                 break;
             case R.id.fab_pasta:
                 screenMenuPasta();
                 break;
             case R.id.back:

                 Intent i = new Intent(menu.this,signup.class);
                 startActivity(i);
                 break;
             case R.id.acount:

                 Intent aco = new Intent(menu.this,acount.class);
                 startActivity(aco);
                 break;
             }
         }
    }

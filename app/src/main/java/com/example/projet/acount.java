package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class acount extends AppCompatActivity {
   TextView nameF,nameL,email,adress,phone,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acount);
        nameF=findViewById(R.id.nameF);
        nameL=findViewById(R.id.nameL);
        email=findViewById(R.id.email);
        adress=findViewById(R.id.Adresse);
        phone=findViewById(R.id.mobile);
        password=findViewById(R.id.pass);

        String firstname=getIntent().getStringExtra("firstname");
        String lastname=getIntent().getStringExtra("lastname");
        String Email=getIntent().getStringExtra("Email");
        String Adress=getIntent().getStringExtra("adresse");
        String Phone=getIntent().getStringExtra("phone");
        String Password=getIntent().getStringExtra("password");
        nameF.setText(firstname);
        nameL.setText(lastname);
        email.setText(Email);
        adress.setText(Adress);
        phone.setText(Phone);
        password.setText(Password);
    }
}
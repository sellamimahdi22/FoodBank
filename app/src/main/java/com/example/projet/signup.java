package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        EditText mail=(EditText)findViewById(R.id.Address);
        EditText pass=(EditText)findViewById(R.id.Password);
        Button login=(Button) findViewById(R.id.log1);
        Button si=(Button) findViewById(R.id.si);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mail.getText().toString().equals("user") && pass.getText().toString().equals("1234")) {
                    Toast.makeText(signup.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(signup.this,menu.class);
                    startActivity(i);
                } else {
                    Toast.makeText(signup.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(signup.this, Register.class);
                startActivity(k);
            }
        });
            }
        }



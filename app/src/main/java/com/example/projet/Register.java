package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText mail=(EditText)findViewById(R.id.EmailAddress);
        EditText phone=(EditText)findViewById(R.id.Phone);
        EditText firstname=(EditText)findViewById(R.id.FName);
        EditText lastname=(EditText)findViewById(R.id.LName);
        EditText Adr=(EditText)findViewById(R.id.PostalAddress);
        EditText pass=(EditText)findViewById(R.id.TextPassword);
        Button signup=(Button) findViewById(R.id.sign);
        Button login=(Button) findViewById(R.id.login);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String FN=firstname.getText().toString();
                String LN=lastname.getText().toString();
                String Adress=Adr.getText().toString();
                String Phone=phone.getText().toString();
                String Email=mail.getText().toString();
                String pas=pass.getText().toString();
                switch (view.getId()){
                    case R.id.sign:
                        Intent i = new Intent(Register.this,acount.class);
                        i.putExtra("firstname",FN);
                        i.putExtra("lastname",LN);
                        i.putExtra("adresse",Adress);
                        i.putExtra("phone",Phone);
                        i.putExtra("Email",Email);
                        i.putExtra("password",pas);
                        startActivity(i);
                    case R.id.login:
                        Intent j = new Intent(Register.this,signup.class);
                        startActivity(j);

                }

            }
        });
    }
}
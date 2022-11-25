package com.example.dreamlife30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_principal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        IniciarComponentes();

        text_tela_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FormLogin.this,FormPrincipal.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){
        text_tela_principal = findViewById(R.id.text_tela_principal);
    }

}
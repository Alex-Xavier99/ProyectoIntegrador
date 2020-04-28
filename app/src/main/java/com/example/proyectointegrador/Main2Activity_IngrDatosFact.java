package com.example.proyectointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity_IngrDatosFact extends AppCompatActivity {
    private TextView subtitle;
    private EditText razonsocial, cedula, direccion, telefono,correo;
    private String subti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2__ingr_datos_fact);
        subtitle = (TextView)findViewById(R.id.txtview_nromesa);
        razonsocial = (EditText)findViewById(R.id.txt_razonsocial);
        cedula = (EditText)findViewById(R.id.txt_cedula);
        direccion = (EditText)findViewById(R.id.txt_direccion);
        telefono = (EditText)findViewById(R.id.txt_telefono);
        correo = (EditText)findViewById(R.id.txt_correo);

        getSupportActionBar().setDisplayShowHomeEnabled(true);//Se ve e icono de la app
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        subti = getIntent().getStringExtra("m1");
        subtitle.setText(subti);
    }
    public void IngresarOrden(View view){
        Intent orden = new Intent(this,Main2Activity_TipoOrden.class);
        orden.putExtra("m1",subti);
        startActivity(orden);
        finish();
    }
    @Override
    public  void onBackPressed(){
        Intent principal = new Intent(this,MainActivity.class);
        startActivity(principal);
        finish();
    }
}

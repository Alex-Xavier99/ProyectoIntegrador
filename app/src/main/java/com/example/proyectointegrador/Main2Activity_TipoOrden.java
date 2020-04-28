package com.example.proyectointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity_TipoOrden extends AppCompatActivity {
    private TextView subtitle;
    private ImageButton imgaperitivo,imgsopa,imgfuerte,imgensalada,imgmariscos,imgjugos,imgpostre,imgpromo;
    private String subti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2__tipo_orden);
        subtitle = (TextView)findViewById(R.id.txtview_subtitle);
        imgaperitivo = (ImageButton)findViewById(R.id.img_aperitivo);
        imgsopa = (ImageButton)findViewById(R.id.img_sopa);
        imgfuerte = (ImageButton)findViewById(R.id.img_fuerte);
        imgensalada = (ImageButton)findViewById(R.id.img_ensalada);
        imgmariscos = (ImageButton)findViewById(R.id.img_marisco);
        imgjugos = (ImageButton)findViewById(R.id.img_jugo);
        imgpostre = (ImageButton)findViewById(R.id.img_postre);
        imgpromo = (ImageButton)findViewById(R.id.img_promo);

        getSupportActionBar().setDisplayShowHomeEnabled(true);//Se ve e icono de la app
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        subti = getIntent().getStringExtra("m1");
        subtitle.setText(subti);
    }
    @Override
    public  void onBackPressed(){
        Intent principal = new Intent(this,MainActivity.class);
        startActivity(principal);
        finish();
    }
}

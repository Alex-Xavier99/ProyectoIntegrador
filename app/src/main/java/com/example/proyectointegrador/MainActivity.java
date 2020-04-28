package com.example.proyectointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private RadioButton mesa1,mesa2,mesa3,mesa4,mesa5,mesa6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mesa1 = (RadioButton)findViewById(R.id.rdbtn_mesa1);
        mesa2 = (RadioButton)findViewById(R.id.rdbtn_mesa2);
        mesa3 = (RadioButton)findViewById(R.id.rdbtn_mesa3);
        mesa4 = (RadioButton)findViewById(R.id.rdbtn_mesa4);
        mesa5 = (RadioButton)findViewById(R.id.rdbtn_mesa5);
        mesa6 = (RadioButton)findViewById(R.id.rdbtn_mesa6);

        //Prueba

        getSupportActionBar().setDisplayShowHomeEnabled(true);//Se ve e icono de la app
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
    public void Aceptar(View view){
        String mesa = "";
        if(mesa1.isChecked() == true){
            mesa = "Mesa Nro. 1";
            PasarActivity(mesa);
        }
        else if(mesa2.isChecked() == true){
            mesa = "Mesa Nro. 2";
            PasarActivity(mesa);
        }
        else if(mesa3.isChecked() == true){
            mesa = "Mesa Nro. 3";
            PasarActivity(mesa);
        }
        else if(mesa4.isChecked() == true){
            mesa = "Mesa Nro. 4";
            PasarActivity(mesa);
        }
        else if(mesa5.isChecked() == true){
            mesa = "Mesa Nro. 5";
            PasarActivity(mesa);
        }
        else if(mesa6.isChecked() == true){
            mesa = "Mesa Nro. 6";
            PasarActivity(mesa);
        }
    }
    public void Cancelar(View view){

        if(mesa1.isChecked() == true){
            mesa1.setChecked(false);
        }
        else if(mesa2.isChecked() == true){
            mesa2.setChecked(false);
        }
        else if(mesa3.isChecked() == true){
            mesa3.setChecked(false);
        }
        else if(mesa4.isChecked() == true){
            mesa4.setChecked(false);
        }
        else if(mesa5.isChecked() == true){
            mesa5.setChecked(false);
        }
        else if(mesa6.isChecked() == true){
            mesa6.setChecked(false);
        }
    }
    public void PasarActivity(String mesa){
        Intent datosfact = new Intent(this,Main2Activity_IngrDatosFact.class);
        datosfact.putExtra("m1",mesa);
        startActivity(datosfact);
        finish();
    }
}

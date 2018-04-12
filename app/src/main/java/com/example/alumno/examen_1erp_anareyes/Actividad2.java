package com.example.alumno.examen_1erp_anareyes;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
    }
    public void act1(View view){
        Intent abrirInicio = new Intent(this, Actividad3.class);
        startActivity(abrirInicio);
    }
    public void act2(View view){
        Intent abrirInicio = new Intent(this, Actividad4.class);
        startActivity(abrirInicio);
    }
    public void act3(View view){
        Intent abrirInicio = new Intent(this, Actividad5.class);
        startActivity(abrirInicio);
    }
}

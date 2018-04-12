package com.example.alumno.examen_1erp_anareyes;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText usuario, contrasena;
    Button boton;
    TextView txt;
    String usr, con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.usuario);
        contrasena= findViewById(R.id.contrasena);
        txt = findViewById(R.id.textView);

    }

    public void validar(View view) {
        usr= usuario.getText().toString();
        con= contrasena.getText().toString();
        if(usr.equals("ana") && con.equals("ana")){
            txt.setText("Bienvenido " + usuario.getText().toString());
            Intent abrirInicio = new Intent(this, Actividad2.class);
            startActivity(abrirInicio);

        }else{
            txt.setText("Usuario incorrecto");
            //Intent abrirIncorrecto=new Intent(this, Actividad4.class);
            //startActivity(abrirIncorrecto);
        }
    }
}

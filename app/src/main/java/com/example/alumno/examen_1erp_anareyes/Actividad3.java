package com.example.alumno.examen_1erp_anareyes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Actividad3 extends AppCompatActivity  {
    TextView txt;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,suma,resta,multiplicacion,division,borrar,fact,punto;
    TextView numeros;
    String operacion="";
    Double resultado=0.0, nm1=0.0, nm2=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        numeros=findViewById(R.id.numeros);

        //numeros del 1 al 9
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        punto=findViewById(R.id.punto);

    }

    //dar valores a los numeros
    public void uno(View view) {
        numeros.setText(numeros.getText()+"1");
    }
    public void dos(View view) {
        numeros.setText(numeros.getText()+"2");
    }
    public void tres(View view) {
        numeros.setText(numeros.getText()+"3");
    }
    public void cuatro(View view) {
        numeros.setText(numeros.getText()+"4");
    }
    public void cinco(View view) {

        numeros.setText(numeros.getText()+"5");
    }
    public void seis(View view) {
        numeros.setText(numeros.getText()+"6");
    }
    public void siete(View view) {
        numeros.setText(numeros.getText()+"7");
    }
    public void ocho(View view) {
        numeros.setText(numeros.getText()+"8");
    }
    public void nueve(View view) {
        numeros.setText(numeros.getText()+"9");
    }
    public void cero(View view) {
        numeros.setText(numeros.getText()+"0");
    }
    public void punto(View view) {
        numeros.setText(numeros.getText()+".");
    }

    public void crearNuno(View view){
        numeros=findViewById(R.id.numeros);
        nm1 = Double.parseDouble(numeros.getText().toString());
        numeros.setText("");
    }

    //dar simbolo a las operaciones
    public void suma(View view) {
        operacion="+";
        crearNuno(view);
    }
    public void resta(View view){
        operacion="-";
        crearNuno(view);
    }
    public void multiplicacion(View view){
        operacion="*";
        crearNuno(view);
    }
    public void division(View view){
        operacion="/";
        crearNuno(view);
    }
    public void borrar(View view){
        operacion="";
        nm1=0.0; nm2=0.0; resultado=0.0;
        numeros.setText("");
    }
    public void factorial(View view){
        operacion="!";
        crearNuno(view);
        if (nm1==0){
            resultado= 1.0;}
        else{
            resultado=1.0;
            while(nm1!=0){
                resultado=resultado*nm1;
                nm1--;
            }
        }
        numeros.setText(resultado.toString());


    }


    //switch para hacer la operacion
    public void igual(View view){
        nm2=Double.parseDouble(numeros.getText().toString());
        switch (operacion){
            case "+":
                resultado= nm1 + nm2;
                break;
            case "-":
                resultado= nm1 - nm2;
                break;
            case "*":
                resultado= nm1 * nm2;
                break;
            case "/":
                resultado= nm1 / nm2;
                break;


        }
        numeros.setText(resultado.toString());



    }




    //juntar numeros del textView
    private void juntarN(String num) {
        numeros= findViewById(R.id.numeros);
        numeros.setText(numeros.getText() + num);
    }

    private void crearN1(){
        numeros =findViewById(R.id.numeros);
        nm1= Double.parseDouble(numeros.getText().toString());
        numeros.setText("");
        //txt.setText(nm1.toString());


    }

}


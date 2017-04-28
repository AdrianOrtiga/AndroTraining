package com.example.maikel.controlacceso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculoIMC extends AppCompatActivity {

    private EditText editAltura;
    private EditText editPeso;
    private TextView textIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imc);

        editAltura=(EditText)findViewById(R.id.editAltura);
        editPeso=(EditText)findViewById(R.id.editPeso);
        textIMC=(TextView)findViewById(R.id.textIMC);

    }
    public void IMC(View view) {
        String valor1=editAltura.getText().toString();
        String valor2=editPeso.getText().toString();
        double nro1=Integer.parseInt(valor1);
        double nro2=Integer.parseInt(valor2);
        double nro3 = nro1/100;

        double numIMC = nro2 / (nro3 * nro3);

        String numre=String.valueOf(numIMC);

        textIMC.setText(numre);

        Intent i = new Intent(this,SeleccionRutina.class );

        i.putExtra("valorIMC", numre);
        startActivity(i);

    }
}

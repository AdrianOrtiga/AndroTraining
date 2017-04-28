package com.example.maikel.controlacceso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ControlAcceso extends AppCompatActivity {

    private EditText editAcceso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_acceso);

        editAcceso=(EditText)findViewById(R.id.editAcceso);

    }

    public void acceso(View view) {
        String valor1=editAcceso.getText().toString();
        int nro1=Integer.parseInt(valor1);

        if (nro1 == 1234) {
            Intent i = new Intent(this,CalculoIMC.class );
            startActivity(i);
        }
        else {
            Toast notificacion=Toast.makeText(this,"No tienes acceso.",Toast.LENGTH_LONG);
            notificacion.show();
        }


    }
}

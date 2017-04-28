package com.example.maikel.controlacceso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SeleccionRutina extends AppCompatActivity {

    private TextView textEstado;
    private RadioButton radioMusculacion;
    private RadioButton radioPerdida;
    private RadioButton radioMantenimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_rutina);

        textEstado=(TextView)findViewById(R.id.textEstado);
        radioMusculacion=(RadioButton)findViewById(R.id.radioMusculacion);
        radioPerdida=(RadioButton)findViewById(R.id.radioPerdida);
        radioMantenimiento=(RadioButton)findViewById(R.id.radioMantenimiento);

        //Recuperamos parametro IMC y proponemos una rutina
        Bundle extras = getIntent().getExtras();
        String valor1 = extras.getString("valorIMC");

        double IMC=Double.parseDouble(valor1);

        if (IMC <= 18.5) {
            textEstado.setText("Peso bajo, te recomendamos una rutina de musculacion");
        } else  if (IMC > 18.5 && IMC < 25) {
            textEstado.setText("Peso correcto, te recomendamos una rutina de mantenimiento ");
            } else {
            textEstado.setText("Peso alto,te recomendamos una rutina de fitness");
            }
    }
    // Comprobamos la rutina seleccionada y ejecutamos la siguiente actividad

    public void empezar(View view){
        if (radioMantenimiento.isChecked() == true){
            //pasar a la actividad mantenimiento
        }else if (radioMusculacion.isChecked() == true) {
            //pasar a actividad musculacion
        }else if (radioPerdida.isChecked() == true){
            //pasar a actividad perdida
        } else {
            Toast notificacion=Toast.makeText(this,"selecciona una rutina",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }

}

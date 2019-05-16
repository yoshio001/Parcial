package com.isil.sol_ep.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.isil.sol_ep.R;
import com.isil.sol_ep.entities.Alumno;

public class Parte3Activity extends AppCompatActivity {

    TextView txt_a1, txt_a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte3);

        txt_a1 = findViewById(R.id.tv_a1);
        txt_a2 = findViewById(R.id.tv_a2);

        Alumno a1 = new Alumno(1001, "Juan", "Nieve", 15,16,17,18, 15,17);
        Alumno a2 = new Alumno(1002, "Samsa", "Stark", 17,18,19,20,16,18);

        txt_a1.setText(a1.MostrarInfoCompleta());
        txt_a2.setText(a2.MostrarInfoCompleta());
    }
}

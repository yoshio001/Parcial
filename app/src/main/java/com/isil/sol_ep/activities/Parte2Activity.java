package com.isil.sol_ep.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.isil.sol_ep.R;

import org.w3c.dom.Text;

public class Parte2Activity extends AppCompatActivity {


    RadioGroup radioGroup;
    EditText caja_ina, caja_tar, caja_he;
    TextView txt_res;
    Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte2);

        radioGroup = findViewById(R.id.rg_areas);
        caja_he = findViewById(R.id.et_he);
        caja_ina = findViewById(R.id.et_ina);
        caja_tar = findViewById(R.id.et_tar);
        txt_res = findViewById(R.id.tv_result);
        btn_calcular = findViewById(R.id.btnCal);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sueldo_base=0;
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.rb_adm:
                        sueldo_base = 2500;
                        break;
                    case R.id.rb_prod:
                        sueldo_base = 4100;
                        break;
                    case R.id.rb_ger:
                        sueldo_base = 5200;
                        break;
                }
                int ina = Integer.parseInt(caja_ina.getText().toString());
                int tar = Integer.parseInt(caja_tar.getText().toString());
                int he = Integer.parseInt(caja_he.getText().toString());
                double sueldo_bruto = sueldo_base - 100*ina - 20*tar + 45*he;
                double dsct = sueldo_bruto*0.13;
                double sueldo_neto = sueldo_bruto-dsct;

                String msg = "Sueldo base: "+sueldo_base+"\n"+
                        "Sueldo Bruto: "+sueldo_bruto+"\n"+
                        "Dscto: "+dsct+"\n"+
                        "Sueldo neto: "+sueldo_neto;
                txt_res.setText(msg);
            }
        });
    }
}

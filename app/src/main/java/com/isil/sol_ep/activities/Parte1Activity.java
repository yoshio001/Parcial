package com.isil.sol_ep.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.isil.sol_ep.R;

public class Parte1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte1);

        int n = 0;
        for (int i=100; i<=3500;i++){            //inicio de 100 hasta 3500
            if(i<500){                           //menor que 500
                if(i%11==0 && i%7!=0) n++;       //divisible a 11  y  no a 7
            }else{
                if(i%100==0 && i%17!=0) n++;     //divisible a 100  y no a 17
            }
        }

        Toast.makeText(this, "Suma total: "+n, Toast.LENGTH_LONG).show();
    }
}

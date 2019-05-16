package com.isil.sol_ep.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.isil.sol_ep.R;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.rg_partes);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Intent i = new Intent();
                switch (checkedId){
                    case R.id.rb_p1:
                        i = new Intent(MainActivity.this, Parte1Activity.class);
                        break;
                    case R.id.rb_p2:
                        i = new Intent(MainActivity.this, Parte2Activity.class);
                        break;
                    case R.id.rb_p3:
                        i = new Intent(MainActivity.this, Parte3Activity.class);
                        break;
                }
                startActivity(i);
            }
        });
    }
}

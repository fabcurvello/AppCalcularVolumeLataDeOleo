package com.example.appvolume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etRaio;
    EditText etAltura;
    Button btCalcular;
    TextView tvResultado;
    ImageView ivIcone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etRaio = findViewById(R.id.editTextRaio);
        etAltura = findViewById(R.id.editTextAltura);
        btCalcular = findViewById(R.id.buttonCalcular);
        tvResultado = findViewById(R.id.textViewResultado);
        ivIcone = findViewById(R.id.imageViewIcone);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v, r, h;
                r = Double.parseDouble(etRaio.getText().toString()) ;
                h = Double.parseDouble(etAltura.getText().toString()) ;

                v = Math.PI * Math.pow(r,2) * h;

                tvResultado.setText( "Volume: " + v );

                ivIcone.setImageResource(R.drawable.ok);

            }
        });

    }


}
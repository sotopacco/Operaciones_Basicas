package com.example.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSuma,btnResta,btnProducto,btnDiv,btnLimpiar;
    EditText txtNum1,txtNum2;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1=(EditText) findViewById(R.id.numero1);
        txtNum2=(EditText) findViewById(R.id.numero2);
        btnSuma=(Button) findViewById(R.id.btnsuma);
        btnResta=(Button) findViewById(R.id.btnresta);
        btnProducto=(Button) findViewById(R.id.btnproducto);
        btnDiv=(Button) findViewById(R.id.btndiv);
        btnLimpiar=(Button) findViewById(R.id.btnlimpiar);
        txtResultado=(TextView) findViewById(R.id.resultado);

        btnSuma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                double numero1=Double.parseDouble(txtNum1.getText().toString());
                double numero2=Double.parseDouble(txtNum2.getText().toString());
                double resultado=numero1+numero2;
                txtResultado.setText("El resultado es: "+resultado);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                double numero1=Double.parseDouble(txtNum1.getText().toString());
                double numero2=Double.parseDouble(txtNum2.getText().toString());
                double resultado=numero1-numero2;
                txtResultado.setText("El resultado es: "+resultado);
            }
        });

        btnProducto.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                double numero1=Double.parseDouble(txtNum1.getText().toString());
                double numero2=Double.parseDouble(txtNum2.getText().toString());
                double resultado=numero1*numero2;
                txtResultado.setText("El resultado es: "+resultado);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                double numero1=Double.parseDouble(txtNum1.getText().toString());
                double numero2=Double.parseDouble(txtNum2.getText().toString());
                double resultado=numero1/numero2;
                txtResultado.setText("El resultado es: "+resultado);
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                txtNum1.setText("");
                txtNum2.setText("");
                txtResultado.setText("");
            }
        });
    }
}
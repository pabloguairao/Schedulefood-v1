package com.proyecto.pablo.prototipo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class inicio extends AppCompatActivity {
    EditText usuario;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        usuario = (EditText) findViewById(R.id.txtUsuario);
        boton = (Button) findViewById(R.id.BtnIngresar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = ((EditText)findViewById(R.id.txtUsuario)).getText().toString();
                String pass = ((EditText)findViewById(R.id.txtPass)).getText().toString();
                if (user.equals("Pablo") && pass.equals("123456"))
                {
                    Intent nuevoForm = new Intent(inicio.this,abrirMenu.class);
                    startActivity(nuevoForm);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

package com.example.root.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        TextView usuario = (TextView) (findViewById(R.id.text_usuario));
        TextView clave = (TextView) (findViewById(R.id.text_clave));

        usuario.setText((String)getIntent().getExtras().get("dato1"));
        clave.setText((String)getIntent().getExtras().get("dato2"));

    }
}

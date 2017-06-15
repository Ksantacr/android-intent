package com.example.root.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enviar = (Button) findViewById(R.id.enviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarInfo();
            }
        });
    }

    public void enviarInfo(){

        Intent i = new Intent(this, AcercaDe.class);

        TextView u = (TextView) (findViewById(R.id.username));
        TextView p = (TextView) (findViewById(R.id.password));

        //Log.d("usuario: ", ""+u.getText());

        i.putExtra("dato1", ""+u.getText());
        i.putExtra("dato2", ""+p.getText());
        startActivity(i);
    }
}

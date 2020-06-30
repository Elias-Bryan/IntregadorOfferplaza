package pe.edu.tecsup.offerplaza.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pe.edu.tecsup.offerplaza.R;


public class Registro extends AppCompatActivity {

    TextView tv_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        tv_login=findViewById(R.id.tv_login);

        tv_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLog= new Intent(Registro.this, LoginActivity.class);
                Registro.this.startActivity(intentLog);

            }



        });
    }
}


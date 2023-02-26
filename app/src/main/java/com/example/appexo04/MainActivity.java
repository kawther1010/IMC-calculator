package com.example.appexo04;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    EditText editText1;
    EditText editText2;
    Button btn;
    TextView textView2;
    TextView textView3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1= findViewById(R.id.textView1);
        editText1= findViewById(R.id.editText1);
        editText2= findViewById(R.id.editText2);
        btn= findViewById(R.id.btn);
        textView2= findViewById(R.id.textView2);
        textView3= findViewById(R.id.textView3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable poids= editText1.getText();
                Editable taille= editText2.getText();
                float poidsNum = Float.parseFloat(String.valueOf(poids));
                float tailleNum = Float.parseFloat(String.valueOf(taille));
                float imc= (float) (poidsNum/ ((tailleNum*0.01)*(tailleNum*0.01)));
                String imcString= Float.toString(imc);
                textView3.setText(imcString);
            }
        });
    }
}
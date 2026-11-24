package com.example.egzaminnn;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText haslo;
    private EditText powhaslo;
    private EditText email;
    private Button zatwierdz;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        haslo = findViewById(R.id.haslo);
        powhaslo = findViewById(R.id.powhaslo);
        email = findViewById(R.id.email);
        zatwierdz = findViewById(R.id.zatwierdz);
        textview = findViewById(R.id.textview);

        zatwierdz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(!haslo.getText().toString().equals(powhaslo.getText().toString())){
                            textview.setText("Hasła się różnią!");
                        } else{
                            textview.setText("");
                        }


                    }
                }
        );


    }
}
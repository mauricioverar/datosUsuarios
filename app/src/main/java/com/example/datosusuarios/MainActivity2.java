package com.example.datosusuarios;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    //
    //private TextView Textv;
    TextView Textv;

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //
        Textv = findViewById(R.id.tv2);
        //Textv = findViewById(R.id.tv2);

        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        //String recuperamos_variable_string = getIntent().getStringExtra("variable_string");
        //Textv.setText(recuperamos_variable_string);


        if(b!=null)
        {
            String j =(String) b.get("variable_string");
            Textv.setText(j);
        }
        //
        // String recuperamos_variable_string = getIntent().getStringExtra("variable_string");
        //
    }
}
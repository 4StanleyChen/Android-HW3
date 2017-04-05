package com.example.anley.hw3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class Sayhello extends AppCompatActivity {
    private EditText name;
    public static String NAME = "NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayhello);
        name = (EditText)findViewById(R.id.NameIn);
        Button ba = (Button)findViewById(R.id.B);
        ba.setOnClickListener(Back);
        Intent intent = getIntent();
    }

    private OnClickListener Back = new OnClickListener() {
        @Override
        public void onClick(View v) {
            String na = name.getText().toString();
            Intent intent = new Intent();
            intent = intent.putExtra(NAME, na);
            setResult(RESULT_OK, intent);
            finish();
        }
    };

}

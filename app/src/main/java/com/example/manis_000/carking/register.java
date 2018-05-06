package com.example.manis_000.carking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.io.OutputStream;

public class register extends AppCompatActivity {

    Button  reg;
    EditText name,phone_no,pass_word,license;
    String command;
    private OutputStream outputStream ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        reg=(Button) findViewById(R.id.btn_register);
        name=(EditText) findViewById(R.id.etname);
        phone_no=(EditText) findViewById(R.id.et_phone);
        pass_word=(EditText) findViewById(R.id.et_password);
        license=(EditText) findViewById(R.id.etlicense);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                command= "t";
                try
                {
                    outputStream.write(command.getBytes());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

                Intent intent=new Intent(register.this,login.class);
                startActivity(intent);
            }
        });
    }


}

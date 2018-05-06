package com.example.manis_000.carking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.io.OutputStream;

import java.io.IOException;

public class login extends AppCompatActivity {

    Button next,log_in;
    EditText phone,pass;
    String command;
    private OutputStream outputStream;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        next=(Button) findViewById(R.id.btnnext);
        log_in=(Button) findViewById(R.id.btn_login);
        phone= (EditText) findViewById(R.id.et_phone);
        pass= (EditText) findViewById(R.id.etpwd);

        next.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                    log_in.setVisibility(View.VISIBLE);
                    pass.setVisibility(View.VISIBLE);
                    command = phone.getText().toString();
                        try
                        {
                            outputStream.write(command.getBytes());
                        }
                        catch (IOException e)
                        {
                            e.printStackTrace();
                        }
                    }



                    //recieve data from arduino , accordingly, do further processes based on 0 or 1
            //if 0--- empty the fields and a toast saying incorrect details
            // if1-- accounts home page
            }
        );
    }


}

package com.example.expanrr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginOrRegister extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button login;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_register);

        Email=findViewById(R.id.EtE);
        Password=findViewById(R.id.ETpass);
        login=findViewById(R.id.btnlog);
        register=findViewById(R.id.btnReg);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Email.getText().toString().isEmpty()||Password.getText().toString().isEmpty())
                {
                    Toast.makeText(LoginOrRegister.this,"Fill in all fields",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(LoginOrRegister.this,"Login Successful",Toast.LENGTH_SHORT).show();

                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Email.getText().toString().isEmpty()||Password.getText().toString().isEmpty())
                {
                    Toast.makeText(LoginOrRegister.this,"Fill in all fields",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(LoginOrRegister.this,"Registration Successful",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }



}
